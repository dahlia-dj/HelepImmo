
package com.djoumessi.progmobile.helepimmo.common;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Product implements Serializable {

    @SerializedName("label")
    @Expose
    private String label;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("other")
    @Expose
    private Object other;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("price")
    @Expose
    private String price;
    @SerializedName("price_ttc")
    @Expose
    private String priceTtc;
    @SerializedName("price_min")
    @Expose
    private String priceMin;
    @SerializedName("price_min_ttc")
    @Expose
    private String priceMinTtc;
    @SerializedName("price_base_type")
    @Expose
    private String priceBaseType;
    @SerializedName("multiprices")
    @Expose
    private List<Object> multiprices = null;
    @SerializedName("multiprices_ttc")
    @Expose
    private List<Object> multipricesTtc = null;
    @SerializedName("multiprices_base_type")
    @Expose
    private List<Object> multipricesBaseType = null;
    @SerializedName("multiprices_min")
    @Expose
    private List<Object> multipricesMin = null;
    @SerializedName("multiprices_min_ttc")
    @Expose
    private List<Object> multipricesMinTtc = null;
    @SerializedName("multiprices_tva_tx")
    @Expose
    private List<Object> multipricesTvaTx = null;
    @SerializedName("prices_by_qty")
    @Expose
    private List<Object> pricesByQty = null;
    @SerializedName("prices_by_qty_list")
    @Expose
    private List<Object> pricesByQtyList = null;
    @SerializedName("multilangs")
    @Expose
    private List<Object> multilangs = null;
    @SerializedName("default_vat_code")
    @Expose
    private Object defaultVatCode;
    @SerializedName("tva_tx")
    @Expose
    private String tvaTx;
    @SerializedName("localtax1_tx")
    @Expose
    private String localtax1Tx;
    @SerializedName("localtax2_tx")
    @Expose
    private String localtax2Tx;
    @SerializedName("localtax1_type")
    @Expose
    private String localtax1Type;
    @SerializedName("localtax2_type")
    @Expose
    private String localtax2Type;
    @SerializedName("lifetime")
    @Expose
    private Object lifetime;
    @SerializedName("qc_frequency")
    @Expose
    private Object qcFrequency;
    @SerializedName("cost_price")
    @Expose
    private Object costPrice;
    @SerializedName("pmp")
    @Expose
    private String pmp;
    @SerializedName("seuil_stock_alerte")
    @Expose
    private String seuilStockAlerte;
    @SerializedName("desiredstock")
    @Expose
    private String desiredstock;
    @SerializedName("duration_value")
    @Expose
    private Boolean durationValue;
    @SerializedName("duration_unit")
    @Expose
    private String durationUnit;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("status_buy")
    @Expose
    private String statusBuy;
    @SerializedName("finished")
    @Expose
    private Object finished;
    @SerializedName("fk_default_bom")
    @Expose
    private Object fkDefaultBom;
    @SerializedName("status_batch")
    @Expose
    private String statusBatch;
    @SerializedName("batch_mask")
    @Expose
    private String batchMask;
    @SerializedName("customcode")
    @Expose
    private String customcode;
    @SerializedName("url")
    @Expose
    private Object url;
    @SerializedName("weight")
    @Expose
    private Object weight;
    @SerializedName("weight_units")
    @Expose
    private String weightUnits;
    @SerializedName("length")
    @Expose
    private Object length;
    @SerializedName("length_units")
    @Expose
    private String lengthUnits;
    @SerializedName("width")
    @Expose
    private Object width;
    @SerializedName("width_units")
    @Expose
    private String widthUnits;
    @SerializedName("height")
    @Expose
    private Object height;
    @SerializedName("height_units")
    @Expose
    private String heightUnits;
    @SerializedName("surface")
    @Expose
    private String surface;
    @SerializedName("surface_units")
    @Expose
    private String surfaceUnits;
    @SerializedName("volume")
    @Expose
    private Object volume;
    @SerializedName("volume_units")
    @Expose
    private String volumeUnits;
    @SerializedName("net_measure")
    @Expose
    private Object netMeasure;
    @SerializedName("net_measure_units")
    @Expose
    private Object netMeasureUnits;
    @SerializedName("accountancy_code_sell")
    @Expose
    private String accountancyCodeSell;
    @SerializedName("accountancy_code_sell_intra")
    @Expose
    private String accountancyCodeSellIntra;
    @SerializedName("accountancy_code_sell_export")
    @Expose
    private String accountancyCodeSellExport;
    @SerializedName("accountancy_code_buy")
    @Expose
    private String accountancyCodeBuy;
    @SerializedName("accountancy_code_buy_intra")
    @Expose
    private String accountancyCodeBuyIntra;
    @SerializedName("accountancy_code_buy_export")
    @Expose
    private String accountancyCodeBuyExport;
    @SerializedName("barcode")
    @Expose
    private Object barcode;
    @SerializedName("barcode_type")
    @Expose
    private Object barcodeType;
    @SerializedName("date_creation")
    @Expose
    private String dateCreation;
    @SerializedName("date_modification")
    @Expose
    private String dateModification;
    @SerializedName("fk_default_warehouse")
    @Expose
    private Object fkDefaultWarehouse;
    @SerializedName("fk_price_expression")
    @Expose
    private Object fkPriceExpression;
    @SerializedName("fk_unit")
    @Expose
    private Object fkUnit;
    @SerializedName("price_autogen")
    @Expose
    private String priceAutogen;
    @SerializedName("is_object_used")
    @Expose
    private Object isObjectUsed;
    @SerializedName("mandatory_period")
    @Expose
    private String mandatoryPeriod;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("entity")
    @Expose
    private String entity;
    @SerializedName("validateFieldsErrors")
    @Expose
    private List<Object> validateFieldsErrors = null;
    @SerializedName("import_key")
    @Expose
    private Object importKey;
    @SerializedName("array_options")
    @Expose
    private ArrayOptions arrayOptions;
    @SerializedName("array_languages")
    @Expose
    private Object arrayLanguages;
    @SerializedName("linkedObjectsIds")
    @Expose
    private Object linkedObjectsIds;
    @SerializedName("canvas")
    @Expose
    private String canvas;
    @SerializedName("ref")
    @Expose
    private String ref;
    @SerializedName("ref_ext")
    @Expose
    private Object refExt;
    @SerializedName("country_id")
    @Expose
    private String countryId;
    @SerializedName("country_code")
    @Expose
    private String countryCode;
    @SerializedName("state_id")
    @Expose
    private Object stateId;
    @SerializedName("region_id")
    @Expose
    private Object regionId;
    @SerializedName("barcode_type_coder")
    @Expose
    private Object barcodeTypeCoder;
    @SerializedName("last_main_doc")
    @Expose
    private Object lastMainDoc;
    @SerializedName("note_public")
    @Expose
    private Object notePublic;
    @SerializedName("note_private")
    @Expose
    private String notePrivate;
    @SerializedName("total_ht")
    @Expose
    private Object totalHt;
    @SerializedName("total_tva")
    @Expose
    private Object totalTva;
    @SerializedName("total_localtax1")
    @Expose
    private Object totalLocaltax1;
    @SerializedName("total_localtax2")
    @Expose
    private Object totalLocaltax2;
    @SerializedName("total_ttc")
    @Expose
    private Object totalTtc;
    @SerializedName("date_validation")
    @Expose
    private Object dateValidation;
    @SerializedName("specimen")
    @Expose
    private Integer specimen;
    @SerializedName("duration")
    @Expose
    private String duration;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Product() {
    }

    /**
     * 
     * @param seuilStockAlerte
     * @param multipricesTvaTx
     * @param dateCreation
     * @param priceTtc
     * @param multilangs
     * @param linkedObjectsIds
     * @param localtax1Tx
     * @param lifetime
     * @param accountancyCodeBuy
     * @param lengthUnits
     * @param type
     * @param arrayLanguages
     * @param priceMin
     * @param pmp
     * @param ref
     * @param multipricesBaseType
     * @param accountancyCodeSellIntra
     * @param price
     * @param priceAutogen
     * @param weightUnits
     * @param tvaTx
     * @param durationUnit
     * @param id
     * @param barcode
     * @param customcode
     * @param multiprices
     * @param widthUnits
     * @param height
     * @param lastMainDoc
     * @param canvas
     * @param surfaceUnits
     * @param surface
     * @param dateModification
     * @param statusBatch
     * @param totalTtc
     * @param defaultVatCode
     * @param weight
     * @param finished
     * @param statusBuy
     * @param fkDefaultWarehouse
     * @param volume
     * @param accountancyCodeSellExport
     * @param volumeUnits
     * @param validateFieldsErrors
     * @param netMeasure
     * @param totalHt
     * @param status
     * @param notePublic
     * @param multipricesMinTtc
     * @param other
     * @param accountancyCodeSell
     * @param desiredstock
     * @param priceMinTtc
     * @param fkDefaultBom
     * @param barcodeType
     * @param localtax2Type
     * @param description
     * @param refExt
     * @param localtax2Tx
     * @param countryId
     * @param fkPriceExpression
     * @param duration
     * @param multipricesMin
     * @param countryCode
     * @param specimen
     * @param mandatoryPeriod
     * @param accountancyCodeBuyIntra
     * @param notePrivate
     * @param pricesByQty
     * @param heightUnits
     * @param netMeasureUnits
     * @param batchMask
     * @param accountancyCodeBuyExport
     * @param isObjectUsed
     * @param pricesByQtyList
     * @param durationValue
     * @param stateId
     * @param costPrice
     * @param length
     * @param label
     * @param importKey
     * @param totalTva
     * @param url
     * @param totalLocaltax1
     * @param arrayOptions
     * @param barcodeTypeCoder
     * @param totalLocaltax2
     * @param fkUnit
     * @param priceBaseType
     * @param qcFrequency
     * @param regionId
     * @param width
     * @param multipricesTtc
     * @param localtax1Type
     * @param dateValidation
     * @param entity
     */
    public Product(String label, String description, Object other, String type, String price, String priceTtc, String priceMin, String priceMinTtc, String priceBaseType, List<Object> multiprices, List<Object> multipricesTtc, List<Object> multipricesBaseType, List<Object> multipricesMin, List<Object> multipricesMinTtc, List<Object> multipricesTvaTx, List<Object> pricesByQty, List<Object> pricesByQtyList, List<Object> multilangs, Object defaultVatCode, String tvaTx, String localtax1Tx, String localtax2Tx, String localtax1Type, String localtax2Type, Object lifetime, Object qcFrequency, Object costPrice, String pmp, String seuilStockAlerte, String desiredstock, Boolean durationValue, String durationUnit, String status, String statusBuy, Object finished, Object fkDefaultBom, String statusBatch, String batchMask, String customcode, Object url, Object weight, String weightUnits, Object length, String lengthUnits, Object width, String widthUnits, Object height, String heightUnits, String surface, String surfaceUnits, Object volume, String volumeUnits, Object netMeasure, Object netMeasureUnits, String accountancyCodeSell, String accountancyCodeSellIntra, String accountancyCodeSellExport, String accountancyCodeBuy, String accountancyCodeBuyIntra, String accountancyCodeBuyExport, Object barcode, Object barcodeType, String dateCreation, String dateModification, Object fkDefaultWarehouse, Object fkPriceExpression, Object fkUnit, String priceAutogen, Object isObjectUsed, String mandatoryPeriod, String id, String entity, List<Object> validateFieldsErrors, Object importKey, ArrayOptions arrayOptions, Object arrayLanguages, Object linkedObjectsIds, String canvas, String ref, Object refExt, String countryId, String countryCode, Object stateId, Object regionId, Object barcodeTypeCoder, Object lastMainDoc, Object notePublic, String notePrivate, Object totalHt, Object totalTva, Object totalLocaltax1, Object totalLocaltax2, Object totalTtc, Object dateValidation, Integer specimen, String duration) {
        super();
        this.label = label;
        this.description = description;
        this.other = other;
        this.type = type;
        this.price = price;
        this.priceTtc = priceTtc;
        this.priceMin = priceMin;
        this.priceMinTtc = priceMinTtc;
        this.priceBaseType = priceBaseType;
        this.multiprices = multiprices;
        this.multipricesTtc = multipricesTtc;
        this.multipricesBaseType = multipricesBaseType;
        this.multipricesMin = multipricesMin;
        this.multipricesMinTtc = multipricesMinTtc;
        this.multipricesTvaTx = multipricesTvaTx;
        this.pricesByQty = pricesByQty;
        this.pricesByQtyList = pricesByQtyList;
        this.multilangs = multilangs;
        this.defaultVatCode = defaultVatCode;
        this.tvaTx = tvaTx;
        this.localtax1Tx = localtax1Tx;
        this.localtax2Tx = localtax2Tx;
        this.localtax1Type = localtax1Type;
        this.localtax2Type = localtax2Type;
        this.lifetime = lifetime;
        this.qcFrequency = qcFrequency;
        this.costPrice = costPrice;
        this.pmp = pmp;
        this.seuilStockAlerte = seuilStockAlerte;
        this.desiredstock = desiredstock;
        this.durationValue = durationValue;
        this.durationUnit = durationUnit;
        this.status = status;
        this.statusBuy = statusBuy;
        this.finished = finished;
        this.fkDefaultBom = fkDefaultBom;
        this.statusBatch = statusBatch;
        this.batchMask = batchMask;
        this.customcode = customcode;
        this.url = url;
        this.weight = weight;
        this.weightUnits = weightUnits;
        this.length = length;
        this.lengthUnits = lengthUnits;
        this.width = width;
        this.widthUnits = widthUnits;
        this.height = height;
        this.heightUnits = heightUnits;
        this.surface = surface;
        this.surfaceUnits = surfaceUnits;
        this.volume = volume;
        this.volumeUnits = volumeUnits;
        this.netMeasure = netMeasure;
        this.netMeasureUnits = netMeasureUnits;
        this.accountancyCodeSell = accountancyCodeSell;
        this.accountancyCodeSellIntra = accountancyCodeSellIntra;
        this.accountancyCodeSellExport = accountancyCodeSellExport;
        this.accountancyCodeBuy = accountancyCodeBuy;
        this.accountancyCodeBuyIntra = accountancyCodeBuyIntra;
        this.accountancyCodeBuyExport = accountancyCodeBuyExport;
        this.barcode = barcode;
        this.barcodeType = barcodeType;
        this.dateCreation = dateCreation;
        this.dateModification = dateModification;
        this.fkDefaultWarehouse = fkDefaultWarehouse;
        this.fkPriceExpression = fkPriceExpression;
        this.fkUnit = fkUnit;
        this.priceAutogen = priceAutogen;
        this.isObjectUsed = isObjectUsed;
        this.mandatoryPeriod = mandatoryPeriod;
        this.id = id;
        this.entity = entity;
        this.validateFieldsErrors = validateFieldsErrors;
        this.importKey = importKey;
        this.arrayOptions = arrayOptions;
        this.arrayLanguages = arrayLanguages;
        this.linkedObjectsIds = linkedObjectsIds;
        this.canvas = canvas;
        this.ref = ref;
        this.refExt = refExt;
        this.countryId = countryId;
        this.countryCode = countryCode;
        this.stateId = stateId;
        this.regionId = regionId;
        this.barcodeTypeCoder = barcodeTypeCoder;
        this.lastMainDoc = lastMainDoc;
        this.notePublic = notePublic;
        this.notePrivate = notePrivate;
        this.totalHt = totalHt;
        this.totalTva = totalTva;
        this.totalLocaltax1 = totalLocaltax1;
        this.totalLocaltax2 = totalLocaltax2;
        this.totalTtc = totalTtc;
        this.dateValidation = dateValidation;
        this.specimen = specimen;
        this.duration = duration;
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

    public Object getOther() {
        return other;
    }

    public void setOther(Object other) {
        this.other = other;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPriceTtc() {
        return priceTtc;
    }

    public void setPriceTtc(String priceTtc) {
        this.priceTtc = priceTtc;
    }

    public String getPriceMin() {
        return priceMin;
    }

    public void setPriceMin(String priceMin) {
        this.priceMin = priceMin;
    }

    public String getPriceMinTtc() {
        return priceMinTtc;
    }

    public void setPriceMinTtc(String priceMinTtc) {
        this.priceMinTtc = priceMinTtc;
    }

    public String getPriceBaseType() {
        return priceBaseType;
    }

    public void setPriceBaseType(String priceBaseType) {
        this.priceBaseType = priceBaseType;
    }

    public List<Object> getMultiprices() {
        return multiprices;
    }

    public void setMultiprices(List<Object> multiprices) {
        this.multiprices = multiprices;
    }

    public List<Object> getMultipricesTtc() {
        return multipricesTtc;
    }

    public void setMultipricesTtc(List<Object> multipricesTtc) {
        this.multipricesTtc = multipricesTtc;
    }

    public List<Object> getMultipricesBaseType() {
        return multipricesBaseType;
    }

    public void setMultipricesBaseType(List<Object> multipricesBaseType) {
        this.multipricesBaseType = multipricesBaseType;
    }

    public List<Object> getMultipricesMin() {
        return multipricesMin;
    }

    public void setMultipricesMin(List<Object> multipricesMin) {
        this.multipricesMin = multipricesMin;
    }

    public List<Object> getMultipricesMinTtc() {
        return multipricesMinTtc;
    }

    public void setMultipricesMinTtc(List<Object> multipricesMinTtc) {
        this.multipricesMinTtc = multipricesMinTtc;
    }

    public List<Object> getMultipricesTvaTx() {
        return multipricesTvaTx;
    }

    public void setMultipricesTvaTx(List<Object> multipricesTvaTx) {
        this.multipricesTvaTx = multipricesTvaTx;
    }

    public List<Object> getPricesByQty() {
        return pricesByQty;
    }

    public void setPricesByQty(List<Object> pricesByQty) {
        this.pricesByQty = pricesByQty;
    }

    public List<Object> getPricesByQtyList() {
        return pricesByQtyList;
    }

    public void setPricesByQtyList(List<Object> pricesByQtyList) {
        this.pricesByQtyList = pricesByQtyList;
    }

    public List<Object> getMultilangs() {
        return multilangs;
    }

    public void setMultilangs(List<Object> multilangs) {
        this.multilangs = multilangs;
    }

    public Object getDefaultVatCode() {
        return defaultVatCode;
    }

    public void setDefaultVatCode(Object defaultVatCode) {
        this.defaultVatCode = defaultVatCode;
    }

    public String getTvaTx() {
        return tvaTx;
    }

    public void setTvaTx(String tvaTx) {
        this.tvaTx = tvaTx;
    }

    public String getLocaltax1Tx() {
        return localtax1Tx;
    }

    public void setLocaltax1Tx(String localtax1Tx) {
        this.localtax1Tx = localtax1Tx;
    }

    public String getLocaltax2Tx() {
        return localtax2Tx;
    }

    public void setLocaltax2Tx(String localtax2Tx) {
        this.localtax2Tx = localtax2Tx;
    }

    public String getLocaltax1Type() {
        return localtax1Type;
    }

    public void setLocaltax1Type(String localtax1Type) {
        this.localtax1Type = localtax1Type;
    }

    public String getLocaltax2Type() {
        return localtax2Type;
    }

    public void setLocaltax2Type(String localtax2Type) {
        this.localtax2Type = localtax2Type;
    }

    public Object getLifetime() {
        return lifetime;
    }

    public void setLifetime(Object lifetime) {
        this.lifetime = lifetime;
    }

    public Object getQcFrequency() {
        return qcFrequency;
    }

    public void setQcFrequency(Object qcFrequency) {
        this.qcFrequency = qcFrequency;
    }

    public Object getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(Object costPrice) {
        this.costPrice = costPrice;
    }

    public String getPmp() {
        return pmp;
    }

    public void setPmp(String pmp) {
        this.pmp = pmp;
    }

    public String getSeuilStockAlerte() {
        return seuilStockAlerte;
    }

    public void setSeuilStockAlerte(String seuilStockAlerte) {
        this.seuilStockAlerte = seuilStockAlerte;
    }

    public String getDesiredstock() {
        return desiredstock;
    }

    public void setDesiredstock(String desiredstock) {
        this.desiredstock = desiredstock;
    }

    public Boolean getDurationValue() {
        return durationValue;
    }

    public void setDurationValue(Boolean durationValue) {
        this.durationValue = durationValue;
    }

    public String getDurationUnit() {
        return durationUnit;
    }

    public void setDurationUnit(String durationUnit) {
        this.durationUnit = durationUnit;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatusBuy() {
        return statusBuy;
    }

    public void setStatusBuy(String statusBuy) {
        this.statusBuy = statusBuy;
    }

    public Object getFinished() {
        return finished;
    }

    public void setFinished(Object finished) {
        this.finished = finished;
    }

    public Object getFkDefaultBom() {
        return fkDefaultBom;
    }

    public void setFkDefaultBom(Object fkDefaultBom) {
        this.fkDefaultBom = fkDefaultBom;
    }

    public String getStatusBatch() {
        return statusBatch;
    }

    public void setStatusBatch(String statusBatch) {
        this.statusBatch = statusBatch;
    }

    public String getBatchMask() {
        return batchMask;
    }

    public void setBatchMask(String batchMask) {
        this.batchMask = batchMask;
    }

    public String getCustomcode() {
        return customcode;
    }

    public void setCustomcode(String customcode) {
        this.customcode = customcode;
    }

    public Object getUrl() {
        return url;
    }

    public void setUrl(Object url) {
        this.url = url;
    }

    public Object getWeight() {
        return weight;
    }

    public void setWeight(Object weight) {
        this.weight = weight;
    }

    public String getWeightUnits() {
        return weightUnits;
    }

    public void setWeightUnits(String weightUnits) {
        this.weightUnits = weightUnits;
    }

    public Object getLength() {
        return length;
    }

    public void setLength(Object length) {
        this.length = length;
    }

    public String getLengthUnits() {
        return lengthUnits;
    }

    public void setLengthUnits(String lengthUnits) {
        this.lengthUnits = lengthUnits;
    }

    public Object getWidth() {
        return width;
    }

    public void setWidth(Object width) {
        this.width = width;
    }

    public String getWidthUnits() {
        return widthUnits;
    }

    public void setWidthUnits(String widthUnits) {
        this.widthUnits = widthUnits;
    }

    public Object getHeight() {
        return height;
    }

    public void setHeight(Object height) {
        this.height = height;
    }

    public String getHeightUnits() {
        return heightUnits;
    }

    public void setHeightUnits(String heightUnits) {
        this.heightUnits = heightUnits;
    }

    public String getSurface() {
        return surface;
    }

    public void setSurface(String surface) {
        this.surface = surface;
    }

    public String getSurfaceUnits() {
        return surfaceUnits;
    }

    public void setSurfaceUnits(String surfaceUnits) {
        this.surfaceUnits = surfaceUnits;
    }

    public Object getVolume() {
        return volume;
    }

    public void setVolume(Object volume) {
        this.volume = volume;
    }

    public String getVolumeUnits() {
        return volumeUnits;
    }

    public void setVolumeUnits(String volumeUnits) {
        this.volumeUnits = volumeUnits;
    }

    public Object getNetMeasure() {
        return netMeasure;
    }

    public void setNetMeasure(Object netMeasure) {
        this.netMeasure = netMeasure;
    }

    public Object getNetMeasureUnits() {
        return netMeasureUnits;
    }

    public void setNetMeasureUnits(Object netMeasureUnits) {
        this.netMeasureUnits = netMeasureUnits;
    }

    public String getAccountancyCodeSell() {
        return accountancyCodeSell;
    }

    public void setAccountancyCodeSell(String accountancyCodeSell) {
        this.accountancyCodeSell = accountancyCodeSell;
    }

    public String getAccountancyCodeSellIntra() {
        return accountancyCodeSellIntra;
    }

    public void setAccountancyCodeSellIntra(String accountancyCodeSellIntra) {
        this.accountancyCodeSellIntra = accountancyCodeSellIntra;
    }

    public String getAccountancyCodeSellExport() {
        return accountancyCodeSellExport;
    }

    public void setAccountancyCodeSellExport(String accountancyCodeSellExport) {
        this.accountancyCodeSellExport = accountancyCodeSellExport;
    }

    public String getAccountancyCodeBuy() {
        return accountancyCodeBuy;
    }

    public void setAccountancyCodeBuy(String accountancyCodeBuy) {
        this.accountancyCodeBuy = accountancyCodeBuy;
    }

    public String getAccountancyCodeBuyIntra() {
        return accountancyCodeBuyIntra;
    }

    public void setAccountancyCodeBuyIntra(String accountancyCodeBuyIntra) {
        this.accountancyCodeBuyIntra = accountancyCodeBuyIntra;
    }

    public String getAccountancyCodeBuyExport() {
        return accountancyCodeBuyExport;
    }

    public void setAccountancyCodeBuyExport(String accountancyCodeBuyExport) {
        this.accountancyCodeBuyExport = accountancyCodeBuyExport;
    }

    public Object getBarcode() {
        return barcode;
    }

    public void setBarcode(Object barcode) {
        this.barcode = barcode;
    }

    public Object getBarcodeType() {
        return barcodeType;
    }

    public void setBarcodeType(Object barcodeType) {
        this.barcodeType = barcodeType;
    }

    public String getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(String dateCreation) {
        this.dateCreation = dateCreation;
    }

    public String getDateModification() {
        return dateModification;
    }

    public void setDateModification(String dateModification) {
        this.dateModification = dateModification;
    }

    public Object getFkDefaultWarehouse() {
        return fkDefaultWarehouse;
    }

    public void setFkDefaultWarehouse(Object fkDefaultWarehouse) {
        this.fkDefaultWarehouse = fkDefaultWarehouse;
    }

    public Object getFkPriceExpression() {
        return fkPriceExpression;
    }

    public void setFkPriceExpression(Object fkPriceExpression) {
        this.fkPriceExpression = fkPriceExpression;
    }

    public Object getFkUnit() {
        return fkUnit;
    }

    public void setFkUnit(Object fkUnit) {
        this.fkUnit = fkUnit;
    }

    public String getPriceAutogen() {
        return priceAutogen;
    }

    public void setPriceAutogen(String priceAutogen) {
        this.priceAutogen = priceAutogen;
    }

    public Object getIsObjectUsed() {
        return isObjectUsed;
    }

    public void setIsObjectUsed(Object isObjectUsed) {
        this.isObjectUsed = isObjectUsed;
    }

    public String getMandatoryPeriod() {
        return mandatoryPeriod;
    }

    public void setMandatoryPeriod(String mandatoryPeriod) {
        this.mandatoryPeriod = mandatoryPeriod;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEntity() {
        return entity;
    }

    public void setEntity(String entity) {
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

    public ArrayOptions getArrayOptions() {
        return arrayOptions;
    }

    public void setArrayOptions(ArrayOptions arrayOptions) {
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

    public String getCanvas() {
        return canvas;
    }

    public void setCanvas(String canvas) {
        this.canvas = canvas;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public Object getRefExt() {
        return refExt;
    }

    public void setRefExt(Object refExt) {
        this.refExt = refExt;
    }

    public String getCountryId() {
        return countryId;
    }

    public void setCountryId(String countryId) {
        this.countryId = countryId;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
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

    public Object getBarcodeTypeCoder() {
        return barcodeTypeCoder;
    }

    public void setBarcodeTypeCoder(Object barcodeTypeCoder) {
        this.barcodeTypeCoder = barcodeTypeCoder;
    }

    public Object getLastMainDoc() {
        return lastMainDoc;
    }

    public void setLastMainDoc(Object lastMainDoc) {
        this.lastMainDoc = lastMainDoc;
    }

    public Object getNotePublic() {
        return notePublic;
    }

    public void setNotePublic(Object notePublic) {
        this.notePublic = notePublic;
    }

    public String getNotePrivate() {
        return notePrivate;
    }

    public void setNotePrivate(String notePrivate) {
        this.notePrivate = notePrivate;
    }

    public Object getTotalHt() {
        return totalHt;
    }

    public void setTotalHt(Object totalHt) {
        this.totalHt = totalHt;
    }

    public Object getTotalTva() {
        return totalTva;
    }

    public void setTotalTva(Object totalTva) {
        this.totalTva = totalTva;
    }

    public Object getTotalLocaltax1() {
        return totalLocaltax1;
    }

    public void setTotalLocaltax1(Object totalLocaltax1) {
        this.totalLocaltax1 = totalLocaltax1;
    }

    public Object getTotalLocaltax2() {
        return totalLocaltax2;
    }

    public void setTotalLocaltax2(Object totalLocaltax2) {
        this.totalLocaltax2 = totalLocaltax2;
    }

    public Object getTotalTtc() {
        return totalTtc;
    }

    public void setTotalTtc(Object totalTtc) {
        this.totalTtc = totalTtc;
    }

    public Object getDateValidation() {
        return dateValidation;
    }

    public void setDateValidation(Object dateValidation) {
        this.dateValidation = dateValidation;
    }

    public Integer getSpecimen() {
        return specimen;
    }

    public void setSpecimen(Integer specimen) {
        this.specimen = specimen;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

}
