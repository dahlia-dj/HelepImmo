
package com.djoumessi.progmobile.helepimmo.common;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class ArrayOptions implements Serializable {

    @SerializedName("options_owner")
    @Expose
    private String optionsOwner;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ArrayOptions() {
    }

    /**
     * 
     * @param optionsOwner
     */
    public ArrayOptions(String optionsOwner) {
        super();
        this.optionsOwner = optionsOwner;
    }

    public String getOptionsOwner() {
        return optionsOwner;
    }

    public void setOptionsOwner(String optionsOwner) {
        this.optionsOwner = optionsOwner;
    }

}
