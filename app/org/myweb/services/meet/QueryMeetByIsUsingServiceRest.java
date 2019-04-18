package org.myweb.services.meet;

import org.jetbrains.annotations.NotNull;
import org.myweb.db.DaoObject;
import org.myweb.services.RestServiceResult;
import org.myweb.services.ServiceException;

public interface QueryMeetByIsUsingServiceRest {
    @NotNull
    public RestServiceResult load(
            @NotNull Class<? extends DaoObject> clazz, int page, int itemPerPage,
            @NotNull String isUsing
    ) throws ServiceException;
}
