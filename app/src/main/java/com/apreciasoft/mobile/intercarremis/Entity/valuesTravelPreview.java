package com.apreciasoft.mobile.intercarremis.Entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Jorge on 14/3/18.
 */

public class valuesTravelPreview {


    @Expose
    @SerializedName("values")
    public PreviewTravel values;

    public PreviewTravel getValues() {
        return values;
    }

    public void setValues(PreviewTravel values) {
        this.values = values;
    }
}
