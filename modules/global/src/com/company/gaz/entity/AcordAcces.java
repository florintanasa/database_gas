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
import com.haulmont.chile.core.annotations.NumberFormat;

@NamePattern("%s %s|nrAcordAcces,dataAcordAcces")
@Table(name = "GAZ_ACORD_ACCES")
@Entity(name = "gaz$AcordAcces")
public class AcordAcces extends StandardEntity {
    private static final long serialVersionUID = -1305411491595153683L;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_SIRUTA_ID")
    protected Siruta idSiruta;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_PARTENERI_ID")
    protected Parteneri idParteneri;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_LOCATII_ID")
    protected Locatii idLocatii;

    @NotNull
    @Column(name = "NR_ACORD_ACCES", nullable = false)
    protected Integer nrAcordAcces;

    @Temporal(TemporalType.DATE)
    @NotNull
    @Column(name = "DATA_ACORD_ACCES", nullable = false)
    protected Date dataAcordAcces;

    @Column(name = "BUC_MG")
    protected Integer bucMg;

    @Column(name = "DEBIT_MG", precision = 5, scale = 2)
    protected BigDecimal debitMg;

    @Column(name = "BUC_CT")
    protected Integer bucCt;

    @Column(name = "DEBIT_CT", precision = 5, scale = 2)
    protected BigDecimal debitCt;

    @Column(name = "BUC_INST")
    protected Integer bucInst;

    @Column(name = "DEBIT_INST", precision = 5, scale = 2)
    protected BigDecimal debitInst;

    @NotNull
    @Column(name = "DEBIT_TOTAL", nullable = false, precision = 5, scale = 2)
    protected BigDecimal debitTotal;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_CONDUCTA_ID")
    protected Conducta idConducta;

    @NotNull
    @Column(name = "ACTIV", nullable = false)
    protected Boolean activ = false;

    public void setIdConducta(Conducta idConducta) {
        this.idConducta = idConducta;
    }

    public Conducta getIdConducta() {
        return idConducta;
    }


    public void setIdSiruta(Siruta idSiruta) {
        this.idSiruta = idSiruta;
    }

    public Siruta getIdSiruta() {
        return idSiruta;
    }

    public void setIdParteneri(Parteneri idParteneri) {
        this.idParteneri = idParteneri;
    }

    public Parteneri getIdParteneri() {
        return idParteneri;
    }

    public void setIdLocatii(Locatii idLocatii) {
        this.idLocatii = idLocatii;
    }

    public Locatii getIdLocatii() {
        return idLocatii;
    }

    public void setNrAcordAcces(Integer nrAcordAcces) {
        this.nrAcordAcces = nrAcordAcces;
    }

    public Integer getNrAcordAcces() {
        return nrAcordAcces;
    }

    public void setDataAcordAcces(Date dataAcordAcces) {
        this.dataAcordAcces = dataAcordAcces;
    }

    public Date getDataAcordAcces() {
        return dataAcordAcces;
    }

    public void setBucMg(Integer bucMg) {
        this.bucMg = bucMg;
    }

    public Integer getBucMg() {
        return bucMg;
    }

    public void setDebitMg(BigDecimal debitMg) {
        this.debitMg = debitMg;
    }

    public BigDecimal getDebitMg() {
        return debitMg;
    }

    public void setBucCt(Integer bucCt) {
        this.bucCt = bucCt;
    }

    public Integer getBucCt() {
        return bucCt;
    }

    public void setDebitCt(BigDecimal debitCt) {
        this.debitCt = debitCt;
    }

    public BigDecimal getDebitCt() {
        return debitCt;
    }

    public void setBucInst(Integer bucInst) {
        this.bucInst = bucInst;
    }

    public Integer getBucInst() {
        return bucInst;
    }

    public void setDebitInst(BigDecimal debitInst) {
        this.debitInst = debitInst;
    }

    public BigDecimal getDebitInst() {
        return debitInst;
    }

    public void setDebitTotal(BigDecimal debitTotal) {
        this.debitTotal = debitTotal;
    }

    public BigDecimal getDebitTotal() {
        return debitTotal;
    }

    public void setActiv(Boolean activ) {
        this.activ = activ;
    }

    public Boolean getActiv() {
        return activ;
    }


}