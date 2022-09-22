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

@NamePattern("%s %s %s|idParteneri,tipAutSocietateProiectare,nrAutSocietateProiectare")
@Table(name = "GAZ_SOCIETATI_PROIECTARE")
@Entity(name = "gaz$SocietatiProiectare")
public class SocietatiProiectare extends StandardEntity {
    private static final long serialVersionUID = -6556419668596715185L;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_PARTENERI_ID")
    protected Parteneri idParteneri;

    @NotNull
    @Column(name = "TIP_AUT_SOCIETATE_PROIECTARE", nullable = false, length = 10)
    protected String tipAutSocietateProiectare;

    @NotNull
    @Column(name = "NR_AUT_SOCIETATE_PROIECTARE", nullable = false)
    protected Integer nrAutSocietateProiectare;

    @Temporal(TemporalType.DATE)
    @NotNull
    @Column(name = "DATA_START_AUT_SOCIETATE_PROIECTARE", nullable = false)
    protected Date dataStartAutSocietateProiectare;

    @Temporal(TemporalType.DATE)
    @NotNull
    @Column(name = "DATA_STOP_AUT_SOCIETATE_PROIECTARE", nullable = false)
    protected Date dataStopAutSocietateProiectare;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_LOCATII_ID")
    protected Locatii idLocatii;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_TELEFOANE_ID")
    protected Telefoane idTelefoane;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_FAX_ID")
    protected Telefoane idFax;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IDEMAIL_ID")
    protected Email idemail;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_CONTURI_BANCARE_PARTENERI_ID")
    protected ConturiBancareParteneri idConturiBancareParteneri;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_REP_LEGAL_ID")
    protected Parteneri idRepLegal;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_CALITATE_REP_LEGAL_ID")
    protected RepLegal idCalitateRepLegal;

    @NotNull
    @Column(name = "ACTIV", nullable = false)
    protected Boolean activ = false;

    public void setIdCalitateRepLegal(RepLegal idCalitateRepLegal) {
        this.idCalitateRepLegal = idCalitateRepLegal;
    }

    public RepLegal getIdCalitateRepLegal() {
        return idCalitateRepLegal;
    }


    public void setIdFax(Telefoane idFax) {
        this.idFax = idFax;
    }

    public Telefoane getIdFax() {
        return idFax;
    }

    public void setIdemail(Email idemail) {
        this.idemail = idemail;
    }

    public Email getIdemail() {
        return idemail;
    }

    public void setIdRepLegal(Parteneri idRepLegal) {
        this.idRepLegal = idRepLegal;
    }

    public Parteneri getIdRepLegal() {
        return idRepLegal;
    }


    public void setIdParteneri(Parteneri idParteneri) {
        this.idParteneri = idParteneri;
    }

    public Parteneri getIdParteneri() {
        return idParteneri;
    }

    public void setIdConturiBancareParteneri(ConturiBancareParteneri idConturiBancareParteneri) {
        this.idConturiBancareParteneri = idConturiBancareParteneri;
    }

    public ConturiBancareParteneri getIdConturiBancareParteneri() {
        return idConturiBancareParteneri;
    }

    public void setActiv(Boolean activ) {
        this.activ = activ;
    }

    public Boolean getActiv() {
        return activ;
    }


    public void setTipAutSocietateProiectare(String tipAutSocietateProiectare) {
        this.tipAutSocietateProiectare = tipAutSocietateProiectare;
    }

    public String getTipAutSocietateProiectare() {
        return tipAutSocietateProiectare;
    }

    public void setNrAutSocietateProiectare(Integer nrAutSocietateProiectare) {
        this.nrAutSocietateProiectare = nrAutSocietateProiectare;
    }

    public Integer getNrAutSocietateProiectare() {
        return nrAutSocietateProiectare;
    }

    public void setDataStartAutSocietateProiectare(Date dataStartAutSocietateProiectare) {
        this.dataStartAutSocietateProiectare = dataStartAutSocietateProiectare;
    }

    public Date getDataStartAutSocietateProiectare() {
        return dataStartAutSocietateProiectare;
    }

    public void setDataStopAutSocietateProiectare(Date dataStopAutSocietateProiectare) {
        this.dataStopAutSocietateProiectare = dataStopAutSocietateProiectare;
    }

    public Date getDataStopAutSocietateProiectare() {
        return dataStopAutSocietateProiectare;
    }

    public void setIdLocatii(Locatii idLocatii) {
        this.idLocatii = idLocatii;
    }

    public Locatii getIdLocatii() {
        return idLocatii;
    }

    public void setIdTelefoane(Telefoane idTelefoane) {
        this.idTelefoane = idTelefoane;
    }

    public Telefoane getIdTelefoane() {
        return idTelefoane;
    }


}