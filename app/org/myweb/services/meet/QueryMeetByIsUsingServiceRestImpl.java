package org.myweb.services.meet;

import com.google.inject.Inject;
import org.jetbrains.annotations.NotNull;
import org.myweb.db.DaoObject;
import org.myweb.services.JavaServiceResult;
import org.myweb.services.RestServiceResult;
import org.myweb.services.ServiceException;
import play.libs.Json;

import static play.mvc.Http.Status.NO_CONTENT;
import static play.mvc.Http.Status.OK;

public class QueryMeetByIsUsingServiceRestImpl implements QueryMeetByIsUsingServiceRest {

    private final QueryMeetByIsUsingServiceJava queryMeetByIsUsingServiceJava;

    @Inject
    public QueryMeetByIsUsingServiceRestImpl(QueryMeetByIsUsingServiceJava queryMeetByIsUsingServiceJava) {
        this.queryMeetByIsUsingServiceJava = queryMeetByIsUsingServiceJava;
    }

    @NotNull
    @Override
    public RestServiceResult load(
            @NotNull Class<? extends DaoObject> clazz, int page, int itemPerPage, @NotNull String title
    ) throws ServiceException {

        JavaServiceResult jsr = queryMeetByIsUsingServiceJava.load(clazz, page, itemPerPage, title);

        if(jsr.getHttpStatus() == NO_CONTENT) {
            return RestServiceResult.buildServiceResult(NO_CONTENT);
        }

        return RestServiceResult.buildServiceResult(OK, Json.toJson(jsr.getListContent()));
    }
}
