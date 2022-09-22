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

@NamePattern("   %s %s %s|idSocietatiExecutie,numeInstalator,tipAutInstalator,nrAutInstalator")
@Table(name = "GAZ_EXECUTANT")
@Entity(name = "gaz$Executant")
public class Executant extends StandardEntity {
    private static final long serialVersionUID = -5432463867515738064L;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_SOCIETATI_EXECUTIE_ID")
    protected SocietatiExecutie idSocietatiExecutie;

    @NotNull
    @Column(name = "NUME_INSTALATOR", nullable = false, length = 25)
    protected String numeInstalator;

    @NotNull
    @Column(name = "TIP_AUT_INSTALATOR", nullable = false, length = 10)
    protected String tipAutInstalator;

    @NotNull
    @Column(name = "NR_AUT_INSTALATOR", nullable = false)
    protected Integer nrAutInstalator;

    @Temporal(TemporalType.DATE)
    @NotNull
    @Column(name = "DATA_START_AUT_INSTALATOR", nullable = false)
    protected Date dataStartAutInstalator;

    @Temporal(TemporalType.DATE)
    @NotNull
    @Column(name = "DATA_STOP_AUT_INSTALATOR", nullable = false)
    protected Date dataStopAutInstalator;

    @NotNull
    @Column(name = "ACTIV", nullable = false)
    protected Boolean activ = false;

    public void setActiv(Boolean activ) {
        this.activ = activ;
    }

    public Boolean getActiv() {
        return activ;
    }


    public void setIdSocietatiExecutie(SocietatiExecutie idSocietatiExecutie) {
        this.idSocietatiExecutie = idSocietatiExecutie;
    }

    public SocietatiExecutie getIdSocietatiExecutie() {
        return idSocietatiExecutie;
    }


    public void setNumeInstalator(String numeInstalator) {
        this.numeInstalator = numeInstalator;
    }

    public String getNumeInstalator() {
        return numeInstalator;
    }

    public void setTipAutInstalator(String tipAutInstalator) {
        this.tipAutInstalator = tipAutInstalator;
    }

    public String getTipAutInstalator() {
        return tipAutInstalator;
    }

    public void setNrAutInstalator(Integer nrAutInstalator) {
        this.nrAutInstalator = nrAutInstalator;
    }

    public Integer getNrAutInstalator() {
        return nrAutInstalator;
    }

    public void setDataStartAutInstalator(Date dataStartAutInstalator) {
        this.dataStartAutInstalator = dataStartAutInstalator;
    }

    public Date getDataStartAutInstalator() {
        return dataStartAutInstalator;
    }

    public void setDataStopAutInstalator(Date dataStopAutInstalator) {
        this.dataStopAutInstalator = dataStopAutInstalator;
    }

    public Date getDataStopAutInstalator() {
        return dataStopAutInstalator;
    }


}