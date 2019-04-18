package org.myweb.services.meet;

import com.google.inject.Inject;
import org.jetbrains.annotations.NotNull;
import org.myweb.db.Dao;
import org.myweb.db.DaoException;
import org.myweb.db.DaoObject;
import org.myweb.services.JavaServiceResult;
import org.myweb.services.ServiceException;
import play.i18n.Messages;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static play.mvc.Http.Status.BAD_REQUEST;
import static play.mvc.Http.Status.NO_CONTENT;
import static play.mvc.Http.Status.OK;

public class QueryMeetByIsUsingServiceJavaImpl implements QueryMeetByIsUsingServiceJava {

    private final Dao dao;

    @Inject
    public QueryMeetByIsUsingServiceJavaImpl(Dao dao) {
        this.dao = dao;
    }

    @NotNull
    @Override
    public JavaServiceResult load(
            @NotNull Class<? extends DaoObject> clazz, int page, int itemPerPage, @NotNull String isUsing
    ) throws ServiceException {

        List<? extends DaoObject> entityList;

        Map<String, Object> params = new HashMap<>();
        params.put("isUsing", isUsing);

        try {
            entityList = dao.namedQueryWithPagination("Meet.findByIsUsing", clazz, params, page, itemPerPage);
        } catch (DaoException e) {
            throw new ServiceException(
                    QueryMeetByIsUsingServiceJavaImpl.class.getName(), BAD_REQUEST, e.getMessage(), e,
                    Messages.get("global.malformed.request")
            );
        }

        if(entityList == null || entityList.size() == 0) {
            return JavaServiceResult.buildServiceResult(NO_CONTENT);
        } else {
            return JavaServiceResult.buildServiceResult(OK, entityList);
        }
    }

    @NotNull
    @Override
    public JavaServiceResult count(
            @NotNull Class<? extends DaoObject> clazz, @NotNull String isUsing
    ) {
        int count;

        Map<String, Object> params = new HashMap<>();
        params.put("isUsing", isUsing);

        count = dao.namedQueryCount("Meet.countFindByIsUsing", clazz, params);

        return JavaServiceResult.buildServiceResult(OK, count);
    }
}
