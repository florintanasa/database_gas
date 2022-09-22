package com.company.gaz.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s|denUzuala")
@Table(name = "GAZ_BANCI")
@Entity(name = "gaz$Banci")
public class Banci extends StandardEntity {
    private static final long serialVersionUID = 3660416163258309641L;

    @NotNull
    @Column(name = "DEN_UZUALA", nullable = false, unique = true, length = 25)
    protected String denUzuala;

    @NotNull
    @Column(name = "DEN_COMPLETA", nullable = false)
    protected String denCompleta;

    public void setDenUzuala(String denUzuala) {
        this.denUzuala = denUzuala;
    }

    public String getDenUzuala() {
        return denUzuala;
    }

    public void setDenCompleta(String denCompleta) {
        this.denCompleta = denCompleta;
    }

    public String getDenCompleta() {
        return denCompleta;
    }


}