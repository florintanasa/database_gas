package com.company.gaz.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s|prefix")
@Table(name = "GAZ_TIP_PERSOANA")
@Entity(name = "gaz$TipPersoana")
public class TipPersoana extends StandardEntity {
    private static final long serialVersionUID = 277842495471807217L;

    @NotNull
    @Column(name = "PREFIX", nullable = false, length = 25)
    protected String prefix;

    @NotNull
    @Column(name = "DENUMIRE", nullable = false)
    protected String denumire;

    @Column(name = "SUFIX", length = 25)
    protected String sufix;

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setSufix(String sufix) {
        this.sufix = sufix;
    }

    public String getSufix() {
        return sufix;
    }


}