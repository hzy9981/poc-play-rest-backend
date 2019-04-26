package controllers;

import controllers.actions.httpHeaders.CORSimplAction;
import com.google.inject.Inject;
import controllers.actions.credentials.CredentialsCheckerAction;
import controllers.actions.httpHeaders.CacheControlAction;
import models.meet.LcArticle;
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
public class ArticleCtrl extends Controller {

    @Inject
    private GetServiceJava getServiceJava;
    @Inject
    private GetServiceRest getServiceRest;
    @Inject
    private QueryServiceRest queryServiceRest;
    @Inject
    private UpdateServiceRest updateServiceRest;
    @Inject
    private CreateServiceRest createServiceRest;
    @Inject
    private DeleteServiceRest deleteServiceRest;
//
//    @Transactional(readOnly = true)
//    public Result get(Long id) throws ServiceException {
//        return getServiceRest.get( Org.class, id ).buildPlayCtrlResult();
//    }
//
    @Transactional(readOnly = true)
    public Result query(Integer page, Integer perPage, String filters) throws ServiceException {

        JavaServiceResult jsr = getServiceJava.count(LcArticle.class, filters);
        if(jsr.getHttpStatus() != OK) {
            return internalServerError();
        }

        int count = jsr.getCount();
        response().setHeader("X-Total-Count", String.valueOf(count));

        return queryServiceRest.query( LcArticle.class, page, perPage, filters ).buildPlayCtrlResult();
    }

//    @Transactional(readOnly = false)
//    public Result update(Long id) throws ServiceException {
//        return updateServiceRest.update( Org.class, request().body().asJson(), id ).buildPlayCtrlResult();
//    }
//
//    @Transactional(readOnly = false)
//    public Result create() throws ServiceException {
//        return createServiceRest.create( Org.class, request().body().asJson() ).buildPlayCtrlResult();
//    }
//
//    @Transactional(readOnly = false)
//    public Result delete(Long id) throws ServiceException {
//        return deleteServiceRest.delete( Org.class, id ).buildPlayCtrlResult();
//    }
}
