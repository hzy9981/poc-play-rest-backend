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

public class LcHotel extends DaoObject{

  private String title;
  private String addr;
  private String tel;
  private String fax;
  private String linkman;
  private String mobile;
  private String starts;
  private String urlWeb;
  private String urlOrder;
  private String urlQuery;
  private long isSysOrder;
  private java.sql.Timestamp dateCreate;
  private java.sql.Timestamp dateUpdate;
  private long isUsing;
  private long isDel;
  private String remark;


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public String getAddr() {
    return addr;
  }

  public void setAddr(String addr) {
    this.addr = addr;
  }


  public String getTel() {
    return tel;
  }

  public void setTel(String tel) {
    this.tel = tel;
  }


  public String getFax() {
    return fax;
  }

  public void setFax(String fax) {
    this.fax = fax;
  }


  public String getLinkman() {
    return linkman;
  }

  public void setLinkman(String linkman) {
    this.linkman = linkman;
  }


  public String getMobile() {
    return mobile;
  }

  public void setMobile(String mobile) {
    this.mobile = mobile;
  }


  public String getStarts() {
    return starts;
  }

  public void setStarts(String starts) {
    this.starts = starts;
  }


  public String getUrlWeb() {
    return urlWeb;
  }

  public void setUrlWeb(String urlWeb) {
    this.urlWeb = urlWeb;
  }


  public String getUrlOrder() {
    return urlOrder;
  }

  public void setUrlOrder(String urlOrder) {
    this.urlOrder = urlOrder;
  }


  public String getUrlQuery() {
    return urlQuery;
  }

  public void setUrlQuery(String urlQuery) {
    this.urlQuery = urlQuery;
  }


  public long getIsSysOrder() {
    return isSysOrder;
  }

  public void setIsSysOrder(long isSysOrder) {
    this.isSysOrder = isSysOrder;
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


  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }

}
