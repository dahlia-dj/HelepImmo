
package com.djoumessi.progmobile.helepimmo.common;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ApiImage {

    @SerializedName("filename")
    @Expose
    private String filename;
    @SerializedName("content-type")
    @Expose
    private String contentType;
    @SerializedName("filesize")
    @Expose
    private Integer filesize;
    @SerializedName("content")
    @Expose
    private String content;
    @SerializedName("encoding")
    @Expose
    private String encoding;

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public Integer getFilesize() {
        return filesize;
    }

    public void setFilesize(Integer filesize) {
        this.filesize = filesize;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getEncoding() {
        return encoding;
    }

    public void setEncoding(String encoding) {
        this.encoding = encoding;
    }

}
