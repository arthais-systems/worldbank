package br.com.worldbank.ViewModel;

import java.io.Serializable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Pagination implements Serializable{
    @SerializedName("page")
    @Expose
    private float page;

    @SerializedName("pages")
    @Expose
    private float pages;

    @SerializedName("per_page")
    @Expose
    private float per_page;

    @SerializedName("sourceid")
    @Expose
    private String sourceid;

    @SerializedName("lastupdated")
    @Expose
    private String lastupdated;

    public float getPage() {
        return this.page;
    }

    public void setPage(float page) {
        this.page = page;
    }

    public float getPages() {
        return this.pages;
    }

    public void setPages(float pages) {
        this.pages = pages;
    }

    public float getPer_page() {
        return this.per_page;
    }

    public void setPer_page(float per_page) {
        this.per_page = per_page;
    }

    public String getSourceid() {
        return this.sourceid;
    }

    public void setSourceid(String sourceid) {
        this.sourceid = sourceid;
    }

    public String getLastupdated() {
        return this.lastupdated;
    }

    public void setLastupdated(String lastupdated) {
        this.lastupdated = lastupdated;
    }

}