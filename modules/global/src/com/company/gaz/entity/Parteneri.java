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
import javax.persistence.OneToOne;

@NamePattern("%s|denumire")
@Table(name = "GAZ_PARTENERI")
@Entity(name = "gaz$Parteneri")
public class Parteneri extends StandardEntity {
    private static final long serialVersionUID = 8870922470442400721L;

    @NotNull
    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_TIP_PERSOANA_ID")
    protected TipPersoana idTipPersoana;

    @NotNull
    @Column(name = "DENUMIRE", nullable = false)
    protected String denumire;

    public void setIdTipPersoana(TipPersoana idTipPersoana) {
        this.idTipPersoana = idTipPersoana;
    }

    public TipPersoana getIdTipPersoana() {
        return idTipPersoana;
    }


    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public String getDenumire() {
        return denumire;
    }


}