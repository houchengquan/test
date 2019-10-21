package cn.domain;

import java.io.Serializable;

public class Account implements Serializable {
    private Integer id;
    private String name;
    private Double mon;

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
        this.name = name;
    }

    public Double getMon() {
        return mon;
    }

    public void setMon(Double mon) {
        this.mon = mon;
    }
}
