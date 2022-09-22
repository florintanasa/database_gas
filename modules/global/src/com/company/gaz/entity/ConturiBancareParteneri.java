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

@NamePattern("%s|iban")
@Table(name = "GAZ_CONTURI_BANCARE_PARTENERI")
@Entity(name = "gaz$ConturiBancareParteneri")
public class ConturiBancareParteneri extends StandardEntity {
    private static final long serialVersionUID = 3751743374051178712L;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_PARTENERI_ID")
    protected Parteneri idParteneri;

    @Length(message = "{msg://msg;//atetie}", min = 24, max = 24)
    @NotNull
    @Column(name = "IBAN", nullable = false, length = 24)
    protected String iban;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_BANCI_ID")
    protected Banci idBanci;

    public void setIdParteneri(Parteneri idParteneri) {
        this.idParteneri = idParteneri;
    }

    public Parteneri getIdParteneri() {
        return idParteneri;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getIban() {
        return iban;
    }

    public void setIdBanci(Banci idBanci) {
        this.idBanci = idBanci;
    }

    public Banci getIdBanci() {
        return idBanci;
    }


}