package com.apreciasoft.admin.asremis.Entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by usario on 1/8/2017.
 */

public class dataAddPlusDriverEntity {

    @Expose
    @SerializedName("driver")
    public driverAdd driver;

    @Expose
    @SerializedName("fleet")
    public fleet fleet;

    public dataAddPlusDriverEntity(driverAdd driver, com.apreciasoft.admin.asremis.Entity.fleet fleet) {
        this.driver = driver;
        this.fleet = fleet;
    }

    public driverAdd getDriver() {
        return driver;
    }

    public void setDriver(driverAdd driver) {
        this.driver = driver;
    }

    public com.apreciasoft.admin.asremis.Entity.fleet getFleet() {
        return fleet;
    }

    public void setFleet(com.apreciasoft.admin.asremis.Entity.fleet fleet) {
        this.fleet = fleet;
    }
}
