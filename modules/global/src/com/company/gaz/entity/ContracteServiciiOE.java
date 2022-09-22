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
import com.haulmont.cuba.core.entity.annotation.Listeners;

@Listeners("gaz_ContracteServiciiOEEntityListener")
@NamePattern("%s|nrinreg")
@Table(name = "GAZ_CONTRACTE_SERVICII_OE")
@Entity(name = "gaz$ContracteServiciiOE")
public class ContracteServiciiOE extends StandardEntity {
    private static final long serialVersionUID = -8168817039709580705L;

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
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_SOCIETATI_PROIECTARE_ID")
    protected SocietatiProiectare idSocietatiProiectare;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_VERIFICATOR_ID")
    protected Verificator idVerificator;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_SOCIETATI_EXECUTIE_ID")
    protected SocietatiExecutie idSocietatiExecutie;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_NOTIFICARE_OSD_ATR_ID")
    protected NotificareOsdAtr idNotificareOsdAtr;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_ACORD_TEHNIC_RACORDARE_ID")
    protected AcordTehnicRacordare idAcordTehnicRacordare;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_CONTRACTE_RACORDARE_SD_ID")
    protected ContracteRacordareSD idContracteRacordareSD;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "LOCATIA_2_ID")
    protected Locatii locatia_2;

    @NotNull
    @Column(name = "DURATA_CONTRACT", nullable = false)
    protected Integer durataContract;

    @NotNull
    @Column(name = "ZILE_REP_GARANTIE", nullable = false)
    protected Integer zileRepGarantie;

    @NotNull
    @Column(name = "PROC_ELIB_GARANTIE1", nullable = false, precision = 5, scale = 2)
    protected BigDecimal procElibGarantie1;

    @NotNull
    @Column(name = "PROC_ELIB_GARANTIE2", nullable = false, precision = 5, scale = 2)
    protected BigDecimal procElibGarantie2;

    @NotNull
    @Column(name = "TARIF_RACORDARE", nullable = false)
    protected BigDecimal tarifRacordare;

    @Temporal(TemporalType.DATE)
    @Column(name = "DATA_TERM_PROIECT")
    protected Date dataTermProiect;

    @Column(name = "TARIF_PROIECTARE")
    protected BigDecimal tarifProiectare;

    @NotNull
    @Column(name = "PROC1_TARIF_PROIECTARE", nullable = false, precision = 5, scale = 2)
    protected BigDecimal proc1TarifProiectare;

    @NotNull
    @Column(name = "TARIF1_PROIECTARE", nullable = false, precision = 5, scale = 2)
    protected BigDecimal tarif1Proiectare;

    @NotNull
    @Column(name = "PROC2_TARIF_PROIECTARE", nullable = false, precision = 5, scale = 2)
    protected BigDecimal proc2TarifProiectare;

    @NotNull
    @Column(name = "TARIF2_PROIECTARE", nullable = false, precision = 5, scale = 2)
    protected BigDecimal tarif2Proiectare;

    @Temporal(TemporalType.DATE)
    @Column(name = "DATA_TERM_VERIFCARE")
    protected Date dataTermVerifcare;

    @Column(name = "TARIF_VERIFICARE")
    protected BigDecimal tarifVerificare;

    @NotNull
    @Column(name = "PROC1_TARIF_VERIFICARE", nullable = false, precision = 5, scale = 2)
    protected BigDecimal proc1TarifVerificare;

    @NotNull
    @Column(name = "TARIF1_VERIFICARE", nullable = false)
    protected BigDecimal tarif1Verificare;

    @NotNull
    @Column(name = "PROC2_TARIF_VERIFICARE", nullable = false, precision = 5, scale = 2)
    protected BigDecimal proc2TarifVerificare;

    @NotNull
    @Column(name = "TARIF2_VERIFICARE", nullable = false)
    protected BigDecimal tarif2Verificare;

    @Temporal(TemporalType.DATE)
    @Column(name = "DATA_TERM_EXE")
    protected Date dataTermExe;

    @Column(name = "TARIF_EXECUTIE")
    protected BigDecimal tarifExecutie;

    @NotNull
    @Column(name = "PROC1_TARIF_EXECUTIE", nullable = false)
    protected BigDecimal proc1TarifExecutie;

    @NotNull
    @Column(name = "TARIF1_EXECUTIE", nullable = false)
    protected BigDecimal tarif1Executie;

    @NotNull
    @Column(name = "PROC2_TARIF_EXECUTIE", nullable = false)
    protected BigDecimal proc2TarifExecutie;

    @NotNull
    @Column(name = "TARIF2_EXECUTIE", nullable = false)
    protected BigDecimal tarif2Executie;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_STATUS_CONTRACTE_SERVICII_OE_ID")
    protected StatusContracteServiciiOE idStatusContracteServiciiOE;

    public void setIdStatusContracteServiciiOE(StatusContracteServiciiOE idStatusContracteServiciiOE) {
        this.idStatusContracteServiciiOE = idStatusContracteServiciiOE;
    }

    public StatusContracteServiciiOE getIdStatusContracteServiciiOE() {
        return idStatusContracteServiciiOE;
    }


    public void setTarifRacordare(BigDecimal tarifRacordare) {
        this.tarifRacordare = tarifRacordare;
    }

    public BigDecimal getTarifRacordare() {
        return tarifRacordare;
    }


    public void setTarif1Proiectare(BigDecimal tarif1Proiectare) {
        this.tarif1Proiectare = tarif1Proiectare;
    }

    public BigDecimal getTarif1Proiectare() {
        return tarif1Proiectare;
    }

    public void setTarif2Proiectare(BigDecimal tarif2Proiectare) {
        this.tarif2Proiectare = tarif2Proiectare;
    }

    public BigDecimal getTarif2Proiectare() {
        return tarif2Proiectare;
    }

    public void setProc1TarifVerificare(BigDecimal proc1TarifVerificare) {
        this.proc1TarifVerificare = proc1TarifVerificare;
    }

    public BigDecimal getProc1TarifVerificare() {
        return proc1TarifVerificare;
    }

    public void setTarif1Verificare(BigDecimal tarif1Verificare) {
        this.tarif1Verificare = tarif1Verificare;
    }

    public BigDecimal getTarif1Verificare() {
        return tarif1Verificare;
    }

    public void setProc2TarifVerificare(BigDecimal proc2TarifVerificare) {
        this.proc2TarifVerificare = proc2TarifVerificare;
    }

    public BigDecimal getProc2TarifVerificare() {
        return proc2TarifVerificare;
    }

    public void setTarif2Verificare(BigDecimal tarif2Verificare) {
        this.tarif2Verificare = tarif2Verificare;
    }

    public BigDecimal getTarif2Verificare() {
        return tarif2Verificare;
    }

    public void setProc1TarifExecutie(BigDecimal proc1TarifExecutie) {
        this.proc1TarifExecutie = proc1TarifExecutie;
    }

    public BigDecimal getProc1TarifExecutie() {
        return proc1TarifExecutie;
    }

    public void setTarif1Executie(BigDecimal tarif1Executie) {
        this.tarif1Executie = tarif1Executie;
    }

    public BigDecimal getTarif1Executie() {
        return tarif1Executie;
    }

    public void setProc2TarifExecutie(BigDecimal proc2TarifExecutie) {
        this.proc2TarifExecutie = proc2TarifExecutie;
    }

    public BigDecimal getProc2TarifExecutie() {
        return proc2TarifExecutie;
    }

    public void setTarif2Executie(BigDecimal tarif2Executie) {
        this.tarif2Executie = tarif2Executie;
    }

    public BigDecimal getTarif2Executie() {
        return tarif2Executie;
    }


    public void setIdContracteRacordareSD(ContracteRacordareSD idContracteRacordareSD) {
        this.idContracteRacordareSD = idContracteRacordareSD;
    }

    public ContracteRacordareSD getIdContracteRacordareSD() {
        return idContracteRacordareSD;
    }

    public void setProc1TarifProiectare(BigDecimal proc1TarifProiectare) {
        this.proc1TarifProiectare = proc1TarifProiectare;
    }

    public BigDecimal getProc1TarifProiectare() {
        return proc1TarifProiectare;
    }

    public void setProc2TarifProiectare(BigDecimal proc2TarifProiectare) {
        this.proc2TarifProiectare = proc2TarifProiectare;
    }

    public BigDecimal getProc2TarifProiectare() {
        return proc2TarifProiectare;
    }


    public BigDecimal getTarifProiectare() {
        return tarifProiectare;
    }

    public void setTarifProiectare(BigDecimal tarifProiectare) {
        this.tarifProiectare = tarifProiectare;
    }


    public Locatii getLocatia_2() {
        return locatia_2;
    }

    public void setLocatia_2(Locatii locatia_2) {
        this.locatia_2 = locatia_2;
    }


    public void setIdSiruta(Siruta idSiruta) {
        this.idSiruta = idSiruta;
    }

    public Siruta getIdSiruta() {
        return idSiruta;
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

    public void setIdSocietatiProiectare(SocietatiProiectare idSocietatiProiectare) {
        this.idSocietatiProiectare = idSocietatiProiectare;
    }

    public SocietatiProiectare getIdSocietatiProiectare() {
        return idSocietatiProiectare;
    }

    public void setIdVerificator(Verificator idVerificator) {
        this.idVerificator = idVerificator;
    }

    public Verificator getIdVerificator() {
        return idVerificator;
    }

    public void setIdSocietatiExecutie(SocietatiExecutie idSocietatiExecutie) {
        this.idSocietatiExecutie = idSocietatiExecutie;
    }

    public SocietatiExecutie getIdSocietatiExecutie() {
        return idSocietatiExecutie;
    }

    public void setIdNotificareOsdAtr(NotificareOsdAtr idNotificareOsdAtr) {
        this.idNotificareOsdAtr = idNotificareOsdAtr;
    }

    public NotificareOsdAtr getIdNotificareOsdAtr() {
        return idNotificareOsdAtr;
    }

    public void setIdAcordTehnicRacordare(AcordTehnicRacordare idAcordTehnicRacordare) {
        this.idAcordTehnicRacordare = idAcordTehnicRacordare;
    }

    public AcordTehnicRacordare getIdAcordTehnicRacordare() {
        return idAcordTehnicRacordare;
    }

    public void setDurataContract(Integer durataContract) {
        this.durataContract = durataContract;
    }

    public Integer getDurataContract() {
        return durataContract;
    }

    public void setZileRepGarantie(Integer zileRepGarantie) {
        this.zileRepGarantie = zileRepGarantie;
    }

    public Integer getZileRepGarantie() {
        return zileRepGarantie;
    }

    public void setProcElibGarantie1(BigDecimal procElibGarantie1) {
        this.procElibGarantie1 = procElibGarantie1;
    }

    public BigDecimal getProcElibGarantie1() {
        return procElibGarantie1;
    }

    public void setProcElibGarantie2(BigDecimal procElibGarantie2) {
        this.procElibGarantie2 = procElibGarantie2;
    }

    public BigDecimal getProcElibGarantie2() {
        return procElibGarantie2;
    }

    public void setDataTermProiect(Date dataTermProiect) {
        this.dataTermProiect = dataTermProiect;
    }

    public Date getDataTermProiect() {
        return dataTermProiect;
    }

    public void setTarifVerificare(BigDecimal tarifVerificare) {
        this.tarifVerificare = tarifVerificare;
    }

    public BigDecimal getTarifVerificare() {
        return tarifVerificare;
    }

    public void setDataTermVerifcare(Date dataTermVerifcare) {
        this.dataTermVerifcare = dataTermVerifcare;
    }

    public Date getDataTermVerifcare() {
        return dataTermVerifcare;
    }

    public void setTarifExecutie(BigDecimal tarifExecutie) {
        this.tarifExecutie = tarifExecutie;
    }

    public BigDecimal getTarifExecutie() {
        return tarifExecutie;
    }

    public void setDataTermExe(Date dataTermExe) {
        this.dataTermExe = dataTermExe;
    }

    public Date getDataTermExe() {
        return dataTermExe;
    }


}