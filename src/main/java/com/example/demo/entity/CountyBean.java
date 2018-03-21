package com.example.demo.entity;

public class CountyBean {
    private int countyId;
    private int cityId;
    private String countyName;
    private String countyDescription;

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
