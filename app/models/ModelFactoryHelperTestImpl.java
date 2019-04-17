package models;

import com.google.inject.Guice;
import com.google.inject.Injector;
import models.user.LcUser;
import models.user.UserSecurityMockedModule;
import org.jetbrains.annotations.NotNull;

public class ModelFactoryHelperTestImpl implements ModelFactoryHelper {

    @NotNull
    public LcUser userFactory(Long id, String login, String newPassword, String confirmPassword, String email) {

        Injector injector = Guice.createInjector(new UserSecurityMockedModule());
        LcUser user = injector.getInstance(LcUser.class);

        user.setId(id);
        user.setMobile(login);
        user.setNewPassword(newPassword);
        user.setConfirmPassword(confirmPassword);
        user.setEmail(email);

        return user;
    }
}
