package controllers;

import com.google.inject.Inject;
import controllers.actions.credentials.CredentialsCheckerAction;
import controllers.actions.httpHeaders.CORSimplAction;
import controllers.actions.httpHeaders.CacheControlAction;
import models.MeetNow;
import controllers.actions.httpHeaders.CORSimplAction;
import com.google.inject.Inject;
import controllers.actions.credentials.CredentialsCheckerAction;
import controllers.actions.httpHeaders.CacheControlAction;
import org.myweb.services.JavaServiceResult;
import org.myweb.services.ServiceException;
import org.myweb.services.crud.create.CreateServiceRest;
import org.myweb.services.crud.delete.DeleteServiceRest;
import org.myweb.services.crud.get.GetServiceJava;
import org.myweb.services.crud.get.GetServiceRest;
import org.myweb.services.crud.query.QueryServiceRest;
import org.myweb.services.crud.update.UpdateServiceRest;
import play.db.jpa.Transactional;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.With;

@With({CacheControlAction.class, CORSimplAction.class})
public class MeetNowByUserIdCtrl extends Controller {

    @Inject
    private GetServiceJava getServiceJava;
    @Inject
    private GetServiceRest getServiceRest;
    @Inject
    private QueryServiceRest queryServiceRest;

    @Transactional(readOnly = true)
    public Result get(Long id) throws ServiceException {
        return getServiceRest.get(MeetNow.class, id).buildPlayCtrlResult();
    }

    @Transactional(readOnly = true)
    public Result query(){
        return queryServiceRest.query(MeetNow.class).buildPlayCtrlResult();
    }

    @Transactional(readOnly = true)
    public Result query(Integer page, Integer perPage, String filters) throws ServiceException {

//        JavaServiceResult jsr = getServiceJava.count(LcMeet.class, filters);
//        if(jsr.getHttpStatus() != OK) {
//            return internalServerError();
//        }
//
//        int count = jsr.getCount();
        response().setHeader("X-Total-Count", String.valueOf(2));

        return queryServiceRest.query( MeetNow.class, page, perPage, filters ).buildPlayCtrlResult();
    }
}