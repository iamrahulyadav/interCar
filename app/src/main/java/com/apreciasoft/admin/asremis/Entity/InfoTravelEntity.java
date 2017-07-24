package com.apreciasoft.admin.asremis.Entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by Admin on 06/01/2017.
 */

public  class InfoTravelEntity implements Serializable {



    @Expose
    @SerializedName("idTravel")
    public int idTravel;


    @Expose
    @SerializedName("idSatatusTravel")
    public int idSatatusTravel;

    @Expose
    @SerializedName("phoneNumber")
    public String phoneNumber;


    @Expose
    @SerializedName("nameStatusTravel")
    public String nameStatusTravel;

    @Expose
    @SerializedName("lonOrigin")
    public String lonOrigin;

    @Expose
    @SerializedName("latOrigin")
    public String latOrigin;

    @Expose
    @SerializedName("distanceLabel")
    public String distanceLabel;


    @Expose
    @SerializedName("lonDestination")
    public String lonDestination;

    @Expose
    @SerializedName("latDestination")
    public String latDestination;

    @Expose
    @SerializedName("amountCalculate")
    public String amountCalculate;

    @Expose
    @SerializedName("totalAmount")
    public String totalAmount;


    @Expose
    @SerializedName("amountGps")
    public String amountGps;


    @Expose
    @SerializedName("codTravel")
    public String codTravel;

    @Expose
    @SerializedName("nameOrigin")
    public String nameOrigin;

    @Expose
    @SerializedName("pasajero")
    public String pasajero;

    @Expose
    @SerializedName("observationFromDriver")
    public String observationFromDriver;

    @Expose
    @SerializedName("nameDestination")
    public String nameDestination;

    @Expose
    @SerializedName("driver")
    public String driver;

    @Expose
    @SerializedName("client")
    public String client;

    @Expose
    @SerializedName("idClientKf")
    public int idClientKf;


    @Expose
    @SerializedName("classColorTwo")
    public String classColorTwo;

    @Expose
    @SerializedName("isTravelMultiOrigin")
    public String isTravelMultiOrigin;

    @Expose
    @SerializedName("isMultiDestination")
    public String isMultiDestination;


    @Expose
    @SerializedName("OriginMultipleDesc1")
    public String OriginMultipleDesc1;

    @Expose
    @SerializedName("OriginMultipleLat1")
    public String OriginMultipleLat1;

    @Expose
    @SerializedName("OriginMultipleLon1")
    public String OriginMultipleLon1;

    @Expose
    @SerializedName("OriginMultipleDesc2")
    public String OriginMultipleDesc2;

    @Expose
    @SerializedName("OriginMultipleLat2")
    public String OriginMultipleLat2;

    @Expose
    @SerializedName("OriginMultipleLon2")
    public String OriginMultipleLon2;

    @Expose
    @SerializedName("OriginMultipleDesc3")
    public String OriginMultipleDesc3;
    @Expose
    @SerializedName("OriginMultipleLat3")
    public String OriginMultipleLat3;

    @Expose
    @SerializedName("OriginMultipleLon3")
    public String OriginMultipleLon3;

    @Expose
    @SerializedName("OriginMultipleDesc4")
    public String OriginMultipleDesc4;

    @Expose
    @SerializedName("OriginMultipleLat4")
    public String OriginMultipleLat4;

    @Expose
    @SerializedName("OriginMultipleLon4")
    public String OriginMultipleLon4;

    @Expose
    @SerializedName("MultiDestination")
    public String MultiDestination;

    @Expose
    @SerializedName("idUserClient")
    public int idUserClient;

    @Expose
    @SerializedName("idUserDriver")
    public int idUserDriver;

    @Expose
    @SerializedName("isRoundTrip")
    public Boolean isRoundTrip;

    @Expose
    @SerializedName("isTravelSendMovil")
    public Boolean isTravelSendMovil;

    @Expose
    @SerializedName("priceDitanceCompany")
    public double priceDitanceCompany;

    @Expose
    @SerializedName("priceMinSleepCompany")
    public double priceMinSleepCompany;


    @Expose
    @SerializedName("priceReturn")
    public double priceReturn;


    @Expose
    @SerializedName("priceHourDriverMultiLan")
    public double priceHourDriverMultiLan;

    @Expose
    @SerializedName("priceContract")
    public double priceContract;

    @Expose
    @SerializedName("priceTravelSms")
    public double priceTravelSms;

    @Expose
    @SerializedName("isTravelComany")
    public int isTravelComany;


    @Expose
    @SerializedName("isAceptReservationByDriver")
    public int isAceptReservationByDriver;

    @Expose
    @SerializedName("date")
    public String mdate;

    public String getMdate() {
        return mdate;
    }

    public void setMdate(String mdate) {
        this.mdate = mdate;
    }

    public int getIsAceptReservationByDriver() {
        return isAceptReservationByDriver;
    }

    public void setIsAceptReservationByDriver(int isAceptReservationByDriver) {
        this.isAceptReservationByDriver = isAceptReservationByDriver;
    }

    public int getIsTravelComany() {
        return isTravelComany;
    }

    public void setIsTravelComany(int isTravelComany) {
        this.isTravelComany = isTravelComany;
    }

    public double getPriceDitanceCompany() {
        return priceDitanceCompany;
    }

    public void setPriceDitanceCompany(double priceDitanceCompany) {
        this.priceDitanceCompany = priceDitanceCompany;
    }

    public double getPriceMinSleepCompany() {
        return priceMinSleepCompany;
    }

    public void setPriceMinSleepCompany(double priceMinSleepCompany) {
        this.priceMinSleepCompany = priceMinSleepCompany;
    }

    public double getPriceReturn() {
        return priceReturn;
    }

    public void setPriceReturn(double priceReturn) {
        this.priceReturn = priceReturn;
    }

    public double getPriceHourDriverMultiLan() {
        return priceHourDriverMultiLan;
    }

    public void setPriceHourDriverMultiLan(double priceHourDriverMultiLan) {
        this.priceHourDriverMultiLan = priceHourDriverMultiLan;
    }

    public double getPriceContract() {
        return priceContract;
    }

    public void setPriceContract(double priceContract) {
        this.priceContract = priceContract;
    }

    public double getPriceTravelSms() {
        return priceTravelSms;
    }

    public void setPriceTravelSms(double priceTravelSms) {
        this.priceTravelSms = priceTravelSms;
    }

    public Boolean getTravelSendMovil() {
        return isTravelSendMovil;
    }

    public void setTravelSendMovil(Boolean travelSendMovil) {
        isTravelSendMovil = travelSendMovil;
    }

    public Boolean getRoundTrip() {
        return isRoundTrip;
    }

    public void setRoundTrip(Boolean roundTrip) {
        isRoundTrip = roundTrip;
    }

    public int getIdUserDriver() {
        return idUserDriver;
    }

    public void setIdUserDriver(int idUserDriver) {
        this.idUserDriver = idUserDriver;
    }

    public String getObservationFromDriver() {
        return observationFromDriver;
    }

    public void setObservationFromDriver(String observationFromDriver) {
        this.observationFromDriver = observationFromDriver;
    }

    public void setMultiDestination(String multiDestination) {
        MultiDestination = multiDestination;
    }

    public String getMultiDestination() {
        return MultiDestination;
    }

    public String getOriginMultipleDesc1() {
        return OriginMultipleDesc1;
    }

    public void setOriginMultipleDesc1(String originMultipleDesc1) {
        OriginMultipleDesc1 = originMultipleDesc1;
    }

    public String getOriginMultipleLat1() {
        return OriginMultipleLat1;
    }

    public void setOriginMultipleLat1(String originMultipleLat1) {
        OriginMultipleLat1 = originMultipleLat1;
    }

    public String getOriginMultipleLon1() {
        return OriginMultipleLon1;
    }

    public void setOriginMultipleLon1(String originMultipleLon1) {
        OriginMultipleLon1 = originMultipleLon1;
    }

    public String getOriginMultipleDesc2() {
        return OriginMultipleDesc2;
    }

    public void setOriginMultipleDesc2(String originMultipleDesc2) {
        OriginMultipleDesc2 = originMultipleDesc2;
    }

    public String getOriginMultipleLat2() {
        return OriginMultipleLat2;
    }

    public void setOriginMultipleLat2(String originMultipleLat2) {
        OriginMultipleLat2 = originMultipleLat2;
    }

    public String getOriginMultipleLon2() {
        return OriginMultipleLon2;
    }

    public void setOriginMultipleLon2(String originMultipleLon2) {
        OriginMultipleLon2 = originMultipleLon2;
    }

    public String getOriginMultipleDesc3() {
        return OriginMultipleDesc3;
    }

    public void setOriginMultipleDesc3(String originMultipleDesc3) {
        OriginMultipleDesc3 = originMultipleDesc3;
    }

    public String getOriginMultipleLat3() {
        return OriginMultipleLat3;
    }

    public void setOriginMultipleLat3(String originMultipleLat3) {
        OriginMultipleLat3 = originMultipleLat3;
    }

    public String getOriginMultipleLon3() {
        return OriginMultipleLon3;
    }

    public void setOriginMultipleLon3(String originMultipleLon3) {
        OriginMultipleLon3 = originMultipleLon3;
    }

    public String getOriginMultipleDesc4() {
        return OriginMultipleDesc4;
    }

    public void setOriginMultipleDesc4(String originMultipleDesc4) {
        OriginMultipleDesc4 = originMultipleDesc4;
    }

    public String getOriginMultipleLat4() {
        return OriginMultipleLat4;
    }

    public void setOriginMultipleLat4(String originMultipleLat4) {
        OriginMultipleLat4 = originMultipleLat4;
    }

    public String getOriginMultipleLon4() {
        return OriginMultipleLon4;
    }

    public void setOriginMultipleLon4(String originMultipleLon4) {
        OriginMultipleLon4 = originMultipleLon4;
    }


    public String getIsTravelMultiOrigin() {
        return isTravelMultiOrigin;
    }

    public void setIsTravelMultiOrigin(String isTravelMultiOrigin) {
        this.isTravelMultiOrigin = isTravelMultiOrigin;
    }

    public String getIsMultiDestination() {
        return isMultiDestination;
    }

    public void setIsMultiDestination(String isMultiDestination) {
        this.isMultiDestination = isMultiDestination;
    }

    public String getPasajero() {
        return pasajero;
    }

    public void setPasajero(String pasajero) {
        this.pasajero = pasajero;
    }

    public int getIdClientKf() {
        return idClientKf;
    }

    public void setIdClientKf(int idClientKf) {
        this.idClientKf = idClientKf;
    }

    public String getClassColorTwo() {
        return classColorTwo;
    }

    public void setClassColorTwo(String classColorTwo) {
        this.classColorTwo = classColorTwo;
    }

    public String getNameDestination() {
        return nameDestination;
    }

    public void setNameDestination(String nameDestination) {
        this.nameDestination = nameDestination;
    }

    public int getIdSatatusTravel() {
        return idSatatusTravel;
    }

    public void setIdSatatusTravel(int idSatatusTravel) {
        this.idSatatusTravel = idSatatusTravel;
    }

    public String getNameStatusTravel() {
        return nameStatusTravel;
    }

    public void setNameStatusTravel(String nameStatusTravel) {
        this.nameStatusTravel = nameStatusTravel;
    }

    public int getIdTravel() {
        return idTravel;
    }

    public void setIdTravel(int idTravel) {
        this.idTravel = idTravel;
    }

    public String getCodTravel() {
        return codTravel;
    }

    public void setCodTravel(String codTravel) {
        this.codTravel = codTravel;
    }

    public String getNameOrigin() {
        return nameOrigin;
    }

    public void setNameOrigin(String nameOrigin) {
        this.nameOrigin = nameOrigin;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }


    public String getLonOrigin() {
        return lonOrigin;
    }

    public void setLonOrigin(String lonOrigin) {
        this.lonOrigin = lonOrigin;
    }

    public String getLatOrigin() {
        return latOrigin;
    }

    public void setLatOrigin(String latOrigin) {
        this.latOrigin = latOrigin;
    }

    public String getLonDestination() {
        return lonDestination;
    }

    public void setLonDestination(String lonDestination) {
        this.lonDestination = lonDestination;
    }

    public String getLatDestination() {
        return latDestination;
    }

    public void setLatDestination(String latDestination) {
        this.latDestination = latDestination;
    }

    public String getAmountCalculate() {
        return amountCalculate;
    }

    public void setAmountCalculate(String amountCalculate) {
        this.amountCalculate = amountCalculate;
    }

    public String getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getAmountGps() {
        return amountGps;
    }

    public void setAmountGps(String amountGps) {
        this.amountGps = amountGps;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDistanceLabel() {
        return distanceLabel;
    }

    public void setDistanceLabel(String distanceLabel) {
        this.distanceLabel = distanceLabel;
    }

    public int getIdUserClient() {
        return idUserClient;
    }

    public void setIdUserClient(int idUserClient) {
        this.idUserClient = idUserClient;
    }
}
