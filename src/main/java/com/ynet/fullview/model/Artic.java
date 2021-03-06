package com.ynet.fullview.model;

public class Artic {
    private String articId;

    private String articTitle;

    private String articContent;

    private String articType;

    public String getArticId() {
        return articId;
    }

    public void setArticId(String articId) {
        this.articId = articId;
    }

    public String getArticTitle() {
        return articTitle;
    }

    public void setArticTitle(String articTitle) {
        this.articTitle = articTitle == null ? null : articTitle.trim();
    }

    public String getArticContent() {
        return articContent;
    }

    public void setArticContent(String articContent) {
        this.articContent = articContent == null ? null : articContent.trim();
    }

    public String getArticType() {
        return articType;
    }

    public void setArticType(String articType) {
        this.articType = articType == null ? null : articType.trim();
    }
}