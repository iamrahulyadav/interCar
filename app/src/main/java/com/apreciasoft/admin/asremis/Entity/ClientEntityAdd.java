package com.apreciasoft.admin.asremis.Entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by usario on 2/8/2017.
 */

public class ClientEntityAdd {

    @Expose
    @SerializedName("firtNameClient")
    public String firtNameClient;

    @Expose
    @SerializedName("lastNameClient")
    public String lastNameClient;

    @Expose
    @SerializedName("mailClient")
    public String mailClient;

    @Expose
    @SerializedName("passClient")
    public String passClient;

    @Expose
    @SerializedName("idTypeClient")
    public int idTypeClient;

    public String getFirtNameClient() {
        return firtNameClient;
    }

    public void setFirtNameClient(String firtNameClient) {
        this.firtNameClient = firtNameClient;
    }

    public String getLastNameClient() {
        return lastNameClient;
    }

    public void setLastNameClient(String lastNameClient) {
        this.lastNameClient = lastNameClient;
    }

    public String getMailClient() {
        return mailClient;
    }

    public void setMailClient(String mailClient) {
        this.mailClient = mailClient;
    }

    public String getPassClient() {
        return passClient;
    }

    public void setPassClient(String passClient) {
        this.passClient = passClient;
    }

    public int getIdTypeClient() {
        return idTypeClient;
    }

    public void setIdTypeClient(int idTypeClient) {
        this.idTypeClient = idTypeClient;
    }

    public ClientEntityAdd(String firtNameClient, String lastNameClient, String mailClient, String passClient, int idTypeClient) {
        this.firtNameClient = firtNameClient;
        this.lastNameClient = lastNameClient;
        this.mailClient = mailClient;
        this.passClient = passClient;
        this.idTypeClient = idTypeClient;
    }
}
