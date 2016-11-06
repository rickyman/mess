package cn.edu.tju.ssm.po;

import java.util.Date;

public class TbSchool {
    private Integer id;

    private String name;

    private String address;

    private String description;

    private String logo;

    private Integer order;

    private Date regTime;

    private Date ts;

    private String tag;

    private String fee;

    private String noitice;

    private String course;

    private Integer status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo == null ? null : logo.trim();
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public Date getRegTime() {
        return regTime;
    }

    public void setRegTime(Date regTime) {
        this.regTime = regTime;
    }

    public Date getTs() {
        return ts;
    }

    public void setTs(Date ts) {
        this.ts = ts;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag == null ? null : tag.trim();
    }

    public String getFee() {
        return fee;
    }

    public void setFee(String fee) {
        this.fee = fee == null ? null : fee.trim();
    }

    public String getNoitice() {
        return noitice;
    }

    public void setNoitice(String noitice) {
        this.noitice = noitice == null ? null : noitice.trim();
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course == null ? null : course.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}