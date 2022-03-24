
package com.djoumessi.progmobile.helepimmo.common;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ThirdParty {

    @SerializedName("entity")
    @Expose
    private String entity;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("name_alias")
    @Expose
    private String nameAlias;
    @SerializedName("address")
    @Expose
    private String address;
    @SerializedName("zip")
    @Expose
    private Object zip;
    @SerializedName("town")
    @Expose
    private String town;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("state_id")
    @Expose
    private Object stateId;
    @SerializedName("phone")
    @Expose
    private String phone;
    @SerializedName("fax")
    @Expose
    private Object fax;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("socialnetworks")
    @Expose
    private List<Object> socialnetworks = null;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("barcode")
    @Expose
    private Object barcode;
    @SerializedName("idprof1")
    @Expose
    private String idprof1;
    @SerializedName("idprof2")
    @Expose
    private String idprof2;
    @SerializedName("idprof3")
    @Expose
    private String idprof3;
    @SerializedName("idprof4")
    @Expose
    private String idprof4;
    @SerializedName("idprof5")
    @Expose
    private String idprof5;
    @SerializedName("idprof6")
    @Expose
    private String idprof6;
    @SerializedName("tva_assuj")
    @Expose
    private String tvaAssuj;
    @SerializedName("tva_intra")
    @Expose
    private String tvaIntra;
    @SerializedName("localtax1_assuj")
    @Expose
    private Object localtax1Assuj;
    @SerializedName("localtax1_value")
    @Expose
    private String localtax1Value;
    @SerializedName("localtax2_assuj")
    @Expose
    private Object localtax2Assuj;
    @SerializedName("localtax2_value")
    @Expose
    private String localtax2Value;
    @SerializedName("managers")
    @Expose
    private Object managers;
    @SerializedName("capital")
    @Expose
    private Object capital;
    @SerializedName("typent_id")
    @Expose
    private String typentId;
    @SerializedName("typent_code")
    @Expose
    private Object typentCode;
    @SerializedName("effectif")
    @Expose
    private String effectif;
    @SerializedName("effectif_id")
    @Expose
    private Object effectifId;
    @SerializedName("forme_juridique_code")
    @Expose
    private Object formeJuridiqueCode;
    @SerializedName("forme_juridique")
    @Expose
    private String formeJuridique;
    @SerializedName("remise_percent")
    @Expose
    private Integer remisePercent;
    @SerializedName("remise_supplier_percent")
    @Expose
    private String remiseSupplierPercent;
    @SerializedName("mode_reglement_supplier_id")
    @Expose
    private Object modeReglementSupplierId;
    @SerializedName("cond_reglement_supplier_id")
    @Expose
    private Object condReglementSupplierId;
    @SerializedName("transport_mode_supplier_id")
    @Expose
    private Object transportModeSupplierId;
    @SerializedName("fk_prospectlevel")
    @Expose
    private String fkProspectlevel;
    @SerializedName("date_modification")
    @Expose
    private Integer dateModification;
    @SerializedName("user_modification")
    @Expose
    private String userModification;
    @SerializedName("date_creation")
    @Expose
    private Integer dateCreation;
    @SerializedName("user_creation")
    @Expose
    private String userCreation;
    @SerializedName("client")
    @Expose
    private String client;
    @SerializedName("prospect")
    @Expose
    private Integer prospect;
    @SerializedName("fournisseur")
    @Expose
    private String fournisseur;
    @SerializedName("code_client")
    @Expose
    private String codeClient;
    @SerializedName("code_fournisseur")
    @Expose
    private Object codeFournisseur;
    @SerializedName("code_compta_client")
    @Expose
    private Object codeComptaClient;
    @SerializedName("code_compta")
    @Expose
    private Object codeCompta;
    @SerializedName("accountancy_code_customer")
    @Expose
    private Object accountancyCodeCustomer;
    @SerializedName("code_compta_fournisseur")
    @Expose
    private Object codeComptaFournisseur;
    @SerializedName("accountancy_code_supplier")
    @Expose
    private Object accountancyCodeSupplier;
    @SerializedName("code_compta_product")
    @Expose
    private Object codeComptaProduct;
    @SerializedName("note_private")
    @Expose
    private Object notePrivate;
    @SerializedName("note_public")
    @Expose
    private Object notePublic;
    @SerializedName("stcomm_id")
    @Expose
    private String stcommId;
    @SerializedName("stcomm_picto")
    @Expose
    private Object stcommPicto;
    @SerializedName("status_prospect_label")
    @Expose
    private String statusProspectLabel;
    @SerializedName("price_level")
    @Expose
    private Object priceLevel;
    @SerializedName("outstanding_limit")
    @Expose
    private Object outstandingLimit;
    @SerializedName("order_min_amount")
    @Expose
    private Object orderMinAmount;
    @SerializedName("supplier_order_min_amount")
    @Expose
    private Object supplierOrderMinAmount;
    @SerializedName("parent")
    @Expose
    private Object parent;
    @SerializedName("default_lang")
    @Expose
    private Object defaultLang;
    @SerializedName("ref")
    @Expose
    private String ref;
    @SerializedName("ref_ext")
    @Expose
    private Object refExt;
    @SerializedName("import_key")
    @Expose
    private Object importKey;
    @SerializedName("webservices_url")
    @Expose
    private Object webservicesUrl;
    @SerializedName("webservices_key")
    @Expose
    private Object webservicesKey;
    @SerializedName("logo")
    @Expose
    private String logo;
    @SerializedName("logo_small")
    @Expose
    private Object logoSmall;
    @SerializedName("logo_mini")
    @Expose
    private Object logoMini;
    @SerializedName("logo_squarred")
    @Expose
    private Object logoSquarred;
    @SerializedName("logo_squarred_small")
    @Expose
    private Object logoSquarredSmall;
    @SerializedName("logo_squarred_mini")
    @Expose
    private Object logoSquarredMini;
    @SerializedName("accountancy_code_sell")
    @Expose
    private String accountancyCodeSell;
    @SerializedName("accountancy_code_buy")
    @Expose
    private String accountancyCodeBuy;
    @SerializedName("fk_multicurrency")
    @Expose
    private String fkMulticurrency;
    @SerializedName("fk_warehouse")
    @Expose
    private Object fkWarehouse;
    @SerializedName("multicurrency_code")
    @Expose
    private String multicurrencyCode;
    @SerializedName("partnerships")
    @Expose
    private List<Object> partnerships = null;
    @SerializedName("bank_account")
    @Expose
    private Object bankAccount;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("validateFieldsErrors")
    @Expose
    private List<Object> validateFieldsErrors = null;
    @SerializedName("array_options")
    @Expose
    private List<Object> arrayOptions = null;
    @SerializedName("array_languages")
    @Expose
    private Object arrayLanguages;
    @SerializedName("linkedObjectsIds")
    @Expose
    private Object linkedObjectsIds;
    @SerializedName("canvas")
    @Expose
    private Object canvas;
    @SerializedName("fk_project")
    @Expose
    private Object fkProject;
    @SerializedName("contact_id")
    @Expose
    private Object contactId;
    @SerializedName("user")
    @Expose
    private Object user;
    @SerializedName("origin")
    @Expose
    private Object origin;
    @SerializedName("origin_id")
    @Expose
    private Object originId;
    @SerializedName("statut")
    @Expose
    private Object statut;
    @SerializedName("country_id")
    @Expose
    private String countryId;
    @SerializedName("country_code")
    @Expose
    private String countryCode;
    @SerializedName("region_id")
    @Expose
    private Object regionId;
    @SerializedName("barcode_type")
    @Expose
    private Object barcodeType;
    @SerializedName("barcode_type_coder")
    @Expose
    private Object barcodeTypeCoder;
    @SerializedName("mode_reglement_id")
    @Expose
    private Object modeReglementId;
    @SerializedName("cond_reglement_id")
    @Expose
    private Object condReglementId;
    @SerializedName("demand_reason_id")
    @Expose
    private Object demandReasonId;
    @SerializedName("transport_mode_id")
    @Expose
    private Object transportModeId;
    @SerializedName("shipping_method_id")
    @Expose
    private Object shippingMethodId;
    @SerializedName("model_pdf")
    @Expose
    private String modelPdf;
    @SerializedName("last_main_doc")
    @Expose
    private Object lastMainDoc;
    @SerializedName("fk_bank")
    @Expose
    private Object fkBank;
    @SerializedName("fk_account")
    @Expose
    private String fkAccount;
    @SerializedName("lastname")
    @Expose
    private Object lastname;
    @SerializedName("firstname")
    @Expose
    private Object firstname;
    @SerializedName("civility_id")
    @Expose
    private Object civilityId;
    @SerializedName("date_validation")
    @Expose
    private Object dateValidation;
    @SerializedName("specimen")
    @Expose
    private Integer specimen;
    @SerializedName("fk_incoterms")
    @Expose
    private String fkIncoterms;
    @SerializedName("label_incoterms")
    @Expose
    private Object labelIncoterms;
    @SerializedName("location_incoterms")
    @Expose
    private Object locationIncoterms;

    public String getEntity() {
        return entity;
    }

    public void setEntity(String entity) {
        this.entity = entity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameAlias() {
        return nameAlias;
    }

    public void setNameAlias(String nameAlias) {
        this.nameAlias = nameAlias;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Object getZip() {
        return zip;
    }

    public void setZip(Object zip) {
        this.zip = zip;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object getStateId() {
        return stateId;
    }

    public void setStateId(Object stateId) {
        this.stateId = stateId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Object getFax() {
        return fax;
    }

    public void setFax(Object fax) {
        this.fax = fax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Object> getSocialnetworks() {
        return socialnetworks;
    }

    public void setSocialnetworks(List<Object> socialnetworks) {
        this.socialnetworks = socialnetworks;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Object getBarcode() {
        return barcode;
    }

    public void setBarcode(Object barcode) {
        this.barcode = barcode;
    }

    public String getIdprof1() {
        return idprof1;
    }

    public void setIdprof1(String idprof1) {
        this.idprof1 = idprof1;
    }

    public String getIdprof2() {
        return idprof2;
    }

    public void setIdprof2(String idprof2) {
        this.idprof2 = idprof2;
    }

    public String getIdprof3() {
        return idprof3;
    }

    public void setIdprof3(String idprof3) {
        this.idprof3 = idprof3;
    }

    public String getIdprof4() {
        return idprof4;
    }

    public void setIdprof4(String idprof4) {
        this.idprof4 = idprof4;
    }

    public String getIdprof5() {
        return idprof5;
    }

    public void setIdprof5(String idprof5) {
        this.idprof5 = idprof5;
    }

    public String getIdprof6() {
        return idprof6;
    }

    public void setIdprof6(String idprof6) {
        this.idprof6 = idprof6;
    }

    public String getTvaAssuj() {
        return tvaAssuj;
    }

    public void setTvaAssuj(String tvaAssuj) {
        this.tvaAssuj = tvaAssuj;
    }

    public String getTvaIntra() {
        return tvaIntra;
    }

    public void setTvaIntra(String tvaIntra) {
        this.tvaIntra = tvaIntra;
    }

    public Object getLocaltax1Assuj() {
        return localtax1Assuj;
    }

    public void setLocaltax1Assuj(Object localtax1Assuj) {
        this.localtax1Assuj = localtax1Assuj;
    }

    public String getLocaltax1Value() {
        return localtax1Value;
    }

    public void setLocaltax1Value(String localtax1Value) {
        this.localtax1Value = localtax1Value;
    }

    public Object getLocaltax2Assuj() {
        return localtax2Assuj;
    }

    public void setLocaltax2Assuj(Object localtax2Assuj) {
        this.localtax2Assuj = localtax2Assuj;
    }

    public String getLocaltax2Value() {
        return localtax2Value;
    }

    public void setLocaltax2Value(String localtax2Value) {
        this.localtax2Value = localtax2Value;
    }

    public Object getManagers() {
        return managers;
    }

    public void setManagers(Object managers) {
        this.managers = managers;
    }

    public Object getCapital() {
        return capital;
    }

    public void setCapital(Object capital) {
        this.capital = capital;
    }

    public String getTypentId() {
        return typentId;
    }

    public void setTypentId(String typentId) {
        this.typentId = typentId;
    }

    public Object getTypentCode() {
        return typentCode;
    }

    public void setTypentCode(Object typentCode) {
        this.typentCode = typentCode;
    }

    public String getEffectif() {
        return effectif;
    }

    public void setEffectif(String effectif) {
        this.effectif = effectif;
    }

    public Object getEffectifId() {
        return effectifId;
    }

    public void setEffectifId(Object effectifId) {
        this.effectifId = effectifId;
    }

    public Object getFormeJuridiqueCode() {
        return formeJuridiqueCode;
    }

    public void setFormeJuridiqueCode(Object formeJuridiqueCode) {
        this.formeJuridiqueCode = formeJuridiqueCode;
    }

    public String getFormeJuridique() {
        return formeJuridique;
    }

    public void setFormeJuridique(String formeJuridique) {
        this.formeJuridique = formeJuridique;
    }

    public Integer getRemisePercent() {
        return remisePercent;
    }

    public void setRemisePercent(Integer remisePercent) {
        this.remisePercent = remisePercent;
    }

    public String getRemiseSupplierPercent() {
        return remiseSupplierPercent;
    }

    public void setRemiseSupplierPercent(String remiseSupplierPercent) {
        this.remiseSupplierPercent = remiseSupplierPercent;
    }

    public Object getModeReglementSupplierId() {
        return modeReglementSupplierId;
    }

    public void setModeReglementSupplierId(Object modeReglementSupplierId) {
        this.modeReglementSupplierId = modeReglementSupplierId;
    }

    public Object getCondReglementSupplierId() {
        return condReglementSupplierId;
    }

    public void setCondReglementSupplierId(Object condReglementSupplierId) {
        this.condReglementSupplierId = condReglementSupplierId;
    }

    public Object getTransportModeSupplierId() {
        return transportModeSupplierId;
    }

    public void setTransportModeSupplierId(Object transportModeSupplierId) {
        this.transportModeSupplierId = transportModeSupplierId;
    }

    public String getFkProspectlevel() {
        return fkProspectlevel;
    }

    public void setFkProspectlevel(String fkProspectlevel) {
        this.fkProspectlevel = fkProspectlevel;
    }

    public Integer getDateModification() {
        return dateModification;
    }

    public void setDateModification(Integer dateModification) {
        this.dateModification = dateModification;
    }

    public String getUserModification() {
        return userModification;
    }

    public void setUserModification(String userModification) {
        this.userModification = userModification;
    }

    public Integer getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Integer dateCreation) {
        this.dateCreation = dateCreation;
    }

    public String getUserCreation() {
        return userCreation;
    }

    public void setUserCreation(String userCreation) {
        this.userCreation = userCreation;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public Integer getProspect() {
        return prospect;
    }

    public void setProspect(Integer prospect) {
        this.prospect = prospect;
    }

    public String getFournisseur() {
        return fournisseur;
    }

    public void setFournisseur(String fournisseur) {
        this.fournisseur = fournisseur;
    }

    public String getCodeClient() {
        return codeClient;
    }

    public void setCodeClient(String codeClient) {
        this.codeClient = codeClient;
    }

    public Object getCodeFournisseur() {
        return codeFournisseur;
    }

    public void setCodeFournisseur(Object codeFournisseur) {
        this.codeFournisseur = codeFournisseur;
    }

    public Object getCodeComptaClient() {
        return codeComptaClient;
    }

    public void setCodeComptaClient(Object codeComptaClient) {
        this.codeComptaClient = codeComptaClient;
    }

    public Object getCodeCompta() {
        return codeCompta;
    }

    public void setCodeCompta(Object codeCompta) {
        this.codeCompta = codeCompta;
    }

    public Object getAccountancyCodeCustomer() {
        return accountancyCodeCustomer;
    }

    public void setAccountancyCodeCustomer(Object accountancyCodeCustomer) {
        this.accountancyCodeCustomer = accountancyCodeCustomer;
    }

    public Object getCodeComptaFournisseur() {
        return codeComptaFournisseur;
    }

    public void setCodeComptaFournisseur(Object codeComptaFournisseur) {
        this.codeComptaFournisseur = codeComptaFournisseur;
    }

    public Object getAccountancyCodeSupplier() {
        return accountancyCodeSupplier;
    }

    public void setAccountancyCodeSupplier(Object accountancyCodeSupplier) {
        this.accountancyCodeSupplier = accountancyCodeSupplier;
    }

    public Object getCodeComptaProduct() {
        return codeComptaProduct;
    }

    public void setCodeComptaProduct(Object codeComptaProduct) {
        this.codeComptaProduct = codeComptaProduct;
    }

    public Object getNotePrivate() {
        return notePrivate;
    }

    public void setNotePrivate(Object notePrivate) {
        this.notePrivate = notePrivate;
    }

    public Object getNotePublic() {
        return notePublic;
    }

    public void setNotePublic(Object notePublic) {
        this.notePublic = notePublic;
    }

    public String getStcommId() {
        return stcommId;
    }

    public void setStcommId(String stcommId) {
        this.stcommId = stcommId;
    }

    public Object getStcommPicto() {
        return stcommPicto;
    }

    public void setStcommPicto(Object stcommPicto) {
        this.stcommPicto = stcommPicto;
    }

    public String getStatusProspectLabel() {
        return statusProspectLabel;
    }

    public void setStatusProspectLabel(String statusProspectLabel) {
        this.statusProspectLabel = statusProspectLabel;
    }

    public Object getPriceLevel() {
        return priceLevel;
    }

    public void setPriceLevel(Object priceLevel) {
        this.priceLevel = priceLevel;
    }

    public Object getOutstandingLimit() {
        return outstandingLimit;
    }

    public void setOutstandingLimit(Object outstandingLimit) {
        this.outstandingLimit = outstandingLimit;
    }

    public Object getOrderMinAmount() {
        return orderMinAmount;
    }

    public void setOrderMinAmount(Object orderMinAmount) {
        this.orderMinAmount = orderMinAmount;
    }

    public Object getSupplierOrderMinAmount() {
        return supplierOrderMinAmount;
    }

    public void setSupplierOrderMinAmount(Object supplierOrderMinAmount) {
        this.supplierOrderMinAmount = supplierOrderMinAmount;
    }

    public Object getParent() {
        return parent;
    }

    public void setParent(Object parent) {
        this.parent = parent;
    }

    public Object getDefaultLang() {
        return defaultLang;
    }

    public void setDefaultLang(Object defaultLang) {
        this.defaultLang = defaultLang;
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

    public Object getImportKey() {
        return importKey;
    }

    public void setImportKey(Object importKey) {
        this.importKey = importKey;
    }

    public Object getWebservicesUrl() {
        return webservicesUrl;
    }

    public void setWebservicesUrl(Object webservicesUrl) {
        this.webservicesUrl = webservicesUrl;
    }

    public Object getWebservicesKey() {
        return webservicesKey;
    }

    public void setWebservicesKey(Object webservicesKey) {
        this.webservicesKey = webservicesKey;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public Object getLogoSmall() {
        return logoSmall;
    }

    public void setLogoSmall(Object logoSmall) {
        this.logoSmall = logoSmall;
    }

    public Object getLogoMini() {
        return logoMini;
    }

    public void setLogoMini(Object logoMini) {
        this.logoMini = logoMini;
    }

    public Object getLogoSquarred() {
        return logoSquarred;
    }

    public void setLogoSquarred(Object logoSquarred) {
        this.logoSquarred = logoSquarred;
    }

    public Object getLogoSquarredSmall() {
        return logoSquarredSmall;
    }

    public void setLogoSquarredSmall(Object logoSquarredSmall) {
        this.logoSquarredSmall = logoSquarredSmall;
    }

    public Object getLogoSquarredMini() {
        return logoSquarredMini;
    }

    public void setLogoSquarredMini(Object logoSquarredMini) {
        this.logoSquarredMini = logoSquarredMini;
    }

    public String getAccountancyCodeSell() {
        return accountancyCodeSell;
    }

    public void setAccountancyCodeSell(String accountancyCodeSell) {
        this.accountancyCodeSell = accountancyCodeSell;
    }

    public String getAccountancyCodeBuy() {
        return accountancyCodeBuy;
    }

    public void setAccountancyCodeBuy(String accountancyCodeBuy) {
        this.accountancyCodeBuy = accountancyCodeBuy;
    }

    public String getFkMulticurrency() {
        return fkMulticurrency;
    }

    public void setFkMulticurrency(String fkMulticurrency) {
        this.fkMulticurrency = fkMulticurrency;
    }

    public Object getFkWarehouse() {
        return fkWarehouse;
    }

    public void setFkWarehouse(Object fkWarehouse) {
        this.fkWarehouse = fkWarehouse;
    }

    public String getMulticurrencyCode() {
        return multicurrencyCode;
    }

    public void setMulticurrencyCode(String multicurrencyCode) {
        this.multicurrencyCode = multicurrencyCode;
    }

    public List<Object> getPartnerships() {
        return partnerships;
    }

    public void setPartnerships(List<Object> partnerships) {
        this.partnerships = partnerships;
    }

    public Object getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(Object bankAccount) {
        this.bankAccount = bankAccount;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Object> getValidateFieldsErrors() {
        return validateFieldsErrors;
    }

    public void setValidateFieldsErrors(List<Object> validateFieldsErrors) {
        this.validateFieldsErrors = validateFieldsErrors;
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

    public Object getCanvas() {
        return canvas;
    }

    public void setCanvas(Object canvas) {
        this.canvas = canvas;
    }

    public Object getFkProject() {
        return fkProject;
    }

    public void setFkProject(Object fkProject) {
        this.fkProject = fkProject;
    }

    public Object getContactId() {
        return contactId;
    }

    public void setContactId(Object contactId) {
        this.contactId = contactId;
    }

    public Object getUser() {
        return user;
    }

    public void setUser(Object user) {
        this.user = user;
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

    public Object getStatut() {
        return statut;
    }

    public void setStatut(Object statut) {
        this.statut = statut;
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

    public Object getRegionId() {
        return regionId;
    }

    public void setRegionId(Object regionId) {
        this.regionId = regionId;
    }

    public Object getBarcodeType() {
        return barcodeType;
    }

    public void setBarcodeType(Object barcodeType) {
        this.barcodeType = barcodeType;
    }

    public Object getBarcodeTypeCoder() {
        return barcodeTypeCoder;
    }

    public void setBarcodeTypeCoder(Object barcodeTypeCoder) {
        this.barcodeTypeCoder = barcodeTypeCoder;
    }

    public Object getModeReglementId() {
        return modeReglementId;
    }

    public void setModeReglementId(Object modeReglementId) {
        this.modeReglementId = modeReglementId;
    }

    public Object getCondReglementId() {
        return condReglementId;
    }

    public void setCondReglementId(Object condReglementId) {
        this.condReglementId = condReglementId;
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

    public Object getShippingMethodId() {
        return shippingMethodId;
    }

    public void setShippingMethodId(Object shippingMethodId) {
        this.shippingMethodId = shippingMethodId;
    }

    public String getModelPdf() {
        return modelPdf;
    }

    public void setModelPdf(String modelPdf) {
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

    public String getFkAccount() {
        return fkAccount;
    }

    public void setFkAccount(String fkAccount) {
        this.fkAccount = fkAccount;
    }

    public Object getLastname() {
        return lastname;
    }

    public void setLastname(Object lastname) {
        this.lastname = lastname;
    }

    public Object getFirstname() {
        return firstname;
    }

    public void setFirstname(Object firstname) {
        this.firstname = firstname;
    }

    public Object getCivilityId() {
        return civilityId;
    }

    public void setCivilityId(Object civilityId) {
        this.civilityId = civilityId;
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

    public String getFkIncoterms() {
        return fkIncoterms;
    }

    public void setFkIncoterms(String fkIncoterms) {
        this.fkIncoterms = fkIncoterms;
    }

    public Object getLabelIncoterms() {
        return labelIncoterms;
    }

    public void setLabelIncoterms(Object labelIncoterms) {
        this.labelIncoterms = labelIncoterms;
    }

    public Object getLocationIncoterms() {
        return locationIncoterms;
    }

    public void setLocationIncoterms(Object locationIncoterms) {
        this.locationIncoterms = locationIncoterms;
    }

}
