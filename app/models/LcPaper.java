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
public class LcPaper extends DaoObject{

  private long userId;
  private long meetId;
  private long feeId;
  private long trackId;
  private String code;
  private String title;
  private String author;
  private String showStyle;
  private String fileFull;
  private String fileAbs;
  private String keyword;
  private String textAbs;
  private String firstResult;
  private String firstMsg;
  private long firstUserId;
  private String secondResult;
  private String secondMsg;
  private long sendUserId;
  private String finalResult;
  private String finalMsg;
  private long finalAdmId;
  private long isDel;
  private java.sql.Timestamp dateCreate;
  private java.sql.Timestamp dateUpdate;

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


  public long getFeeId() {
    return feeId;
  }

  public void setFeeId(long feeId) {
    this.feeId = feeId;
  }


  public long getTrackId() {
    return trackId;
  }

  public void setTrackId(long trackId) {
    this.trackId = trackId;
  }


  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }


  public String getShowStyle() {
    return showStyle;
  }

  public void setShowStyle(String showStyle) {
    this.showStyle = showStyle;
  }


  public String getFileFull() {
    return fileFull;
  }

  public void setFileFull(String fileFull) {
    this.fileFull = fileFull;
  }


  public String getFileAbs() {
    return fileAbs;
  }

  public void setFileAbs(String fileAbs) {
    this.fileAbs = fileAbs;
  }


  public String getKeyword() {
    return keyword;
  }

  public void setKeyword(String keyword) {
    this.keyword = keyword;
  }


  public String getTextAbs() {
    return textAbs;
  }

  public void setTextAbs(String textAbs) {
    this.textAbs = textAbs;
  }


  public String getFirstResult() {
    return firstResult;
  }

  public void setFirstResult(String firstResult) {
    this.firstResult = firstResult;
  }


  public String getFirstMsg() {
    return firstMsg;
  }

  public void setFirstMsg(String firstMsg) {
    this.firstMsg = firstMsg;
  }


  public long getFirstUserId() {
    return firstUserId;
  }

  public void setFirstUserId(long firstUserId) {
    this.firstUserId = firstUserId;
  }


  public String getSecondResult() {
    return secondResult;
  }

  public void setSecondResult(String secondResult) {
    this.secondResult = secondResult;
  }


  public String getSecondMsg() {
    return secondMsg;
  }

  public void setSecondMsg(String secondMsg) {
    this.secondMsg = secondMsg;
  }


  public long getSendUserId() {
    return sendUserId;
  }

  public void setSendUserId(long sendUserId) {
    this.sendUserId = sendUserId;
  }


  public String getFinalResult() {
    return finalResult;
  }

  public void setFinalResult(String finalResult) {
    this.finalResult = finalResult;
  }


  public String getFinalMsg() {
    return finalMsg;
  }

  public void setFinalMsg(String finalMsg) {
    this.finalMsg = finalMsg;
  }


  public long getFinalAdmId() {
    return finalAdmId;
  }

  public void setFinalAdmId(long finalAdmId) {
    this.finalAdmId = finalAdmId;
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
