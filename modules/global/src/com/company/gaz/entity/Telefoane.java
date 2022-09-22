package com.company.gaz.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s|numarTelefon")
@Table(name = "GAZ_TELEFOANE")
@Entity(name = "gaz$Telefoane")
public class Telefoane extends StandardEntity {
    private static final long serialVersionUID = -5715154962933370059L;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_PARTENERI_ID")
    protected Parteneri idParteneri;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_TIP_TELEFON_ID")
    protected TipTelefon idTipTelefon;

    @Length(message = "{msg://LungNrTelefon}", min = 12, max = 12)
    @NotNull
    @Column(name = "NUMAR_TELEFON", nullable = false, length = 12)
    protected String numarTelefon;

    @NotNull
    @Column(name = "PRINCIPAL", nullable = false)
    protected Boolean principal = false;

    @NotNull
    @Column(name = "ACTIV", nullable = false)
    protected Boolean activ = false;

    public void setPrincipal(Boolean principal) {
        this.principal = principal;
    }

    public Boolean getPrincipal() {
        return principal;
    }

    public void setActiv(Boolean activ) {
        this.activ = activ;
    }

    public Boolean getActiv() {
        return activ;
    }


    public void setIdParteneri(Parteneri idParteneri) {
        this.idParteneri = idParteneri;
    }

    public Parteneri getIdParteneri() {
        return idParteneri;
    }

    public void setIdTipTelefon(TipTelefon idTipTelefon) {
        this.idTipTelefon = idTipTelefon;
    }

    public TipTelefon getIdTipTelefon() {
        return idTipTelefon;
    }

    public void setNumarTelefon(String numarTelefon) {
        this.numarTelefon = numarTelefon;
    }

    public String getNumarTelefon() {
        return numarTelefon;
    }


}