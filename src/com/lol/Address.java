package com.lol;

public class Address{
    private String province_no;
    private String town;
    private int ward_no;

    public Address(String province_no, String town, int ward_no) {
        this.province_no = province_no;
        this.town = town;
        this.ward_no = ward_no;
    }

    public void setProvince_no(String province_no) {
        this.province_no = province_no;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public void setWard_no(int ward_no) {
        this.ward_no = ward_no;
    }

    public String getProvince_no() {
        return province_no;
    }

    public String getTown() {
        return town;
    }

    public int getWard_no() {
        return ward_no;
    }
}
