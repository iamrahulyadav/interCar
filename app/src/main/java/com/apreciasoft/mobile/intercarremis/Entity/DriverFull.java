package com.apreciasoft.mobile.intercarremis.Entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Jorge on 31/10/17.
 */

public class DriverFull {

    @Expose
    @SerializedName("driver")
    public driver driver;

    public driver getDriver() {
        return driver;
    }

    public void setDriver(driver driver) {
        this.driver = driver;
    }
}
