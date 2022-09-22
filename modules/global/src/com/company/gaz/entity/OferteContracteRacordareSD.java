package com.company.gaz.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;
import java.math.BigDecimal;
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
import com.haulmont.chile.core.annotations.Composition;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.global.DeletePolicy;
import java.util.List;
import javax.persistence.OneToMany;
import com.haulmont.cuba.core.entity.annotation.Listeners;

@Listeners("gaz_OferteContracteRacordareSDEntityListener")
@NamePattern("%s|nrinreg")
@Table(name = "GAZ_OFERTE_CONTRACTE_RACORDARE_SD")
@Entity(name = "gaz$OferteContracteRacordareSD")
public class OferteContracteRacordareSD extends StandardEntity {
    private static final long serialVersionUID = -1058073291764636714L;

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

    @Column(name = "PREL_DOCUMENTE")
    protected Boolean prelDocumente;

    @Column(name = "OBT_AVIZ_CU_AC")
    protected Boolean obtAvizCuAc;

    @Column(name = "PRO_EXEC_RAC")
    protected Boolean proExecRac;

    @Column(name = "VERIF_PROIECT")
    protected Boolean verifProiect;

    @Column(name = "URM_LUC_EXE_RAC")
    protected Boolean urmLucExeRac;

    @Column(name = "REC_PIF")
    protected Boolean recPif;

    @NotNull
    @Column(name = "DURATA_CONTRACT", nullable = false, precision = 5, scale = 2)
    protected BigDecimal durataContract;

    @NotNull
    @Column(name = "PREL_CONTRACT", nullable = false, precision = 5, scale = 2)
    protected BigDecimal prelContract;

    @NotNull
    @Column(name = "PROC_GARANTIE", nullable = false, precision = 5, scale = 2)
    protected BigDecimal procGarantie;

    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToMany(mappedBy = "idOferteContracteRacordareSD")
    protected List<OferteContracteRacordareOSDLinii> idOferteContracteRacordareOSDLinii;

    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToMany(mappedBy = "idOferteContracteRacordareSD")
    protected List<OferteConRacOSDTarifExeBrLinii> idOferteConRacOSDTarifExeBrLinii;

    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToMany(mappedBy = "idOferteContracteRacordareSD")
    protected List<OferteConRacOSDTarifExePostLinii> idOferteConRacOSDTarifExePostLinii;

    @Column(name = "PROC_TAXA_ISC1")
    protected BigDecimal procTaxaISC1;

    @Column(name = "TAXA_ISC1")
    protected BigDecimal taxaISC1;

    @Column(name = "PROC_TAXA_ISC2")
    protected BigDecimal procTaxaISC2;

    @Column(name = "TAXA_ISC2")
    protected BigDecimal taxaISC2;

    @NotNull
    @Column(name = "TARIF_RACORDARE", nullable = false)
    protected BigDecimal tarifRacordare;

    @NotNull
    @Column(name = "TVA_TARIF_RACORDARE", nullable = false)
    protected BigDecimal tvaTarifRacordare;

    @NotNull
    @Column(name = "TOTAL_TARIF_RACORDARE", nullable = false)
    protected BigDecimal totalTarifRacordare;

    @NotNull
    @Column(name = "ZILE_PLATA_TARIF", nullable = false)
    protected Integer zilePlataTarif;

    @NotNull
    @Column(name = "ZILE_NOTIF_REZ", nullable = false)
    protected Integer zileNotifRez;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_STATUS_OFERTE_CONTRACTE_RACORDARE_SD_ID")
    protected StatusOferteContracteRacordareSD idStatusOferteContracteRacordareSD;

    public void setIdStatusOferteContracteRacordareSD(StatusOferteContracteRacordareSD idStatusOferteContracteRacordareSD) {
        this.idStatusOferteContracteRacordareSD = idStatusOferteContracteRacordareSD;
    }

    public StatusOferteContracteRacordareSD getIdStatusOferteContracteRacordareSD() {
        return idStatusOferteContracteRacordareSD;
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


    public void setProcTaxaISC2(BigDecimal procTaxaISC2) {
        this.procTaxaISC2 = procTaxaISC2;
    }

    public BigDecimal getProcTaxaISC2() {
        return procTaxaISC2;
    }

    public void setTaxaISC2(BigDecimal taxaISC2) {
        this.taxaISC2 = taxaISC2;
    }

    public BigDecimal getTaxaISC2() {
        return taxaISC2;
    }


    public void setProcTaxaISC1(BigDecimal procTaxaISC1) {
        this.procTaxaISC1 = procTaxaISC1;
    }

    public BigDecimal getProcTaxaISC1() {
        return procTaxaISC1;
    }


    public void setTaxaISC1(BigDecimal taxaISC1) {
        this.taxaISC1 = taxaISC1;
    }

    public BigDecimal getTaxaISC1() {
        return taxaISC1;
    }




    public Integer getNrinreg() {
        return nrinreg;
    }

    public void setNrinreg(Integer nrinreg) {
        this.nrinreg = nrinreg;
    }


    public void setTvaTarifRacordare(BigDecimal tvaTarifRacordare) {
        this.tvaTarifRacordare = tvaTarifRacordare;
    }

    public BigDecimal getTvaTarifRacordare() {
        return tvaTarifRacordare;
    }

    public void setTotalTarifRacordare(BigDecimal totalTarifRacordare) {
        this.totalTarifRacordare = totalTarifRacordare;
    }

    public BigDecimal getTotalTarifRacordare() {
        return totalTarifRacordare;
    }


    public void setIdOferteConRacOSDTarifExeBrLinii(List<OferteConRacOSDTarifExeBrLinii> idOferteConRacOSDTarifExeBrLinii) {
        this.idOferteConRacOSDTarifExeBrLinii = idOferteConRacOSDTarifExeBrLinii;
    }

    public List<OferteConRacOSDTarifExeBrLinii> getIdOferteConRacOSDTarifExeBrLinii() {
        return idOferteConRacOSDTarifExeBrLinii;
    }

    public void setIdOferteConRacOSDTarifExePostLinii(List<OferteConRacOSDTarifExePostLinii> idOferteConRacOSDTarifExePostLinii) {
        this.idOferteConRacOSDTarifExePostLinii = idOferteConRacOSDTarifExePostLinii;
    }

    public List<OferteConRacOSDTarifExePostLinii> getIdOferteConRacOSDTarifExePostLinii() {
        return idOferteConRacOSDTarifExePostLinii;
    }


    public void setIdOferteContracteRacordareOSDLinii(List<OferteContracteRacordareOSDLinii> idOferteContracteRacordareOSDLinii) {
        this.idOferteContracteRacordareOSDLinii = idOferteContracteRacordareOSDLinii;
    }

    public List<OferteContracteRacordareOSDLinii> getIdOferteContracteRacordareOSDLinii() {
        return idOferteContracteRacordareOSDLinii;
    }


    public void setIdSiruta(Siruta idSiruta) {
        this.idSiruta = idSiruta;
    }

    public Siruta getIdSiruta() {
        return idSiruta;
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

    public void setIdCiCif(CiCif idCiCif) {
        this.idCiCif = idCiCif;
    }

    public CiCif getIdCiCif() {
        return idCiCif;
    }

    public void setLocatia_1(Locatii locatia_1) {
        this.locatia_1 = locatia_1;
    }

    public Locatii getLocatia_1() {
        return locatia_1;
    }

    public void setIdTelefoane(Telefoane idTelefoane) {
        this.idTelefoane = idTelefoane;
    }

    public Telefoane getIdTelefoane() {
        return idTelefoane;
    }

    public void setIdConturiBancareParteneri(ConturiBancareParteneri idConturiBancareParteneri) {
        this.idConturiBancareParteneri = idConturiBancareParteneri;
    }

    public ConturiBancareParteneri getIdConturiBancareParteneri() {
        return idConturiBancareParteneri;
    }

    public void setLocatia_2(Locatii locatia_2) {
        this.locatia_2 = locatia_2;
    }

    public Locatii getLocatia_2() {
        return locatia_2;
    }

    public void setIdAcordTehnicRacordare(AcordTehnicRacordare idAcordTehnicRacordare) {
        this.idAcordTehnicRacordare = idAcordTehnicRacordare;
    }

    public AcordTehnicRacordare getIdAcordTehnicRacordare() {
        return idAcordTehnicRacordare;
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

    public void setProcGarantie(BigDecimal procGarantie) {
        this.procGarantie = procGarantie;
    }

    public BigDecimal getProcGarantie() {
        return procGarantie;
    }

    public void setTarifRacordare(BigDecimal tarifRacordare) {
        this.tarifRacordare = tarifRacordare;
    }

    public BigDecimal getTarifRacordare() {
        return tarifRacordare;
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


}