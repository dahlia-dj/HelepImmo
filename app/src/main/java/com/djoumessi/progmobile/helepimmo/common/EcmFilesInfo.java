
package com.djoumessi.progmobile.helepimmo.common;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class EcmFilesInfo {

    @SerializedName("ecmfiles_infos")
    @Expose
    private List<EcmFile> ecmFiles = null;

    public List<EcmFile> getEcmFiles() {
        return ecmFiles;
    }

    public void setEcmFiles(List<EcmFile> ecmFiles) {
        this.ecmFiles = this.ecmFiles;
    }

}
