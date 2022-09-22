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

@NamePattern("%s|cuiSrmPrm")
@Table(name = "GAZ_SRMPRM")
@Entity(name = "gaz$Srmprm")
public class Srmprm extends StandardEntity {
    private static final long serialVersionUID = -6003324191888438966L;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_SIRUTA_ID")
    protected Siruta idSiruta;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_BRANSAMENTE_ID")
    protected Bransamente idBransamente;

    @NotNull
    @Column(name = "CUI_SRM_PRM", nullable = false)
    protected Integer cuiSrmPrm;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_LOCATII_ID")
    protected Locatii idLocatii;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PROIECTE_ID")
    protected Proiecte idProiecte;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_EXECUTANT_ID")
    protected Executant idExecutant;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_REGIM_PRES_ID")
    protected RegimPres idRegimPres;

    @NotNull
    @Column(name = "PRES_REGLATA", nullable = false, precision = 5, scale = 3)
    protected BigDecimal presReglata;

    @Column(name = "NR_PVRT", length = 10)
    protected String nrPvrt;

    @Temporal(TemporalType.DATE)
    @Column(name = "DATA_PVRT")
    protected Date dataPvrt;

    @Column(name = "NR_PVPIF", length = 10)
    protected String nrPvpif;

    @Temporal(TemporalType.DATE)
    @Column(name = "DATA_PVPIF")
    protected Date dataPvpif;

    @Column(name = "VAL_CONTABILA")
    protected BigDecimal valContabila;

    @Column(name = "NR_INVENTAR", length = 25)
    protected String nrInventar;

    public void setIdBransamente(Bransamente idBransamente) {
        this.idBransamente = idBransamente;
    }

    public Bransamente getIdBransamente() {
        return idBransamente;
    }

    public void setCuiSrmPrm(Integer cuiSrmPrm) {
        this.cuiSrmPrm = cuiSrmPrm;
    }

    public Integer getCuiSrmPrm() {
        return cuiSrmPrm;
    }


    public void setIdLocatii(Locatii idLocatii) {
        this.idLocatii = idLocatii;
    }

    public Locatii getIdLocatii() {
        return idLocatii;
    }

    public void setNrPvrt(String nrPvrt) {
        this.nrPvrt = nrPvrt;
    }

    public String getNrPvrt() {
        return nrPvrt;
    }

    public void setDataPvrt(Date dataPvrt) {
        this.dataPvrt = dataPvrt;
    }

    public Date getDataPvrt() {
        return dataPvrt;
    }

    public void setNrPvpif(String nrPvpif) {
        this.nrPvpif = nrPvpif;
    }

    public String getNrPvpif() {
        return nrPvpif;
    }

    public void setDataPvpif(Date dataPvpif) {
        this.dataPvpif = dataPvpif;
    }

    public Date getDataPvpif() {
        return dataPvpif;
    }

    public void setIdExecutant(Executant idExecutant) {
        this.idExecutant = idExecutant;
    }

    public Executant getIdExecutant() {
        return idExecutant;
    }

    public void setIdProiecte(Proiecte idProiecte) {
        this.idProiecte = idProiecte;
    }

    public Proiecte getIdProiecte() {
        return idProiecte;
    }

    public void setIdSiruta(Siruta idSiruta) {
        this.idSiruta = idSiruta;
    }

    public Siruta getIdSiruta() {
        return idSiruta;
    }

    public void setIdRegimPres(RegimPres idRegimPres) {
        this.idRegimPres = idRegimPres;
    }

    public RegimPres getIdRegimPres() {
        return idRegimPres;
    }

    public void setPresReglata(BigDecimal presReglata) {
        this.presReglata = presReglata;
    }

    public BigDecimal getPresReglata() {
        return presReglata;
    }

    public void setValContabila(BigDecimal valContabila) {
        this.valContabila = valContabila;
    }

    public BigDecimal getValContabila() {
        return valContabila;
    }

    public void setNrInventar(String nrInventar) {
        this.nrInventar = nrInventar;
    }

    public String getNrInventar() {
        return nrInventar;
    }


}