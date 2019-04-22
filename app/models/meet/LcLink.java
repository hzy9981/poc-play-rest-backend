package models.meet;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.google.inject.Inject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.myweb.db.DaoObject;
import play.data.validation.Constraints;
import javax.persistence.Entity;

@SuppressWarnings({"UnusedDeclaration", "JpaQlInspection"})
@Entity
public class LcLink extends DaoObject {
    public String getMeetId() {
        return meetId;
    }

    public void setMeetId(String meetId) {
        this.meetId = meetId;
    }

    public String getOdr() {
        return odr;
    }

    public void setOdr(String odr) {
        this.odr = odr;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public String getIsDel() {
        return isDel;
    }

    public void setIsDel(String isDel) {
        this.isDel = isDel;
    }

    private String meetId;
    private String catId;
        private String isUsing;
        private String odr;
        private String remark;
        private String title;
    private String url;
    private String pic;
    private String target;
    private String isDel;

    public String getCatId() {
        return catId;
    }

    public void setCatId(String catId) {
        this.catId = catId;
    }

    public String getIsUsing() {
        return isUsing;
    }

    public void setIsUsing(String isUsing) {
        this.isUsing = isUsing;
    }



    @NotNull
        public String getUrl() {
        return url;
        }

        public void setUrl(@NotNull String url) {
        this.url = url;
        }

    @Nullable
    public String getPic() {
            return pic;
            }

    public void setPic(@Nullable String pic) {
            this.pic = pic;
            }

        @NotNull
    public String getTilte() {
        return title;
    }

    public void setTilte(@NotNull String title) {
        this.title = title;
    }

    public LcLink() {

    }

}
