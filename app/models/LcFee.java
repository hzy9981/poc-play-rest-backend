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
public class LcFee extends DaoObject{

  private long userId;
  private long meetId;
  private String dingdan;
  private double money;
  private String way;
  private String code;
  private java.sql.Timestamp dateCreate;
  private java.sql.Timestamp dateAuth;
  private String billName;
  private String billOrgan;
  private String billCode;
  private String pdfUrl;
  private String pdfCode;
  private long isFee;
  private long isPosIvo;
  private String remark;
  private long isDel;


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


  public String getDingdan() {
    return dingdan;
  }

  public void setDingdan(String dingdan) {
    this.dingdan = dingdan;
  }


  public double getMoney() {
    return money;
  }

  public void setMoney(double money) {
    this.money = money;
  }


  public String getWay() {
    return way;
  }

  public void setWay(String way) {
    this.way = way;
  }


  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }


  public java.sql.Timestamp getDateCreate() {
    return dateCreate;
  }

  public void setDateCreate(java.sql.Timestamp dateCreate) {
    this.dateCreate = dateCreate;
  }


  public java.sql.Timestamp getDateAuth() {
    return dateAuth;
  }

  public void setDateAuth(java.sql.Timestamp dateAuth) {
    this.dateAuth = dateAuth;
  }


  public String getBillName() {
    return billName;
  }

  public void setBillName(String billName) {
    this.billName = billName;
  }


  public String getBillOrgan() {
    return billOrgan;
  }

  public void setBillOrgan(String billOrgan) {
    this.billOrgan = billOrgan;
  }


  public String getBillCode() {
    return billCode;
  }

  public void setBillCode(String billCode) {
    this.billCode = billCode;
  }


  public String getPdfUrl() {
    return pdfUrl;
  }

  public void setPdfUrl(String pdfUrl) {
    this.pdfUrl = pdfUrl;
  }


  public String getPdfCode() {
    return pdfCode;
  }

  public void setPdfCode(String pdfCode) {
    this.pdfCode = pdfCode;
  }


  public long getIsFee() {
    return isFee;
  }

  public void setIsFee(long isFee) {
    this.isFee = isFee;
  }


  public long getIsPosIvo() {
    return isPosIvo;
  }

  public void setIsPosIvo(long isPosIvo) {
    this.isPosIvo = isPosIvo;
  }


  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }


  public long getIsDel() {
    return isDel;
  }

  public void setIsDel(long isDel) {
    this.isDel = isDel;
  }

}
