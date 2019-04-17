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

    @NotNull
//    @Constraints.Required
    @Constraints.MinLength(value = 1)
    @Constraints.MaxLength(value = 255)
    private String mobile;

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
