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
public class LcUserHotel extends DaoObject{

  private long userId;
  private long roomId;
  private long meetId;
  private long hotelId;
  private java.sql.Timestamp dateIn;
  private long morningIn;
  private java.sql.Timestamp dateOut;
  private long morningOut;
  private long cntBed;
  private long isAlone;
  private java.sql.Timestamp dateCreate;
  private java.sql.Timestamp dateUpdate;
  private String remark;

  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }


  public long getRoomId() {
    return roomId;
  }

  public void setRoomId(long roomId) {
    this.roomId = roomId;
  }


  public long getMeetId() {
    return meetId;
  }

  public void setMeetId(long meetId) {
    this.meetId = meetId;
  }


  public long getHotelId() {
    return hotelId;
  }

  public void setHotelId(long hotelId) {
    this.hotelId = hotelId;
  }


  public java.sql.Timestamp getDateIn() {
    return dateIn;
  }

  public void setDateIn(java.sql.Timestamp dateIn) {
    this.dateIn = dateIn;
  }


  public long getMorningIn() {
    return morningIn;
  }

  public void setMorningIn(long morningIn) {
    this.morningIn = morningIn;
  }


  public java.sql.Timestamp getDateOut() {
    return dateOut;
  }

  public void setDateOut(java.sql.Timestamp dateOut) {
    this.dateOut = dateOut;
  }


  public long getMorningOut() {
    return morningOut;
  }

  public void setMorningOut(long morningOut) {
    this.morningOut = morningOut;
  }


  public long getCntBed() {
    return cntBed;
  }

  public void setCntBed(long cntBed) {
    this.cntBed = cntBed;
  }


  public long getIsAlone() {
    return isAlone;
  }

  public void setIsAlone(long isAlone) {
    this.isAlone = isAlone;
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


  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }

}
