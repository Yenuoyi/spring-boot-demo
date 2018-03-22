package com.example.demo.entity;

import javax.persistence.*;
//JPA解决驼峰式命名规则与自动加_的问题，如果不加这个就必须在entity中写@Column(name = "countyid")
@Entity
@Table(name = "county")
public class County {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int countyId;
    private int cityId;
    private String countyName;
    private String countyDescription;

    public County() {
    }
    public int getCountyId() {
        return countyId;
    }

    public void setCountyId(int countyId) {
        this.countyId = countyId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getCountyDescription() {
        return countyDescription;
    }

    public void setCountyDescription(String countyDescription) {
        this.countyDescription = countyDescription;
    }

    @Override
    public String toString() {
        return "CountyBean{" +
                "countyId=" + countyId +
                ", cityId=" + cityId +
                ", countyName='" + countyName + '\'' +
                ", countyDescription='" + countyDescription + '\'' +
                '}';
    }
}
