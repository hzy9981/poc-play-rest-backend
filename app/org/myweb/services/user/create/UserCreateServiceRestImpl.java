package org.myweb.services.user.create;

import com.fasterxml.jackson.databind.JsonNode;
import com.google.inject.Inject;
import models.ModelFactoryHelper;
import models.user.LcUser;
import org.jetbrains.annotations.NotNull;
import org.myweb.services.JavaServiceResult;
import org.myweb.services.RestServiceResult;
import org.myweb.services.ServiceException;
import play.data.Form;
import play.i18n.Messages;
import play.libs.Json;

import static play.mvc.Http.Status.BAD_REQUEST;
import static play.mvc.Http.Status.CREATED;

public class UserCreateServiceRestImpl implements UserCreateServiceRest {

    private final UserCreateServiceJava userCreateServiceJava;
    private final ModelFactoryHelper modelFactoryHelper;

    @Inject
    public UserCreateServiceRestImpl(UserCreateServiceJava userCreateServiceJava, ModelFactoryHelper modelFactoryHelper) {
        this.userCreateServiceJava = userCreateServiceJava;
        this.modelFactoryHelper = modelFactoryHelper;
    }

    @NotNull
    @Override
    public RestServiceResult createUser(@NotNull JsonNode jsContent) throws ServiceException {

        Form<LcUser> userForm = Form.form(LcUser.class);
        userForm = userForm.bind(jsContent);

        if(userForm.hasErrors()) {

            throw new ServiceException(
                    UserCreateServiceRestImpl.class.getName(), BAD_REQUEST, userForm.errorsAsJson().asText(),
                    Messages.get("global.malformed.request"), userForm.errorsAsJson());

        } else {
            LcUser formUser = userForm.bind(jsContent).get();

            LcUser newUser = modelFactoryHelper.userFactory(
                    null, formUser.getLogin(), formUser.getNewPassword(),
                    formUser.getConfirmPassword(), formUser.getEmail()
            );

            JavaServiceResult res = userCreateServiceJava.createUser(newUser);

            newUser = (LcUser) res.getSingleContent();
            assert newUser != null;
            newUser.setNewPassword(null);
            newUser.setConfirmPassword(null);

            return RestServiceResult.buildServiceResult(CREATED, Json.toJson(newUser));
        }

    }
}
