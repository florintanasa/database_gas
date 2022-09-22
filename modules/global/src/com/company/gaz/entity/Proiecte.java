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

@NamePattern("%s %s|idObiecte,nrProiect")
@Table(name = "GAZ_PROIECTE")
@Entity(name = "gaz$Proiecte")
public class Proiecte extends StandardEntity {
    private static final long serialVersionUID = 6877606950118799468L;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_OBIECTE_ID")
    protected Obiecte idObiecte;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_PROIECTANT_ID")
    protected Proiectant idProiectant;

    @Column(name = "NR_PROIECT", length = 25)
    protected String nrProiect;

    @Column(name = "NR_ADRESA_OSD", length = 10)
    protected String nrAdresaOsd;

    @Temporal(TemporalType.DATE)
    @Column(name = "DATA_DEPUNERE_OSD")
    protected Date dataDepunereOsd;

    @Temporal(TemporalType.DATE)
    @Column(name = "DATA_AVIZARE_OSD")
    protected Date dataAvizareOsd;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_VERIFICATOR_ID")
    protected Verificator idVerificator;

    @Column(name = "NR_REF_VERIF", length = 10)
    protected String nrRefVerif;

    @Temporal(TemporalType.DATE)
    @Column(name = "DATA_AVIZARE_VERIF")
    protected Date dataAvizareVerif;

    public void setIdObiecte(Obiecte idObiecte) {
        this.idObiecte = idObiecte;
    }

    public Obiecte getIdObiecte() {
        return idObiecte;
    }

    public void setIdProiectant(Proiectant idProiectant) {
        this.idProiectant = idProiectant;
    }

    public Proiectant getIdProiectant() {
        return idProiectant;
    }

    public void setNrProiect(String nrProiect) {
        this.nrProiect = nrProiect;
    }

    public String getNrProiect() {
        return nrProiect;
    }

    public void setNrAdresaOsd(String nrAdresaOsd) {
        this.nrAdresaOsd = nrAdresaOsd;
    }

    public String getNrAdresaOsd() {
        return nrAdresaOsd;
    }

    public void setDataDepunereOsd(Date dataDepunereOsd) {
        this.dataDepunereOsd = dataDepunereOsd;
    }

    public Date getDataDepunereOsd() {
        return dataDepunereOsd;
    }

    public void setDataAvizareOsd(Date dataAvizareOsd) {
        this.dataAvizareOsd = dataAvizareOsd;
    }

    public Date getDataAvizareOsd() {
        return dataAvizareOsd;
    }

    public void setIdVerificator(Verificator idVerificator) {
        this.idVerificator = idVerificator;
    }

    public Verificator getIdVerificator() {
        return idVerificator;
    }

    public void setNrRefVerif(String nrRefVerif) {
        this.nrRefVerif = nrRefVerif;
    }

    public String getNrRefVerif() {
        return nrRefVerif;
    }

    public void setDataAvizareVerif(Date dataAvizareVerif) {
        this.dataAvizareVerif = dataAvizareVerif;
    }

    public Date getDataAvizareVerif() {
        return dataAvizareVerif;
    }


}