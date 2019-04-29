package models;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.myweb.db.DaoObject;
import play.data.validation.Constraints;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@SuppressWarnings({"UnusedDeclaration"})
@Entity
@NamedQueries({
        @NamedQuery(
                name = "MeetNow.findByUserId",
                query = "SELECT mn FROM MeetNow mn "
        ),
        @NamedQuery(
                name = "MeetNow.countFindByUserId",
                query = "SELECT COUNT(mn) FROM MeetNow mn "
        )
})
public class MeetNow extends DaoObject {

    private String dateStart;
    private String dateEnd;
    private String pic;

    public String getDateStart() {
        return dateStart;
    }

    public void setDateStart(String dateStart) {
        this.dateStart = dateStart;
    }

    public String getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(String dateEnd) {
        this.dateEnd = dateEnd;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    private	String	userId;
    private	String	meetId;

    private	String	userType;
    private	String	isJoin;
    private	String	isFee;
    private	String	isRec;
    private	String	isFiles;
    private	String	isPpt;
    private	String	title;
    private	String	titleAbs;
    private	String	isRunning;
    private	String	pubYear;
    private	String	pubMonth;
    private	String	city;
    private	String	tplId;
    private	String	qrCode;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getMeetId() {
        return meetId;
    }

    public void setMeetId(String meetId) {
        this.meetId = meetId;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getIsJoin() {
        return isJoin;
    }

    public void setIsJoin(String isJoin) {
        this.isJoin = isJoin;
    }

    public String getIsFee() {
        return isFee;
    }

    public void setIsFee(String isFee) {
        this.isFee = isFee;
    }

    public String getIsRec() {
        return isRec;
    }

    public void setIsRec(String isRec) {
        this.isRec = isRec;
    }

    public String getIsFiles() {
        return isFiles;
    }

    public void setIsFiles(String isFiles) {
        this.isFiles = isFiles;
    }

    public String getIsPpt() {
        return isPpt;
    }

    public void setIsPpt(String isPpt) {
        this.isPpt = isPpt;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitleAbs() {
        return titleAbs;
    }

    public void setTitleAbs(String titleAbs) {
        this.titleAbs = titleAbs;
    }

    public String getIsRunning() {
        return isRunning;
    }

    public void setIsRunning(String isRunning) {
        this.isRunning = isRunning;
    }

    public String getPubYear() {
        return pubYear;
    }

    public void setPubYear(String pubYear) {
        this.pubYear = pubYear;
    }

    public String getPubMonth() {
        return pubMonth;
    }

    public void setPubMonth(String pubMonth) {
        this.pubMonth = pubMonth;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTplId() {
        return tplId;
    }

    public void setTplId(String tplId) {
        this.tplId = tplId;
    }

    public String getQrCode() {
        return qrCode;
    }

    public void setQrCode(String qrCode) {
        this.qrCode = qrCode;
    }

    public MeetNow() {
    }

}
