
package com.djoumessi.progmobile.helepimmo.common;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ApiImageUpload {

    @SerializedName("filename")
    @Expose
    private String filename;
    @SerializedName("modulepart")
    @Expose
    private String modulepart;
    @SerializedName("ref")
    @Expose
    private String ref;
    @SerializedName("subdir")
    @Expose
    private String subdir;
    @SerializedName("filecontent")
    @Expose
    private String filecontent;
    @SerializedName("fileencoding")
    @Expose
    private String fileencoding;
    @SerializedName("overwriteifexists")
    @Expose
    private String overwriteifexists;

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getModulepart() {
        return modulepart;
    }

    public void setModulepart(String modulepart) {
        this.modulepart = modulepart;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getSubdir() {
        return subdir;
    }

    public void setSubdir(String subdir) {
        this.subdir = subdir;
    }

    public String getFilecontent() {
        return filecontent;
    }

    public void setFilecontent(String filecontent) {
        this.filecontent = filecontent;
    }

    public String getFileencoding() {
        return fileencoding;
    }

    public void setFileencoding(String fileencoding) {
        this.fileencoding = fileencoding;
    }

    public String getOverwriteifexists() {
        return overwriteifexists;
    }

    public void setOverwriteifexists(String overwriteifexists) {
        this.overwriteifexists = overwriteifexists;
    }

}
