
package com.djoumessi.progmobile.helepimmo.common;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Category implements Serializable {

    @SerializedName("fk_parent")
    @Expose
    private Integer fkParent;
    @SerializedName("label")
    @Expose
    private String label;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("color")
    @Expose
    private String color;
    @SerializedName("visible")
    @Expose
    private Integer visible;
    @SerializedName("type")
    @Expose
    private Integer type;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("entity")
    @Expose
    private Integer entity;
    @SerializedName("validateFieldsErrors")
    @Expose
    private List<Object> validateFieldsErrors = null;
    @SerializedName("import_key")
    @Expose
    private Object importKey;
    @SerializedName("array_options")
    @Expose
    private List<Object> arrayOptions = null;
    @SerializedName("array_languages")
    @Expose
    private Object arrayLanguages;
    @SerializedName("linkedObjectsIds")
    @Expose
    private Object linkedObjectsIds;
    @SerializedName("origin")
    @Expose
    private Object origin;
    @SerializedName("origin_id")
    @Expose
    private Object originId;
    @SerializedName("ref")
    @Expose
    private Object ref;
    @SerializedName("ref_ext")
    @Expose
    private String refExt;
    @SerializedName("status")
    @Expose
    private Object status;
    @SerializedName("state_id")
    @Expose
    private Object stateId;
    @SerializedName("region_id")
    @Expose
    private Object regionId;
    @SerializedName("demand_reason_id")
    @Expose
    private Object demandReasonId;
    @SerializedName("transport_mode_id")
    @Expose
    private Object transportModeId;
    @SerializedName("model_pdf")
    @Expose
    private Object modelPdf;
    @SerializedName("last_main_doc")
    @Expose
    private Object lastMainDoc;
    @SerializedName("fk_bank")
    @Expose
    private Object fkBank;
    @SerializedName("note_public")
    @Expose
    private Object notePublic;
    @SerializedName("note_private")
    @Expose
    private Object notePrivate;
    @SerializedName("date_creation")
    @Expose
    private Integer dateCreation;
    @SerializedName("date_validation")
    @Expose
    private Object dateValidation;
    @SerializedName("date_modification")
    @Expose
    private Integer dateModification;
    @SerializedName("specimen")
    @Expose
    private Integer specimen;
    @SerializedName("user_creation")
    @Expose
    private Integer userCreation;
    @SerializedName("user_modification")
    @Expose
    private Integer userModification;

    public Integer getFkParent() {
        return fkParent;
    }

    public void setFkParent(Integer fkParent) {
        this.fkParent = fkParent;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getVisible() {
        return visible;
    }

    public void setVisible(Integer visible) {
        this.visible = visible;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getEntity() {
        return entity;
    }

    public void setEntity(Integer entity) {
        this.entity = entity;
    }

    public List<Object> getValidateFieldsErrors() {
        return validateFieldsErrors;
    }

    public void setValidateFieldsErrors(List<Object> validateFieldsErrors) {
        this.validateFieldsErrors = validateFieldsErrors;
    }

    public Object getImportKey() {
        return importKey;
    }

    public void setImportKey(Object importKey) {
        this.importKey = importKey;
    }

    public List<Object> getArrayOptions() {
        return arrayOptions;
    }

    public void setArrayOptions(List<Object> arrayOptions) {
        this.arrayOptions = arrayOptions;
    }

    public Object getArrayLanguages() {
        return arrayLanguages;
    }

    public void setArrayLanguages(Object arrayLanguages) {
        this.arrayLanguages = arrayLanguages;
    }

    public Object getLinkedObjectsIds() {
        return linkedObjectsIds;
    }

    public void setLinkedObjectsIds(Object linkedObjectsIds) {
        this.linkedObjectsIds = linkedObjectsIds;
    }

    public Object getOrigin() {
        return origin;
    }

    public void setOrigin(Object origin) {
        this.origin = origin;
    }

    public Object getOriginId() {
        return originId;
    }

    public void setOriginId(Object originId) {
        this.originId = originId;
    }

    public Object getRef() {
        return ref;
    }

    public void setRef(Object ref) {
        this.ref = ref;
    }

    public String getRefExt() {
        return refExt;
    }

    public void setRefExt(String refExt) {
        this.refExt = refExt;
    }

    public Object getStatus() {
        return status;
    }

    public void setStatus(Object status) {
        this.status = status;
    }

    public Object getStateId() {
        return stateId;
    }

    public void setStateId(Object stateId) {
        this.stateId = stateId;
    }

    public Object getRegionId() {
        return regionId;
    }

    public void setRegionId(Object regionId) {
        this.regionId = regionId;
    }

    public Object getDemandReasonId() {
        return demandReasonId;
    }

    public void setDemandReasonId(Object demandReasonId) {
        this.demandReasonId = demandReasonId;
    }

    public Object getTransportModeId() {
        return transportModeId;
    }

    public void setTransportModeId(Object transportModeId) {
        this.transportModeId = transportModeId;
    }

    public Object getModelPdf() {
        return modelPdf;
    }

    public void setModelPdf(Object modelPdf) {
        this.modelPdf = modelPdf;
    }

    public Object getLastMainDoc() {
        return lastMainDoc;
    }

    public void setLastMainDoc(Object lastMainDoc) {
        this.lastMainDoc = lastMainDoc;
    }

    public Object getFkBank() {
        return fkBank;
    }

    public void setFkBank(Object fkBank) {
        this.fkBank = fkBank;
    }

    public Object getNotePublic() {
        return notePublic;
    }

    public void setNotePublic(Object notePublic) {
        this.notePublic = notePublic;
    }

    public Object getNotePrivate() {
        return notePrivate;
    }

    public void setNotePrivate(Object notePrivate) {
        this.notePrivate = notePrivate;
    }

    public Integer getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Integer dateCreation) {
        this.dateCreation = dateCreation;
    }

    public Object getDateValidation() {
        return dateValidation;
    }

    public void setDateValidation(Object dateValidation) {
        this.dateValidation = dateValidation;
    }

    public Integer getDateModification() {
        return dateModification;
    }

    public void setDateModification(Integer dateModification) {
        this.dateModification = dateModification;
    }

    public Integer getSpecimen() {
        return specimen;
    }

    public void setSpecimen(Integer specimen) {
        this.specimen = specimen;
    }

    public Integer getUserCreation() {
        return userCreation;
    }

    public void setUserCreation(Integer userCreation) {
        this.userCreation = userCreation;
    }

    public Integer getUserModification() {
        return userModification;
    }

    public void setUserModification(Integer userModification) {
        this.userModification = userModification;
    }

}
