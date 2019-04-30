package models;

import java.util.*;
import org.jetbrains.annotations.Nullable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import org.jetbrains.annotations.NotNull;
import org.myweb.db.DaoObject;
import play.data.validation.Constraints;

import javax.persistence.Entity;

@SuppressWarnings("UnusedDeclaration")
@Entity
public class LcUserMeet extends DaoObject{

  private long userId;
  private long meetId;
  private String userType;
  private long isJoin;
  private long isFee;
  private long isRec;
  private long isFiles;
  private long isPpt;
  private String remark;


  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }


  public long getMeetId() {
    return meetId;
  }

  public void setMeetId(long meetId) {
    this.meetId = meetId;
  }


  public String getUserType() {
    return userType;
  }

  public void setUserType(String userType) {
    this.userType = userType;
  }


  public long getIsJoin() {
    return isJoin;
  }

  public void setIsJoin(long isJoin) {
    this.isJoin = isJoin;
  }


  public long getIsFee() {
    return isFee;
  }

  public void setIsFee(long isFee) {
    this.isFee = isFee;
  }


  public long getIsRec() {
    return isRec;
  }

  public void setIsRec(long isRec) {
    this.isRec = isRec;
  }


  public long getIsFiles() {
    return isFiles;
  }

  public void setIsFiles(long isFiles) {
    this.isFiles = isFiles;
  }


  public long getIsPpt() {
    return isPpt;
  }

  public void setIsPpt(long isPpt) {
    this.isPpt = isPpt;
  }


  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }

}
