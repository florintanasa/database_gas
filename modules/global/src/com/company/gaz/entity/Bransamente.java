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

@NamePattern("%s|cuiBr")
@Table(name = "GAZ_BRANSAMENTE")
@Entity(name = "gaz$Bransamente")
public class Bransamente extends StandardEntity {
    private static final long serialVersionUID = 7691499146097376760L;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_SIRUTA_ID")
    protected Siruta idSiruta;

    @NotNull
    @Column(name = "CUI_BR", nullable = false)
    protected Integer cuiBr;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_LOCATII_ID")
    protected Locatii idLocatii;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_REGIM_PRES_ID")
    protected RegimPres idRegimPres;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_MAT_CONDUCTA_PE_ID")
    protected MatConducta idMatConductaPe;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_DIAM_PE_ID")
    protected DiamPe idDiamPe;

    @Column(name = "LUNGIME_PE", precision = 5, scale = 2)
    protected BigDecimal lungimePe;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_MAT_CONDUCTA_OL_ID")
    protected MatConducta idMatConductaOl;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_DIAM_OL_ID")
    protected DiamOl idDiamOl;

    @Column(name = "LUNGIME_OL", precision = 5, scale = 2)
    protected BigDecimal lungimeOl;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_EXECUTANT_ID")
    protected Executant idExecutant;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_PROIECTE_ID")
    protected Proiecte idProiecte;

    @Column(name = "NR_PVLA", length = 20)
    protected String nrPvla;

    @Temporal(TemporalType.DATE)
    @Column(name = "DATA_PVLA")
    protected Date dataPvla;

    @Column(name = "NR_PVRT", length = 20)
    protected String nrPvrt;

    @Temporal(TemporalType.DATE)
    @Column(name = "DATA_PVRT")
    protected Date dataPvrt;

    @Column(name = "NR_PVPIF", length = 20)
    protected String nrPvpif;

    @Temporal(TemporalType.DATE)
    @Column(name = "DATA_PVPIF")
    protected Date dataPvpif;

    @Column(name = "NRINVENTAR", length = 25)
    protected String nrinventar;

    @Column(name = "VALCONTABILA")
    protected BigDecimal valcontabila;

    public void setIdSiruta(Siruta idSiruta) {
        this.idSiruta = idSiruta;
    }

    public Siruta getIdSiruta() {
        return idSiruta;
    }

    public void setIdMatConductaPe(MatConducta idMatConductaPe) {
        this.idMatConductaPe = idMatConductaPe;
    }

    public MatConducta getIdMatConductaPe() {
        return idMatConductaPe;
    }

    public void setIdMatConductaOl(MatConducta idMatConductaOl) {
        this.idMatConductaOl = idMatConductaOl;
    }

    public MatConducta getIdMatConductaOl() {
        return idMatConductaOl;
    }

    public void setIdRegimPres(RegimPres idRegimPres) {
        this.idRegimPres = idRegimPres;
    }

    public RegimPres getIdRegimPres() {
        return idRegimPres;
    }

    public void setIdLocatii(Locatii idLocatii) {
        this.idLocatii = idLocatii;
    }

    public Locatii getIdLocatii() {
        return idLocatii;
    }

    public void setIdDiamPe(DiamPe idDiamPe) {
        this.idDiamPe = idDiamPe;
    }

    public DiamPe getIdDiamPe() {
        return idDiamPe;
    }

    public void setIdDiamOl(DiamOl idDiamOl) {
        this.idDiamOl = idDiamOl;
    }

    public DiamOl getIdDiamOl() {
        return idDiamOl;
    }

    public void setLungimePe(BigDecimal lungimePe) {
        this.lungimePe = lungimePe;
    }

    public BigDecimal getLungimePe() {
        return lungimePe;
    }

    public void setLungimeOl(BigDecimal lungimeOl) {
        this.lungimeOl = lungimeOl;
    }

    public BigDecimal getLungimeOl() {
        return lungimeOl;
    }

    public void setValcontabila(BigDecimal valcontabila) {
        this.valcontabila = valcontabila;
    }

    public BigDecimal getValcontabila() {
        return valcontabila;
    }

    public void setNrinventar(String nrinventar) {
        this.nrinventar = nrinventar;
    }

    public String getNrinventar() {
        return nrinventar;
    }

    public void setCuiBr(Integer cuiBr) {
        this.cuiBr = cuiBr;
    }

    public Integer getCuiBr() {
        return cuiBr;
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

    public void setNrPvla(String nrPvla) {
        this.nrPvla = nrPvla;
    }

    public String getNrPvla() {
        return nrPvla;
    }

    public void setDataPvla(Date dataPvla) {
        this.dataPvla = dataPvla;
    }

    public Date getDataPvla() {
        return dataPvla;
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


}