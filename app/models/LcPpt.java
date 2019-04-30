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
public class LcPpt extends DaoObject{

  private long meetId;
  private long userId;
  private String title;
  private String ppt;
  private long isUsing;
  private long isDel;
  private java.sql.Timestamp dateCreate;
  private java.sql.Timestamp dateUpdate;
  private long isOpen;


  public long getMeetId() {
    return meetId;
  }

  public void setMeetId(long meetId) {
    this.meetId = meetId;
  }


  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public String getPpt() {
    return ppt;
  }

  public void setPpt(String ppt) {
    this.ppt = ppt;
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


  public long getIsOpen() {
    return isOpen;
  }

  public void setIsOpen(long isOpen) {
    this.isOpen = isOpen;
  }

}
