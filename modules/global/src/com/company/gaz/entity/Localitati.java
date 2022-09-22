package com.company.gaz.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s|numeLocalitate")
@Table(name = "GAZ_LOCALITATI")
@Entity(name = "gaz$Localitati")
public class Localitati extends StandardEntity {
    private static final long serialVersionUID = 6646226798431979033L;

    @NotNull
    @Column(name = "NUME_LOCALITATE", nullable = false, unique = true, length = 30)
    protected String numeLocalitate;

    public void setNumeLocalitate(String numeLocalitate) {
        this.numeLocalitate = numeLocalitate;
    }

    public String getNumeLocalitate() {
        return numeLocalitate;
    }


}