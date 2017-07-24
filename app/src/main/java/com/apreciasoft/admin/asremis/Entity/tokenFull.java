package com.apreciasoft.admin.asremis.Entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by jorge gutierrez on 13/02/2017.
 */

public class tokenFull {

    @Expose
    @SerializedName("tokenFB")
    public String tokenFB;

    @Expose
    @SerializedName("idUser")
    public int idUser;

    @Expose
    @SerializedName("idDriver")
    public int idDriver;





    public tokenFull(String tokenFB, int idUser,int idDriver) {
        this.tokenFB = tokenFB;
        this.idUser = idUser;
        this.idDriver = idDriver;
    }


    public int getIdDriver() {
        return idDriver;
    }

    public void setIdDriver(int idDriver) {
        this.idDriver = idDriver;
    }

    public String getTokenFB() {
        return tokenFB;
    }

    public void setTokenFB(String tokenFB) {
        this.tokenFB = tokenFB;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }
}
