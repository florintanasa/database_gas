package com.company.gaz.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;
import java.math.BigDecimal;
import com.haulmont.cuba.core.entity.annotation.Listeners;

@Listeners("gaz_ContracteRacordareSDEntityListener")
@NamePattern("%s|nrinreg")
@Table(name = "GAZ_CONTRACTE_RACORDARE_SD")
@Entity(name = "gaz$ContracteRacordareSD")
public class ContracteRacordareSD extends StandardEntity {
    private static final long serialVersionUID = -7093088067900293706L;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_SIRUTA_ID")
    protected Siruta idSiruta;

    @NotNull
    @Column(name = "NRINREG", nullable = false)
    protected Integer nrinreg;

    @Temporal(TemporalType.DATE)
    @NotNull
    @Column(name = "DATAINREG", nullable = false)
    protected Date datainreg;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_PARTENERI_ID")
    protected Parteneri idParteneri;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_CI_CIF_ID")
    protected CiCif idCiCif;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "LOCATIA_1_ID")
    protected Locatii locatia_1;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_TELEFOANE_ID")
    protected Telefoane idTelefoane;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_FAX_ID")
    protected Telefoane idFax;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_EMAIL_ID")
    protected Email idEmail;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_CONTURI_BANCARE_PARTENERI_ID")
    protected ConturiBancareParteneri idConturiBancareParteneri;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_ACORD_TEHNIC_RACORDARE_ID")
    protected AcordTehnicRacordare idAcordTehnicRacordare;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "LOCATIA_2_ID")
    protected Locatii locatia_2;

    @NotNull
    @Column(name = "PREL_DOCUMENTE", nullable = false)
    protected Boolean prelDocumente = false;

    @NotNull
    @Column(name = "OBT_AVIZ_CU_AC", nullable = false)
    protected Boolean obtAvizCuAc = false;

    @NotNull
    @Column(name = "PRO_EXEC_RAC", nullable = false)
    protected Boolean proExecRac = false;

    @NotNull
    @Column(name = "VERIF_PROIECT", nullable = false)
    protected Boolean verifProiect = false;

    @NotNull
    @Column(name = "URM_LUC_EXE_RAC", nullable = false)
    protected Boolean urmLucExeRac = false;

    @NotNull
    @Column(name = "REC_PIF", nullable = false)
    protected Boolean recPif = false;

    @Column(name = "DURATA_CONTRACT", precision = 5, scale = 2)
    protected BigDecimal durataContract;

    @Column(name = "PREL_CONTRACT", precision = 5, scale = 2)
    protected BigDecimal prelContract;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_NOTIFICARE_OSD_ATR_ID")
    protected NotificareOsdAtr idNotificareOsdAtr;

    @NotNull
    @Column(name = "PROC_GARANTIE", nullable = false, precision = 5, scale = 2)
    protected BigDecimal procGarantie;

    @NotNull
    @Column(name = "TARIF_RACORDARE", nullable = false)
    protected BigDecimal tarifRacordare;

    @NotNull
    @Column(name = "ZILE_PLATA_TARIF", nullable = false)
    protected Integer zilePlataTarif;

    @NotNull
    @Column(name = "ZILE_NOTIF_REZ", nullable = false)
    protected Integer zileNotifRez;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_STATUS_CONTRACTE_RACORDARE_SD_ID")
    protected StatusContracteRacordareSD idStatusContracteRacordareSD;

    public void setIdStatusContracteRacordareSD(StatusContracteRacordareSD idStatusContracteRacordareSD) {
        this.idStatusContracteRacordareSD = idStatusContracteRacordareSD;
    }

    public StatusContracteRacordareSD getIdStatusContracteRacordareSD() {
        return idStatusContracteRacordareSD;
    }


    public void setIdFax(Telefoane idFax) {
        this.idFax = idFax;
    }

    public Telefoane getIdFax() {
        return idFax;
    }

    public void setIdEmail(Email idEmail) {
        this.idEmail = idEmail;
    }

    public Email getIdEmail() {
        return idEmail;
    }


    public void setIdSiruta(Siruta idSiruta) {
        this.idSiruta = idSiruta;
    }

    public Siruta getIdSiruta() {
        return idSiruta;
    }


    public Locatii getLocatia_2() {
        return locatia_2;
    }

    public void setLocatia_2(Locatii locatia_2) {
        this.locatia_2 = locatia_2;
    }


    public void setIdConturiBancareParteneri(ConturiBancareParteneri idConturiBancareParteneri) {
        this.idConturiBancareParteneri = idConturiBancareParteneri;
    }

    public ConturiBancareParteneri getIdConturiBancareParteneri() {
        return idConturiBancareParteneri;
    }

    public void setIdNotificareOsdAtr(NotificareOsdAtr idNotificareOsdAtr) {
        this.idNotificareOsdAtr = idNotificareOsdAtr;
    }

    public NotificareOsdAtr getIdNotificareOsdAtr() {
        return idNotificareOsdAtr;
    }

    public void setTarifRacordare(BigDecimal tarifRacordare) {
        this.tarifRacordare = tarifRacordare;
    }

    public BigDecimal getTarifRacordare() {
        return tarifRacordare;
    }


    public void setProcGarantie(BigDecimal procGarantie) {
        this.procGarantie = procGarantie;
    }

    public BigDecimal getProcGarantie() {
        return procGarantie;
    }

    public void setZilePlataTarif(Integer zilePlataTarif) {
        this.zilePlataTarif = zilePlataTarif;
    }

    public Integer getZilePlataTarif() {
        return zilePlataTarif;
    }

    public void setZileNotifRez(Integer zileNotifRez) {
        this.zileNotifRez = zileNotifRez;
    }

    public Integer getZileNotifRez() {
        return zileNotifRez;
    }


    public void setIdCiCif(CiCif idCiCif) {
        this.idCiCif = idCiCif;
    }

    public CiCif getIdCiCif() {
        return idCiCif;
    }

    public void setIdTelefoane(Telefoane idTelefoane) {
        this.idTelefoane = idTelefoane;
    }

    public Telefoane getIdTelefoane() {
        return idTelefoane;
    }

    public void setPrelDocumente(Boolean prelDocumente) {
        this.prelDocumente = prelDocumente;
    }

    public Boolean getPrelDocumente() {
        return prelDocumente;
    }

    public void setObtAvizCuAc(Boolean obtAvizCuAc) {
        this.obtAvizCuAc = obtAvizCuAc;
    }

    public Boolean getObtAvizCuAc() {
        return obtAvizCuAc;
    }

    public void setProExecRac(Boolean proExecRac) {
        this.proExecRac = proExecRac;
    }

    public Boolean getProExecRac() {
        return proExecRac;
    }

    public void setVerifProiect(Boolean verifProiect) {
        this.verifProiect = verifProiect;
    }

    public Boolean getVerifProiect() {
        return verifProiect;
    }

    public void setUrmLucExeRac(Boolean urmLucExeRac) {
        this.urmLucExeRac = urmLucExeRac;
    }

    public Boolean getUrmLucExeRac() {
        return urmLucExeRac;
    }

    public void setRecPif(Boolean recPif) {
        this.recPif = recPif;
    }

    public Boolean getRecPif() {
        return recPif;
    }

    public void setDurataContract(BigDecimal durataContract) {
        this.durataContract = durataContract;
    }

    public BigDecimal getDurataContract() {
        return durataContract;
    }

    public void setPrelContract(BigDecimal prelContract) {
        this.prelContract = prelContract;
    }

    public BigDecimal getPrelContract() {
        return prelContract;
    }

    public void setIdAcordTehnicRacordare(AcordTehnicRacordare idAcordTehnicRacordare) {
        this.idAcordTehnicRacordare = idAcordTehnicRacordare;
    }

    public AcordTehnicRacordare getIdAcordTehnicRacordare() {
        return idAcordTehnicRacordare;
    }


    public void setNrinreg(Integer nrinreg) {
        this.nrinreg = nrinreg;
    }

    public Integer getNrinreg() {
        return nrinreg;
    }

    public void setDatainreg(Date datainreg) {
        this.datainreg = datainreg;
    }

    public Date getDatainreg() {
        return datainreg;
    }

    public void setIdParteneri(Parteneri idParteneri) {
        this.idParteneri = idParteneri;
    }

    public Parteneri getIdParteneri() {
        return idParteneri;
    }

    public void setLocatia_1(Locatii locatia_1) {
        this.locatia_1 = locatia_1;
    }

    public Locatii getLocatia_1() {
        return locatia_1;
    }


}