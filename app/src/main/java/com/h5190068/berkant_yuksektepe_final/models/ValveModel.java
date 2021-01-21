package com.h5190068.berkant_yuksektepe_final.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ValveModel {

    @SerializedName("OyunAdi")
    @Expose
    private String oyunAdi;
    @SerializedName("CikisTarihi")
    @Expose
    private String cikisTarihi;
    @SerializedName("Yayimlayan")
    @Expose
    private String yayimlayan;
    @SerializedName("OyunPlatform")
    @Expose
    private String oyunPlatform;
    @SerializedName("KapakURL")
    @Expose
    private String kapakURL;
    @SerializedName("GovdeURL")
    @Expose
    private String govdeURL;
    @SerializedName("OyunTuru")
    @Expose
    private String oyunTuru;
    @SerializedName("OyunModu")
    @Expose
    private String oyunModu;
    @SerializedName("OyunMotoru")
    @Expose
    private String oyunMotoru;
    @SerializedName("OyunAciklamasi")
    @Expose
    private String oyunAciklamasi;

    public String getOyunAdi() {
        return oyunAdi;
    }

    public void setOyunAdi(String oyunAdi) {
        this.oyunAdi = oyunAdi;
    }

    public String getCikisTarihi() {
        return cikisTarihi;
    }

    public void setCikisTarihi(String cikisTarihi) {
        this.cikisTarihi = cikisTarihi;
    }

    public String getYayimlayan() {
        return yayimlayan;
    }

    public void setYayimlayan(String yayimlayan) {
        this.yayimlayan = yayimlayan;
    }

    public String getOyunPlatform() {
        return oyunPlatform;
    }

    public void setOyunPlatform(String oyunPlatform) {
        this.oyunPlatform = oyunPlatform;
    }

    public String getKapakURL() {
        return kapakURL;
    }

    public void setKapakURL(String kapakURL) {
        this.kapakURL = kapakURL;
    }

    public String getGovdeURL() {
        return govdeURL;
    }

    public void setGovdeURL(String govdeURL) {
        this.govdeURL = govdeURL;
    }

    public String getOyunTuru() {
        return oyunTuru;
    }

    public void setOyunTuru(String oyunTuru) {
        this.oyunTuru = oyunTuru;
    }

    public String getOyunModu() {
        return oyunModu;
    }

    public void setOyunModu(String oyunModu) {
        this.oyunModu = oyunModu;
    }

    public String getOyunMotoru() {
        return oyunMotoru;
    }

    public void setOyunMotoru(String oyunMotoru) {
        this.oyunMotoru = oyunMotoru;
    }

    public String getOyunAciklamasi() {
        return oyunAciklamasi;
    }

    public void setOyunAciklamasi(String oyunAciklamasi) {
        this.oyunAciklamasi = oyunAciklamasi;
    }

}