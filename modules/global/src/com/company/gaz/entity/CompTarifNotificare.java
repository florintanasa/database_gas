package com.company.gaz.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@NamePattern("%s %s|tipTarif,denTarif")
@Table(name = "GAZ_COMP_TARIF_NOTIFICARE")
@Entity(name = "gaz$CompTarifNotificare")
public class CompTarifNotificare extends StandardEntity {
    private static final long serialVersionUID = 4389610032902253094L;

    @NotNull
    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_SIRUTA_ID")
    protected Siruta idSiruta;

    @NotNull
    @Column(name = "TIP_TARIF", nullable = false, length = 5)
    protected String tipTarif;

    @NotNull
    @Column(name = "DEN_TARIF", nullable = false)
    protected String denTarif;

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

    public void setExplicatii(String explicatii) {
        this.explicatii = explicatii;
    }

    public String getExplicatii() {
        return explicatii;
    }


}