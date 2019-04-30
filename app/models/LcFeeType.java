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
public class LcFeeType extends DaoObject {

  private long meetId;
  private String code;
  private double money;
  private String title;
  private String remark;
  private java.sql.Timestamp dateStart;
  private java.sql.Timestamp dateEnd;
  private long isUsing;
  private long isDel;
  private java.sql.Timestamp dateCreate;
  private java.sql.Timestamp dateUpdate;

  public long getMeetId() {
    return meetId;
  }

  public void setMeetId(long meetId) {
    this.meetId = meetId;
  }


  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }


  public double getMoney() {
    return money;
  }

  public void setMoney(double money) {
    this.money = money;
  }


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }


  public java.sql.Timestamp getDateStart() {
    return dateStart;
  }

  public void setDateStart(java.sql.Timestamp dateStart) {
    this.dateStart = dateStart;
  }


  public java.sql.Timestamp getDateEnd() {
    return dateEnd;
  }

  public void setDateEnd(java.sql.Timestamp dateEnd) {
    this.dateEnd = dateEnd;
  }


  public long getIsUsing() {
    return isUsing;
  }

  public void setIsUsing(long isUsing) {
    this.isUsing = isUsing;
  }


  public long getIsDel() {
    return isDel;
  }

  public void setIsDel(long isDel) {
    this.isDel = isDel;
  }


  public java.sql.Timestamp getDateCreate() {
    return dateCreate;
  }

  public void setDateCreate(java.sql.Timestamp dateCreate) {
    this.dateCreate = dateCreate;
  }


  public java.sql.Timestamp getDateUpdate() {
    return dateUpdate;
  }

  public void setDateUpdate(java.sql.Timestamp dateUpdate) {
    this.dateUpdate = dateUpdate;
  }

}
