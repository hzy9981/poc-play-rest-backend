package models.meet;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.google.inject.Inject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.myweb.db.DaoObject;
import play.data.validation.Constraints;
import javax.persistence.Entity;

@SuppressWarnings({"UnusedDeclaration", "JpaQlInspection"})
@Entity
public class LcMeet extends DaoObject {
         private String title;
        private String pubYear;
        private String pubMonth;
        private String titleAbs;
        private String city;
        private String url;
    private String pic;

    public String getIsUsing() {
        return isUsing;
    }

    public void setIsUsing(String isUsing) {
        this.isUsing = isUsing;
    }

    private String isUsing;

    @NotNull
        public String getUrl() {
        return url;
        }

        public void setUrl(@NotNull String url) {
        this.url = url;
        }

    @Nullable
    public String getPic() {
            return pic;
            }

    public void setPic(@Nullable String pic) {
            this.pic = pic;
            }

        @NotNull
    public String getTilte() {
        return title;
    }

    public void setTilte(@NotNull String title) {
        this.title = title;
    }

    @Nullable
    public String getCity() {
        return city;
    }

    public void setCity(@Nullable String city) {
        this.city = city;
    }

    @Nullable
    public String getPubYear() {
            return pubYear;
            }

    public void setPubYear(@Nullable String pubYear) {
            this.pubYear = pubYear;
            }
    @Nullable
    public String getPubMonth() {
            return pubMonth;
            }

    public void setPubMonth(@Nullable String pubMonth) {
            this.pubMonth = pubMonth;
            }

    public LcMeet() {

    }

}
