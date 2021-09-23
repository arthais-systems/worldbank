package br.com.worldbank.ViewModel;

import java.io.Serializable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Data implements Serializable{

    @SerializedName("indicator")
    @Expose
    private Indicator indicator;

    @SerializedName("country")
    @Expose
    private Country country;

    @SerializedName("countryiso3code")
    @Expose
    private String countryiso3code;

    @SerializedName("date")
    @Expose
    private String date;

    @SerializedName("value")
    @Expose
    private String value;

    @SerializedName("unit")
    @Expose
    private String unit;

    @SerializedName("obs_status")
    @Expose
    private String obs_status;

    @SerializedName("decimal")
    @Expose
    private float decimal;

    public Indicator getIndicator() {
        return this.indicator;
    }

    public void setIndicator(Indicator indicator) {
        this.indicator = indicator;
    }

    public Country getCountry() {
        return this.country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public String getCountryiso3code() {
        return this.countryiso3code;
    }

    public void setCountryiso3code(String countryiso3code) {
        this.countryiso3code = countryiso3code;
    }

    public String getDate() {
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getUnit() {
        return this.unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getObs_status() {
        return this.obs_status;
    }

    public void setObs_status(String obs_status) {
        this.obs_status = obs_status;
    }

    public float getDecimal() {
        return this.decimal;
    }

    public void setDecimal(float decimal) {
        this.decimal = decimal;
    }

}