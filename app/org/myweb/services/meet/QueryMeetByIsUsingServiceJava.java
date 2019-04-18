package org.myweb.services.meet;

import org.jetbrains.annotations.NotNull;
import org.myweb.db.DaoObject;
import org.myweb.services.JavaServiceResult;
import org.myweb.services.ServiceException;

public interface QueryMeetByIsUsingServiceJava {
    @NotNull
    public JavaServiceResult load(
            @NotNull Class<? extends DaoObject> clazz, int page, int itemPerPage,
            @NotNull String isUsing
    ) throws ServiceException;

    @NotNull
    public JavaServiceResult count(
            @NotNull Class<? extends DaoObject> clazz, @NotNull String isUsing
    );
}
