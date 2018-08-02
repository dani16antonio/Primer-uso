package com.uaresafe.uaresafe_test2.Modelo;

import com.google.gson.annotations.SerializedName;

public class DatoAPI {
    @SerializedName("created_on")private int createdOn;
    @SerializedName("rating")private int rating;
    private String image;
    //Esta variable  es un objeto Json
//    @SerializedName("tags")
//    private String tags;
    private String md5;
    private String sha1;
    private String sha256;
    private String app;
    @SerializedName("package_name")private String packageName;
    private String company;
    @SerializedName("displayed_version")private String displayedVersion;
    private int size;
    private boolean stored;
    private boolean analyzed;
    @SerializedName("is_apk")private boolean isApk;
    private boolean trusted;
    private boolean detected;
    private boolean corrupted;
    private String repo;
    @SerializedName("on_devices")private boolean onDevices;

    public int getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(int createdOn) {
        this.createdOn = createdOn;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getMd5() {
        return md5;
    }

    public void setMd5(String md5) {
        this.md5 = md5;
    }

    public String getSha1() {
        return sha1;
    }

    public void setSha1(String sha1) {
        this.sha1 = sha1;
    }

    public String getSha256() {
        return sha256;
    }

    public void setSha256(String sha256) {
        this.sha256 = sha256;
    }

    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getDisplayedVersion() {
        return displayedVersion;
    }

    public void setDisplayedVersion(String displayedVersion) {
        this.displayedVersion = displayedVersion;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isStored() {
        return stored;
    }

    public void setStored(boolean stored) {
        this.stored = stored;
    }

    public boolean isAnalyzed() {
        return analyzed;
    }

    public void setAnalyzed(boolean analyzed) {
        this.analyzed = analyzed;
    }

    public boolean isApk() {
        return isApk;
    }

    public void setApk(boolean apk) {
        isApk = apk;
    }

    public boolean isTrusted() {
        return trusted;
    }

    public void setTrusted(boolean trusted) {
        this.trusted = trusted;
    }

    public boolean isDetected() {
        return detected;
    }

    public void setDetected(boolean detected) {
        this.detected = detected;
    }

    public boolean isCorrupted() {
        return corrupted;
    }

    public void setCorrupted(boolean corrupted) {
        this.corrupted = corrupted;
    }

    public String getRepo() {
        return repo;
    }

    public void setRepo(String repo) {
        this.repo = repo;
    }

    public boolean isOnDevices() {
        return onDevices;
    }

    public void setOnDevices(boolean onDevice) {
        this.onDevices = onDevice;
    }
}
