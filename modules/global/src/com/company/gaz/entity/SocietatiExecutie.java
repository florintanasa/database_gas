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

@NamePattern("%s %s %s|idParteneri,tipAutSocietateExecutie,nrAutSocietateExecutie")
@Table(name = "GAZ_SOCIETATI_EXECUTIE")
@Entity(name = "gaz$SocietatiExecutie")
public class SocietatiExecutie extends StandardEntity {
    private static final long serialVersionUID = -1886934449361930351L;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_PARTENERI_ID")
    protected Parteneri idParteneri;

    @NotNull
    @Column(name = "TIP_AUT_SOCIETATE_EXECUTIE", nullable = false, length = 10)
    protected String tipAutSocietateExecutie;

    @NotNull
    @Column(name = "NR_AUT_SOCIETATE_EXECUTIE", nullable = false)
    protected Integer nrAutSocietateExecutie;

    @Temporal(TemporalType.DATE)
    @NotNull
    @Column(name = "DATA_START_AUT_SOCIETATE_EXECUTIE", nullable = false)
    protected Date dataStartAutSocietateExecutie;

    @Temporal(TemporalType.DATE)
    @NotNull
    @Column(name = "DATA_STOP_AUT_SOCIETATE_EXECUTIE", nullable = false)
    protected Date dataStopAutSocietateExecutie;

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
    @JoinColumn(name = "ID_EMAIL_ID")
    protected Email idEmail;

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

    public void setIdRepLegal(Parteneri idRepLegal) {
        this.idRepLegal = idRepLegal;
    }

    public Parteneri getIdRepLegal() {
        return idRepLegal;
    }

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

    public void setIdEmail(Email idEmail) {
        this.idEmail = idEmail;
    }

    public Email getIdEmail() {
        return idEmail;
    }


    public Locatii getIdLocatii() {
        return idLocatii;
    }

    public void setIdLocatii(Locatii idLocatii) {
        this.idLocatii = idLocatii;
    }


    public void setIdParteneri(Parteneri idParteneri) {
        this.idParteneri = idParteneri;
    }

    public Parteneri getIdParteneri() {
        return idParteneri;
    }

    public void setTipAutSocietateExecutie(String tipAutSocietateExecutie) {
        this.tipAutSocietateExecutie = tipAutSocietateExecutie;
    }

    public String getTipAutSocietateExecutie() {
        return tipAutSocietateExecutie;
    }

    public void setNrAutSocietateExecutie(Integer nrAutSocietateExecutie) {
        this.nrAutSocietateExecutie = nrAutSocietateExecutie;
    }

    public Integer getNrAutSocietateExecutie() {
        return nrAutSocietateExecutie;
    }

    public void setDataStartAutSocietateExecutie(Date dataStartAutSocietateExecutie) {
        this.dataStartAutSocietateExecutie = dataStartAutSocietateExecutie;
    }

    public Date getDataStartAutSocietateExecutie() {
        return dataStartAutSocietateExecutie;
    }

    public void setDataStopAutSocietateExecutie(Date dataStopAutSocietateExecutie) {
        this.dataStopAutSocietateExecutie = dataStopAutSocietateExecutie;
    }

    public Date getDataStopAutSocietateExecutie() {
        return dataStopAutSocietateExecutie;
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

    public void setActiv(Boolean activ) {
        this.activ = activ;
    }

    public Boolean getActiv() {
        return activ;
    }


}