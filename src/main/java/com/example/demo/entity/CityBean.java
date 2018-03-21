package com.example.demo.entity;

public class CityBean {
    private int cityId;
    private int provinceId;
    private String cityName;
    private String cityDescription;
    private ProvinceBean provinceBean;

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCityDescription() {
        return cityDescription;
    }

    public void setCityDescription(String cityDescription) {
        this.cityDescription = cityDescription;
    }

    public ProvinceBean getProvinceBean() {
        return provinceBean;
    }

    public void setProvinceBean(ProvinceBean provinceBean) {
        this.provinceBean = provinceBean;
    }

    @Override
    public String toString() {
        return "CityBean{" +
                "cityId=" + cityId +
                ", provinceId=" + provinceId +
                ", cityName='" + cityName + '\'' +
                ", cityDescription='" + cityDescription + '\'' +
                ", provinceBean=" + provinceBean +
                '}';
    }
}
