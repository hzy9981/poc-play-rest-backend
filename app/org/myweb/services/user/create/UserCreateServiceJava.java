package org.myweb.services.user.create;

import models.user.LcUser;
import org.jetbrains.annotations.NotNull;
import org.myweb.services.JavaServiceResult;
import org.myweb.services.ServiceException;

public interface UserCreateServiceJava {
    @NotNull
    public JavaServiceResult createUser(@NotNull LcUser user) throws ServiceException;
}
