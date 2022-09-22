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
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s|adresaEmail")
@Table(name = "GAZ_EMAIL")
@Entity(name = "gaz$Email")
public class Email extends StandardEntity {
    private static final long serialVersionUID = -4137238770537646586L;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_PARTENERI_ID")
    protected Parteneri idParteneri;

    @NotNull
    @Column(name = "ADRESA_EMAIL", nullable = false, length = 50)
    protected String adresaEmail;

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

    public void setAdresaEmail(String adresaEmail) {
        this.adresaEmail = adresaEmail;
    }

    public String getAdresaEmail() {
        return adresaEmail;
    }


}