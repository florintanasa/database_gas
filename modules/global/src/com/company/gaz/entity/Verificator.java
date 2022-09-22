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

@NamePattern("%s %s|idNumeVerificator,nrAtestatVerificator")
@Table(name = "GAZ_VERIFICATOR")
@Entity(name = "gaz$Verificator")
public class Verificator extends StandardEntity {
    private static final long serialVersionUID = 5189409938242507763L;

    @NotNull
    @Column(name = "NUME_VERIFICATOR", nullable = false, length = 25)
    protected String numeVerificator;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_NUME_VERIFICATOR_ID")
    protected Parteneri idNumeVerificator;

    @NotNull
    @Column(name = "EMITENT_ATESTAT", nullable = false, length = 25)
    protected String emitentAtestat;

    @NotNull
    @Column(name = "NR_ATESTAT_VERIFICATOR", nullable = false, length = 10)
    protected String nrAtestatVerificator;

    @Temporal(TemporalType.DATE)
    @NotNull
    @Column(name = "DATA_ATESTAT_VERIFICATOR", nullable = false)
    protected Date dataAtestatVerificator;

    @Temporal(TemporalType.DATE)
    @NotNull
    @Column(name = "DATA_SFARSIT_ATESTAT_VERIFICATOR", nullable = false)
    protected Date dataSfarsitAtestatVerificator;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_CONTURI_BANCARE_PARTENERI_ID")
    protected ConturiBancareParteneri idConturiBancareParteneri;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_LOCATII_ID")
    protected Locatii idLocatii;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @ManyToOne(fetch = FetchType.LAZY)
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

    @Column(name = "ACTIV")
    protected Boolean activ;

    public void setIdConturiBancareParteneri(ConturiBancareParteneri idConturiBancareParteneri) {
        this.idConturiBancareParteneri = idConturiBancareParteneri;
    }

    public ConturiBancareParteneri getIdConturiBancareParteneri() {
        return idConturiBancareParteneri;
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

    public void setActiv(Boolean activ) {
        this.activ = activ;
    }

    public Boolean getActiv() {
        return activ;
    }


    public void setIdNumeVerificator(Parteneri idNumeVerificator) {
        this.idNumeVerificator = idNumeVerificator;
    }

    public Parteneri getIdNumeVerificator() {
        return idNumeVerificator;
    }

    public void setDataSfarsitAtestatVerificator(Date dataSfarsitAtestatVerificator) {
        this.dataSfarsitAtestatVerificator = dataSfarsitAtestatVerificator;
    }

    public Date getDataSfarsitAtestatVerificator() {
        return dataSfarsitAtestatVerificator;
    }


    public void setNumeVerificator(String numeVerificator) {
        this.numeVerificator = numeVerificator;
    }

    public String getNumeVerificator() {
        return numeVerificator;
    }

    public void setEmitentAtestat(String emitentAtestat) {
        this.emitentAtestat = emitentAtestat;
    }

    public String getEmitentAtestat() {
        return emitentAtestat;
    }

    public void setNrAtestatVerificator(String nrAtestatVerificator) {
        this.nrAtestatVerificator = nrAtestatVerificator;
    }

    public String getNrAtestatVerificator() {
        return nrAtestatVerificator;
    }

    public void setDataAtestatVerificator(Date dataAtestatVerificator) {
        this.dataAtestatVerificator = dataAtestatVerificator;
    }

    public Date getDataAtestatVerificator() {
        return dataAtestatVerificator;
    }


}