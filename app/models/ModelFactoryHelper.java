package models;

import models.user.LcUser;
import org.jetbrains.annotations.NotNull;

public interface ModelFactoryHelper {

    @NotNull
    public LcUser userFactory(Long id, String mobile, String newPassword, String confirmPassword, String email);

}
