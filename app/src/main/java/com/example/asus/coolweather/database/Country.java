package com.example.asus.coolweather.database;

import android.support.v4.widget.SwipeRefreshLayout;

import org.litepal.crud.DataSupport;

public class Country extends DataSupport {
    private int id;
    private String countryName;
    private int countryCode;

    public void setId(int id) {
        this.id = id;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public void setCountryCode(int countryCode) {
        this.countryCode = countryCode;
    }

    public int getId() {

        return id;
    }

    public String getCountryName() {
        return countryName;
    }

    public int getCountryCode() {
        return countryCode;
    }
}
