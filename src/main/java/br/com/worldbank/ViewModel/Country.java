package br.com.worldbank.ViewModel;

import java.io.Serializable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Country implements Serializable{
    
    @SerializedName("id")
    @Expose
    private String id;

    @SerializedName("value")
    @Expose
    private String value;


    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }


}