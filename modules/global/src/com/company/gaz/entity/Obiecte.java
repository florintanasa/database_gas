package com.company.gaz.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s|tipObiecte")
@Table(name = "GAZ_OBIECTE")
@Entity(name = "gaz$Obiecte")
public class Obiecte extends StandardEntity {
    private static final long serialVersionUID = 4858027854968030801L;

    @NotNull
    @Column(name = "TIP_OBIECTE", nullable = false, unique = true, length = 9)
    protected String tipObiecte;

    @NotNull
    @Column(name = "EXPLICATII_OBIECTE", nullable = false, length = 50)
    protected String explicatiiObiecte;

    public void setTipObiecte(String tipObiecte) {
        this.tipObiecte = tipObiecte;
    }

    public String getTipObiecte() {
        return tipObiecte;
    }

    public void setExplicatiiObiecte(String explicatiiObiecte) {
        this.explicatiiObiecte = explicatiiObiecte;
    }

    public String getExplicatiiObiecte() {
        return explicatiiObiecte;
    }


}