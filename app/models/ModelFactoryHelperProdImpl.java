package models;

import com.google.inject.Guice;
import com.google.inject.Injector;
import models.user.LcUser;
import models.user.UserSecurityModule;
import org.jetbrains.annotations.NotNull;

public class ModelFactoryHelperProdImpl implements ModelFactoryHelper {

    @NotNull
    public LcUser userFactory(Long id, String login, String newPassword, String confirmPassword, String email) {

        Injector injector = Guice.createInjector(new UserSecurityModule());
       LcUser user = injector.getInstance(LcUser.class);
//        LcUser user = new LcUser();
        user.setId(id);
        user.setLogin(login);
        user.setMobile(login);
        user.setNewPassword(newPassword);
        user.setConfirmPassword(confirmPassword);
        user.setEmail(email);

        return user;
    }
}
