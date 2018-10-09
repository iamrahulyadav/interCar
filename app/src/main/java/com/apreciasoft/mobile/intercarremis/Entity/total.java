package com.apreciasoft.mobile.intercarremis.Entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by jorge gutierrez on 13/04/2017.
 */

public class total {

    @Expose
    @SerializedName("ingreso")
    public String ingreso;

    @Expose
    @SerializedName("egreso")
    public String egreso;

    @Expose
    @SerializedName("ingresoProcess")
    public String ingresoProcess;

    public total(String ingreso, String egreso, String ingresoProcess) {
        this.ingreso = ingreso;
        this.egreso = egreso;
        this.ingresoProcess = ingresoProcess;
    }

    public String getIngreso() {
        return ingreso;
    }

    public void setIngreso(String ingreso) {
        this.ingreso = ingreso;
    }

    public String getEgreso() {
        return egreso;
    }

    public void setEgreso(String egreso) {
        this.egreso = egreso;
    }

    public String getIngresoProcess() {
        return ingresoProcess;
    }

    public void setIngresoProcess(String ingresoProcess) {
        this.ingresoProcess = ingresoProcess;
    }
}

