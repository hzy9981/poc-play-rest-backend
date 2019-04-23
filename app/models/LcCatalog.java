package models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.google.inject.Inject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.myweb.db.DaoObject;
import play.data.validation.Constraints;
import javax.persistence.Entity;

@SuppressWarnings({"UnusedDeclaration", "JpaQlInspection"})
@Entity
public class LcCatalog extends DaoObject {
    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    private String pid;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    private String code;


    public String getIsUsing() {
        return isUsing;
    }

    public void setIsUsing(String isUsing) {
        this.isUsing = isUsing;
    }


    private String isUsing;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    private String title;

    public String getOdr() {
        return odr;
    }

    public void setOdr(String odr) {
        this.odr = odr;
    }

    private String odr;


    public LcCatalog() {

    }

}
