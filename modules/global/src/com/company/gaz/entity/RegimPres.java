package com.company.gaz.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s|regimPresiune")
@Table(name = "GAZ_REGIM_PRES")
@Entity(name = "gaz$RegimPres")
public class RegimPres extends StandardEntity {
    private static final long serialVersionUID = 6140330539024169878L;

    @NotNull
    @Column(name = "REGIM_PRESIUNE", nullable = false, unique = true, length = 2)
    protected String regimPresiune;

    @NotNull
    @Column(name = "DOM_PRESIUNE", nullable = false, length = 20)
    protected String domPresiune;

    public void setRegimPresiune(String regimPresiune) {
        this.regimPresiune = regimPresiune;
    }

    public String getRegimPresiune() {
        return regimPresiune;
    }

    public void setDomPresiune(String domPresiune) {
        this.domPresiune = domPresiune;
    }

    public String getDomPresiune() {
        return domPresiune;
    }



}