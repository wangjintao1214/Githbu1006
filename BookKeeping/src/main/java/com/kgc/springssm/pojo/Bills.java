package com.kgc.springssm.pojo;

import java.util.Date;

public class Bills {
    private Integer id;

    private String title;

    private String billTime;

    private Integer typeId;

    private Integer price;

    private String explainn;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String  getBillTime() {
        return billTime;
    }

    public void setBillTime(String billTime) {
        this.billTime = billTime;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getExplainn() {
        return explainn;
    }

    public void setExplainn(String explainn) {
        this.explainn = explainn == null ? null : explainn.trim();
    }
}