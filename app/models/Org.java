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
public class Org extends DaoObject{
//    private String id;
    private String name;
//    @Nullable
//    @OneToMany(mappedBy="parent",cascade=CascadeType.ALL,fetch=FetchType.LAZY)
//    private Set<Org> children = new HashSet<Org>();
//    @Nullable
//    @ManyToOne
//    @JoinColumn(name="parentId")
//    private Org parent;

    public long getParentId() {
        return parentId;
    }

    public void setParentId(long parentId) {
        this.parentId = parentId;
    }

    private long parentId;
//    @Id
//    @GeneratedValue//auto
//    public String getId() {
//        return id;
//    }
//    public void setId(String id) {
//        this.id = id;
//    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
//    public Set<Org> getChildren() {
//        return children;
//    }
//    public void setChildren(Set<Org> children) {
//        this.children = children;
//    }
//    public Org getParent() {
//        return parent;
//    }
//    public void setParent(Org parent) {
//        this.parent = parent;
//    }
}