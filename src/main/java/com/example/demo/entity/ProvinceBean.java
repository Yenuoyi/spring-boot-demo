package com.example.demo.entity;

import java.util.Set;

public class ProvinceBean {
    private int provinceId;
    private int nationId;
    private String provinceName;
    private String provinceDescription;
    private Set<CityBean> cityBeans;

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }

    public int getNationId() {
        return nationId;
    }

    public void setNationId(int nationId) {
        this.nationId = nationId;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public String getProvinceDescription() {
        return provinceDescription;
    }

    public void setProvinceDescription(String provinceDescription) {
        this.provinceDescription = provinceDescription;
    }

    public Set<CityBean> getCityBeans() {
        return cityBeans;
    }

    public void setCityBeans(Set<CityBean> cityBeans) {
        this.cityBeans = cityBeans;
    }

    @Override
    public String toString() {
        return "ProvinceBean{" +
                "provinceId=" + provinceId +
                ", nationId=" + nationId +
                ", provinceName='" + provinceName + '\'' +
                ", provinceDescription='" + provinceDescription + '\'' +
                ", cityBeans=" + cityBeans +
                '}';
    }
}
