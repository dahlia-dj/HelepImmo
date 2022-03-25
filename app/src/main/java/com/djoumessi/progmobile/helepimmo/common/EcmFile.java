
package com.djoumessi.progmobile.helepimmo.common;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class EcmFile {

    @SerializedName("label")
    @Expose
    private String label;
    @SerializedName("entity")
    @Expose
    private String entity;
    @SerializedName("filename")
    @Expose
    private String filename;
    @SerializedName("filepath")
    @Expose
    private String filepath;
    @SerializedName("fullpath_orig")
    @Expose
    private String fullpathOrig;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("keywords")
    @Expose
    private String keywords;
    @SerializedName("cover")
    @Expose
    private Object cover;
    @SerializedName("position")
    @Expose
    private String position;
    @SerializedName("gen_or_uploaded")
    @Expose
    private String genOrUploaded;
    @SerializedName("extraparams")
    @Expose
    private Object extraparams;
    @SerializedName("date_c")
    @Expose
    private Integer dateC;
    @SerializedName("date_m")
    @Expose
    private Integer dateM;
    @SerializedName("fk_user_c")
    @Expose
    private String fkUserC;
    @SerializedName("fk_user_m")
    @Expose
    private Object fkUserM;
    @SerializedName("acl")
    @Expose
    private Object acl;
    @SerializedName("src_object_type")
    @Expose
    private String srcObjectType;
    @SerializedName("src_object_id")
    @Expose
    private String srcObjectId;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("ref")
    @Expose
    private Object ref;
    @SerializedName("share")
    @Expose
    private Object share;

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getEntity() {
        return entity;
    }

    public void setEntity(String entity) {
        this.entity = entity;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getFilepath() {
        return filepath;
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath;
    }

    public String getFullpathOrig() {
        return fullpathOrig;
    }

    public void setFullpathOrig(String fullpathOrig) {
        this.fullpathOrig = fullpathOrig;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public Object getCover() {
        return cover;
    }

    public void setCover(Object cover) {
        this.cover = cover;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getGenOrUploaded() {
        return genOrUploaded;
    }

    public void setGenOrUploaded(String genOrUploaded) {
        this.genOrUploaded = genOrUploaded;
    }

    public Object getExtraparams() {
        return extraparams;
    }

    public void setExtraparams(Object extraparams) {
        this.extraparams = extraparams;
    }

    public Integer getDateC() {
        return dateC;
    }

    public void setDateC(Integer dateC) {
        this.dateC = dateC;
    }

    public Integer getDateM() {
        return dateM;
    }

    public void setDateM(Integer dateM) {
        this.dateM = dateM;
    }

    public String getFkUserC() {
        return fkUserC;
    }

    public void setFkUserC(String fkUserC) {
        this.fkUserC = fkUserC;
    }

    public Object getFkUserM() {
        return fkUserM;
    }

    public void setFkUserM(Object fkUserM) {
        this.fkUserM = fkUserM;
    }

    public Object getAcl() {
        return acl;
    }

    public void setAcl(Object acl) {
        this.acl = acl;
    }

    public String getSrcObjectType() {
        return srcObjectType;
    }

    public void setSrcObjectType(String srcObjectType) {
        this.srcObjectType = srcObjectType;
    }

    public String getSrcObjectId() {
        return srcObjectId;
    }

    public void setSrcObjectId(String srcObjectId) {
        this.srcObjectId = srcObjectId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Object getRef() {
        return ref;
    }

    public void setRef(Object ref) {
        this.ref = ref;
    }

    public Object getShare() {
        return share;
    }

    public void setShare(Object share) {
        this.share = share;
    }

}
