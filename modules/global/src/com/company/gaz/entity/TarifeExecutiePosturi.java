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

@NamePattern("%s %s %s|tipTarif,denTarif,tarif")
@Table(name = "GAZ_TARIFE_EXECUTIE_POSTURI")
@Entity(name = "gaz$TarifeExecutiePosturi")
public class TarifeExecutiePosturi extends StandardEntity {
    private static final long serialVersionUID = 7622687831847730841L;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_SIRUTA_ID")
    protected Siruta idSiruta;

    @NotNull
    @Column(name = "TIP_TARIF", nullable = false, length = 5)
    protected String tipTarif;

    @NotNull
    @Column(name = "DEN_TARIF", nullable = false)
    protected String denTarif;

    @NotNull
    @Column(name = "DEBIT_MAXIM", nullable = false)
    protected BigDecimal debitMaxim;

    @NotNull
    @Column(name = "TARIF", nullable = false)
    protected BigDecimal tarif;

    @Temporal(TemporalType.DATE)
    @NotNull
    @Column(name = "DATA_START", nullable = false)
    protected Date dataStart;

    @Temporal(TemporalType.DATE)
    @Column(name = "DATA_STOP")
    protected Date dataStop;

    @NotNull
    @Column(name = "ACTIV", nullable = false)
    protected Boolean activ = false;

    @Column(name = "EXPLICATII")
    protected String explicatii;

    public void setIdSiruta(Siruta idSiruta) {
        this.idSiruta = idSiruta;
    }

    public Siruta getIdSiruta() {
        return idSiruta;
    }

    public void setTipTarif(String tipTarif) {
        this.tipTarif = tipTarif;
    }

    public String getTipTarif() {
        return tipTarif;
    }

    public void setDenTarif(String denTarif) {
        this.denTarif = denTarif;
    }

    public String getDenTarif() {
        return denTarif;
    }

    public void setDebitMaxim(BigDecimal debitMaxim) {
        this.debitMaxim = debitMaxim;
    }

    public BigDecimal getDebitMaxim() {
        return debitMaxim;
    }

    public void setTarif(BigDecimal tarif) {
        this.tarif = tarif;
    }

    public BigDecimal getTarif() {
        return tarif;
    }

    public void setDataStart(Date dataStart) {
        this.dataStart = dataStart;
    }

    public Date getDataStart() {
        return dataStart;
    }

    public void setDataStop(Date dataStop) {
        this.dataStop = dataStop;
    }

    public Date getDataStop() {
        return dataStop;
    }

    public void setActiv(Boolean activ) {
        this.activ = activ;
    }

    public Boolean getActiv() {
        return activ;
    }

    public void setExplicatii(String explicatii) {
        this.explicatii = explicatii;
    }

    public String getExplicatii() {
        return explicatii;
    }


}