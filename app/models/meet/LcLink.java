package models.meet;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.google.inject.Inject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.myweb.db.DaoObject;
import play.data.validation.Constraints;

import javax.persistence.*;

@SuppressWarnings({"UnusedDeclaration", "JpaQlInspection"})
@Entity
public class LcLink extends DaoObject {

        public String getCatId() {
                return catId;
        }

        public void setCatId(String catId) {
                this.catId = catId;
        }

        private String catId;
        private String isUsing;
        public String getMeetId() {
                return meetId;
        }

        public void setMeetId(String meetId) {
                this.meetId = meetId;
        }

        private String meetId;
        private String url;
        private String pic;

        public String getUrl() {
        return url;
        }

        public void setUrl(@NotNull String url) {
        this.url = url;
        }

public String getPic() {
        return pic;
        }

public void setPic(@Nullable String pic) {
        this.pic = pic;
        }

    public LcLink() {

    }

}
