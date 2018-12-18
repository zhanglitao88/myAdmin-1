package com.arch.common.pojo;

import java.util.Date;

public class TlTelegram {
    private Integer teleId;

    private String teleCode;

    private String teleName;

    private String auditPerson;

    private String draftPerson;

    private String telePhone;

    private String teleLevel;

    private Date teleSendTime;

    private String teleSendPerson;

    private String mainSendCompany;

    private String copySendCompany;

    private Date teleCreateTime;

    private Integer teleCreatePersonId;

    private Integer teleType;

    private Integer teleIsfinish;

    private Date teleIsfinishTime;

    private Integer teleCategory;

    private Date teleFinishtime;

    private String teleContent;

    public Integer getTeleId() {
        return teleId;
    }

    public void setTeleId(Integer teleId) {
        this.teleId = teleId;
    }

    public String getTeleCode() {
        return teleCode;
    }

    public void setTeleCode(String teleCode) {
        this.teleCode = teleCode == null ? null : teleCode.trim();
    }

    public String getTeleName() {
        return teleName;
    }

    public void setTeleName(String teleName) {
        this.teleName = teleName == null ? null : teleName.trim();
    }

    public String getAuditPerson() {
        return auditPerson;
    }

    public void setAuditPerson(String auditPerson) {
        this.auditPerson = auditPerson == null ? null : auditPerson.trim();
    }

    public String getDraftPerson() {
        return draftPerson;
    }

    public void setDraftPerson(String draftPerson) {
        this.draftPerson = draftPerson == null ? null : draftPerson.trim();
    }

    public String getTelePhone() {
        return telePhone;
    }

    public void setTelePhone(String telePhone) {
        this.telePhone = telePhone == null ? null : telePhone.trim();
    }

    public String getTeleLevel() {
        return teleLevel;
    }

    public void setTeleLevel(String teleLevel) {
        this.teleLevel = teleLevel == null ? null : teleLevel.trim();
    }

    public Date getTeleSendTime() {
        return teleSendTime;
    }

    public void setTeleSendTime(Date teleSendTime) {
        this.teleSendTime = teleSendTime;
    }

    public String getTeleSendPerson() {
        return teleSendPerson;
    }

    public void setTeleSendPerson(String teleSendPerson) {
        this.teleSendPerson = teleSendPerson == null ? null : teleSendPerson.trim();
    }

    public String getMainSendCompany() {
        return mainSendCompany;
    }

    public void setMainSendCompany(String mainSendCompany) {
        this.mainSendCompany = mainSendCompany == null ? null : mainSendCompany.trim();
    }

    public String getCopySendCompany() {
        return copySendCompany;
    }

    public void setCopySendCompany(String copySendCompany) {
        this.copySendCompany = copySendCompany == null ? null : copySendCompany.trim();
    }

    public Date getTeleCreateTime() {
        return teleCreateTime;
    }

    public void setTeleCreateTime(Date teleCreateTime) {
        this.teleCreateTime = teleCreateTime;
    }

    public Integer getTeleCreatePersonId() {
        return teleCreatePersonId;
    }

    public void setTeleCreatePersonId(Integer teleCreatePersonId) {
        this.teleCreatePersonId = teleCreatePersonId;
    }

    public Integer getTeleType() {
        return teleType;
    }

    public void setTeleType(Integer teleType) {
        this.teleType = teleType;
    }

    public Integer getTeleIsfinish() {
        return teleIsfinish;
    }

    public void setTeleIsfinish(Integer teleIsfinish) {
        this.teleIsfinish = teleIsfinish;
    }

    public Date getTeleIsfinishTime() {
        return teleIsfinishTime;
    }

    public void setTeleIsfinishTime(Date teleIsfinishTime) {
        this.teleIsfinishTime = teleIsfinishTime;
    }

    public Integer getTeleCategory() {
        return teleCategory;
    }

    public void setTeleCategory(Integer teleCategory) {
        this.teleCategory = teleCategory;
    }

    public Date getTeleFinishtime() {
        return teleFinishtime;
    }

    public void setTeleFinishtime(Date teleFinishtime) {
        this.teleFinishtime = teleFinishtime;
    }

    public String getTeleContent() {
        return teleContent;
    }

    public void setTeleContent(String teleContent) {
        this.teleContent = teleContent == null ? null : teleContent.trim();
    }
}