package com.company.gaz.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.global.DeletePolicy;
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

@NamePattern("%s|cuiInstUtilizare")
@Table(name = "GAZ_INST_UTILIZARE")
@Entity(name = "gaz$InstUtilizare")
public class InstUtilizare extends StandardEntity {
    private static final long serialVersionUID = 5811840942819272831L;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_SIRUTA_ID")
    protected Siruta idSiruta;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @NotNull
    @OnDelete(DeletePolicy.CASCADE)
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_LOCATII_ID")
    protected Locatii idLocatii;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_SRMPRM_ID")
    protected Srmprm idSrmprm;

    @Column(name = "CUI_INST_UTILIZARE")
    protected Integer cuiInstUtilizare;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_PROIECTE_ID")
    protected Proiecte idProiecte;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_EXECUTANT_ID")
    protected Executant idExecutant;

    @Column(name = "NR_PVLA", length = 10)
    protected String nrPvla;

    @Temporal(TemporalType.DATE)
    @Column(name = "DATA_PVLA")
    protected Date dataPvla;

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

    @Column(name = "NR_ARHIVA")
    protected Integer nrArhiva;

    public void setIdSrmprm(Srmprm idSrmprm) {
        this.idSrmprm = idSrmprm;
    }

    public Srmprm getIdSrmprm() {
        return idSrmprm;
    }

    public void setCuiInstUtilizare(Integer cuiInstUtilizare) {
        this.cuiInstUtilizare = cuiInstUtilizare;
    }

    public Integer getCuiInstUtilizare() {
        return cuiInstUtilizare;
    }


    public void setIdExecutant(Executant idExecutant) {
        this.idExecutant = idExecutant;
    }

    public Executant getIdExecutant() {
        return idExecutant;
    }


    public void setIdSiruta(Siruta idSiruta) {
        this.idSiruta = idSiruta;
    }

    public Siruta getIdSiruta() {
        return idSiruta;
    }

    public void setIdLocatii(Locatii idLocatii) {
        this.idLocatii = idLocatii;
    }

    public Locatii getIdLocatii() {
        return idLocatii;
    }

    public void setNrArhiva(Integer nrArhiva) {
        this.nrArhiva = nrArhiva;
    }

    public Integer getNrArhiva() {
        return nrArhiva;
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