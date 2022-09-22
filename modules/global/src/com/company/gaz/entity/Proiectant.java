package com.company.gaz.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@NamePattern("   %s %s %s|idSocietatiProiectare,numeProiectant,tipAutProiectant,nrAutProiectant")
@Table(name = "GAZ_PROIECTANT")
@Entity(name = "gaz$Proiectant")
public class Proiectant extends StandardEntity {
    private static final long serialVersionUID = -2000461125884514271L;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_SOCIETATI_PROIECTARE_ID")
    protected SocietatiProiectare idSocietatiProiectare;

    @NotNull
    @Column(name = "NUME_PROIECTANT", nullable = false, length = 25)
    protected String numeProiectant;

    @NotNull
    @Column(name = "TIP_AUT_PROIECTANT", nullable = false, length = 10)
    protected String tipAutProiectant;

    @NotNull
    @Column(name = "NR_AUT_PROIECTANT", nullable = false)
    protected Integer nrAutProiectant;

    @Temporal(TemporalType.DATE)
    @NotNull
    @Column(name = "DATA_START_AUT_PROIECTANT", nullable = false)
    protected Date dataStartAutProiectant;

    @Temporal(TemporalType.DATE)
    @NotNull
    @Column(name = "DATA_STOP_AUT_PROIECTANT", nullable = false)
    protected Date dataStopAutProiectant;

    @NotNull
    @Column(name = "ACTIV", nullable = false)
    protected Boolean activ = false;

    public void setActiv(Boolean activ) {
        this.activ = activ;
    }

    public Boolean getActiv() {
        return activ;
    }


    public void setIdSocietatiProiectare(SocietatiProiectare idSocietatiProiectare) {
        this.idSocietatiProiectare = idSocietatiProiectare;
    }

    public SocietatiProiectare getIdSocietatiProiectare() {
        return idSocietatiProiectare;
    }


    public void setNumeProiectant(String numeProiectant) {
        this.numeProiectant = numeProiectant;
    }

    public String getNumeProiectant() {
        return numeProiectant;
    }

    public void setTipAutProiectant(String tipAutProiectant) {
        this.tipAutProiectant = tipAutProiectant;
    }

    public String getTipAutProiectant() {
        return tipAutProiectant;
    }

    public void setNrAutProiectant(Integer nrAutProiectant) {
        this.nrAutProiectant = nrAutProiectant;
    }

    public Integer getNrAutProiectant() {
        return nrAutProiectant;
    }

    public void setDataStartAutProiectant(Date dataStartAutProiectant) {
        this.dataStartAutProiectant = dataStartAutProiectant;
    }

    public Date getDataStartAutProiectant() {
        return dataStartAutProiectant;
    }

    public void setDataStopAutProiectant(Date dataStopAutProiectant) {
        this.dataStopAutProiectant = dataStopAutProiectant;
    }

    public Date getDataStopAutProiectant() {
        return dataStopAutProiectant;
    }


}