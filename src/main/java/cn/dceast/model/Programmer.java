package cn.dceast.model;

import java.util.Date;
import javax.persistence.*;

public class Programmer {
    @Id
    private Integer id;

    private String name;

    private String base;

    private String tel;

    private String level;

    @Column(name = "entryDate")
    private Date entrydate;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * @return base
     */
    public String getBase() {
        return base;
    }

    /**
     * @param base
     */
    public void setBase(String base) {
        this.base = base == null ? null : base.trim();
    }

    /**
     * @return tel
     */
    public String getTel() {
        return tel;
    }

    /**
     * @param tel
     */
    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    /**
     * @return level
     */
    public String getLevel() {
        return level;
    }

    /**
     * @param level
     */
    public void setLevel(String level) {
        this.level = level == null ? null : level.trim();
    }

    /**
     * @return entryDate
     */
    public Date getEntrydate() {
        return entrydate;
    }

    /**
     * @param entrydate
     */
    public void setEntrydate(Date entrydate) {
        this.entrydate = entrydate;
    }
}