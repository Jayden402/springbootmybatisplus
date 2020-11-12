package com.cxp.springbootmybatisplus.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author cxp
 * @since 2020-11-10
 */
public class TbStudent implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private String id;

    @TableField("name")
    private String name;

    @TableField("age")
    private String age;

    @TableField("sex")
    private String sex;

    @TableField("datainsuserid")
    private String datainsuserid;

    @TableField("datainstime")
    private LocalDateTime datainstime;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getDatainsuserid() {
        return datainsuserid;
    }

    public void setDatainsuserid(String datainsuserid) {
        this.datainsuserid = datainsuserid;
    }

    public LocalDateTime getDatainstime() {
        return datainstime;
    }

    public void setDatainstime(LocalDateTime datainstime) {
        this.datainstime = datainstime;
    }

    @Override
    public String toString() {
        return "TbStudent{" +
        "id=" + id +
        ", name=" + name +
        ", age=" + age +
        ", sex=" + sex +
        ", datainsuserid=" + datainsuserid +
        ", datainstime=" + datainstime +
        "}";
    }
}
