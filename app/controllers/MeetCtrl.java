package controllers;

import controllers.actions.httpHeaders.CORSimplAction;
import com.google.inject.Inject;
import controllers.actions.credentials.CredentialsCheckerAction;
import controllers.actions.httpHeaders.CacheControlAction;
import models.meet.*;
import org.myweb.services.ServiceException;
import org.myweb.services.crud.get.GetServiceRest;
import org.myweb.services.crud.query.QueryServiceRest;
import play.db.jpa.Transactional;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.With;
import org.myweb.services.meet.*;

@With({CacheControlAction.class, CORSimplAction.class, CredentialsCheckerAction.class})
public class MeetCtrl extends Controller {

    @Inject
    private GetServiceRest getServiceRest;
    @Inject
    private QueryServiceRest queryServiceRest;
    @Inject
    private QueryMeetByIsUsingServiceRest queryMeetByIsUsingServiceRest;

    @Transactional(readOnly = true)
    public Result get(Long id) throws ServiceException {
        return getServiceRest.get(LcMeet.class, id).buildPlayCtrlResult();
    }

    @Transactional(readOnly = true)
    public Result query(){
        return queryServiceRest.query(LcMeet.class).buildPlayCtrlResult();
    }
    @Transactional(readOnly = true)
    public Result query(Integer page, Integer perPage, String isUsing) throws ServiceException {

        JavaServiceResult jsr = queryMeetByIsUsingServiceRest.count(LcMeet.class, isUsing);
        if(jsr.getHttpStatus() != OK) {
            return internalServerError();
        }

        int count = jsr.getCount();
        response().setHeader("X-Total-Count", String.valueOf(count));

        return queryMeetByIsUsingServiceRest.load(LcMeet.class, page, perPage, isUsing).buildPlayCtrlResult();
    }
}
