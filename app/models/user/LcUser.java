package models.user;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.google.inject.Inject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.myweb.db.DaoObject;
import play.data.validation.Constraints;

import javax.persistence.*;

@SuppressWarnings({"UnusedDeclaration", "JpaQlInspection"})
@Entity
@NamedQueries({
        @NamedQuery(name = "LcUser.findByLogin", query = "SELECT u FROM LcUser u WHERE u.mobile = :login"),
        @NamedQuery(name = "LcUser.findByEmail", query = "SELECT u FROM LcUser u WHERE u.email = :email"),
        @NamedQuery(name = "LcUser.findByLoginExcludingId", query = "SELECT u FROM LcUser u WHERE u.mobile = :login AND " +
                "u.id <> :excludedId"),
        @NamedQuery(name = "LcUser.findByEmailExcludingId", query = "SELECT u FROM LcUser u WHERE u.email = :email AND " +
                "u.id <> :excludedId")
})
public class LcUser extends DaoObject {

//    @NotNull
//    @Constraints.Required
//    @Constraints.MinLength(value = 1)
//    @Constraints.MaxLength(value = 255)
private String mobile;

    public String getIsReg() {
        return isReg;
    }

    public void setIsReg(String isReg) {
        this.isReg = isReg;
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

    public String getBillAddr() {
        return billAddr;
    }

    public void setBillAddr(String billAddr) {
        this.billAddr = billAddr;
    }

    public String getBillTel() {
        return billTel;
    }

    public void setBillTel(String billTel) {
        this.billTel = billTel;
    }

    public String getBillBank() {
        return billBank;
    }

    public void setBillBank(String billBank) {
        this.billBank = billBank;
    }

    public String getBillBankNo() {
        return billBankNo;
    }

    public void setBillBankNo(String billBankNo) {
        this.billBankNo = billBankNo;
    }

    public String getPsw() {
        return psw;
    }

    public void setPsw(String psw) {
        this.psw = psw;
    }

    private String psw;
    private String isReg;
    private String billOrgan;
    private String billCode;
    private String billAddr;
    private String billTel;
    private String billBank;
    private String billBankNo;

    public String getFuncLvl() {
        return funcLvl;
    }

    public void setFuncLvl(String funcLvl) {
        this.funcLvl = funcLvl;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getJobUnit() {
        return jobUnit;
    }

    public void setJobUnit(String jobUnit) {
        this.jobUnit = jobUnit;
    }

    private String edu;
    private String funcLvl;

    public String getRegType() {
        return regType;
    }

    public void setRegType(String regType) {
        this.regType = regType;
    }

    private String regNo;
    private String regType;

    public String getEdu() {
        return edu;
    }

    public void setEdu(String edu) {
        this.edu = edu;
    }

    private String jobUnit;

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    private String realName;
    private String gender;

//    @NotNull
//    @Constraints.Required
//    @Constraints.MinLength(value = 1)
//    @Constraints.MaxLength(value = 255)
    private String login;
    // see http://stackoverflow.com/questions/3802192/regexp-java-for-password-validation
    @Transient
    @Nullable
    @Constraints.Pattern(value="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$")
    private String newPassword;
    @Transient
    @Nullable
    @Constraints.Pattern(value="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$")
    private String confirmPassword;

    @NotNull
    @Embedded
    @JsonIgnore
    private UserPasswordSettings userPasswordSettings;

    @NotNull
    @Constraints.Required
    @Constraints.Email
    private String email;

    @NotNull
    public String getMobile() {
        return mobile;
    }

    public void setMobile(@NotNull String mobile) {
        this.mobile = mobile;
    }
    @NotNull
    public String getLogin() {
        return login;
    }

    public void setLogin(@NotNull String login) {
        this.login = login;
    }

    @Nullable
    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(@Nullable String newPassword) {
        this.newPassword = newPassword;
    }

    @Nullable
    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(@Nullable String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    @NotNull
    public UserPasswordSettings getUserPasswordSettings() {
        return userPasswordSettings;
    }

    public void setUserPasswordSettings(@NotNull UserPasswordSettings userPasswordSettings) {
        this.userPasswordSettings = userPasswordSettings;
    }

    @NotNull
    public String getEmail() {
        return email;
    }

    public void setEmail(@NotNull String email) {
        this.email = email;
    }

    public LcUser() {

    }

    @Inject
    public LcUser(@NotNull UserPasswordSettings userPasswordSettings) {
        this.userPasswordSettings = userPasswordSettings;
    }
}
