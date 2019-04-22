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
public class LcArticle extends DaoObject {
    public String getMeetId() {
        return meetId;
    }

    public void setMeetId(String meetId) {
        this.meetId = meetId;
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


    public String getIsDel() {
        return isDel;
    }

    public void setIsDel(String isDel) {
        this.isDel = isDel;
    }

    public String getShortPath() {
        return shortPath;
    }

    public void setShortPath(String shortPath) {
        this.shortPath = shortPath;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getIsPub() {
        return isPub;
    }

    public void setIsPub(String isPub) {
        this.isPub = isPub;
    }

    public String getIsTop() {
        return isTop;
    }

    public void setIsTop(String isTop) {
        this.isTop = isTop;
    }

    public String getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(String dateCreate) {
        this.dateCreate = dateCreate;
    }

    public String getDateUpdate() {
        return dateUpdate;
    }

    public void setDateUpdate(String dateUpdate) {
        this.dateUpdate = dateUpdate;
    }

    public String getDatePublish() {
        return datePublish;
    }

    public void setDatePublish(String datePublish) {
        this.datePublish = datePublish;
    }

    private String meetId;
    private String catId;
        private String title;
        private String shortPath;
        private String content;
        private String thumbnail;
        private String from;
        private String remark;
        private String isUsing;
        private String isPub;
        private String isTop;
    private String dateCreate;
    private String dateUpdate;
    private String datePublish;
    private String isDel;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

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
    public String getTilte() {
        return title;
    }

    public void setTilte(@NotNull String title) {
        this.title = title;
    }

    public LcArticle() {

    }

}
