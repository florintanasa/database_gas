package com.company.gaz.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s|numeStrada")
@Table(name = "GAZ_STRAZI")
@Entity(name = "gaz$Strazi")
public class Strazi extends StandardEntity {
    private static final long serialVersionUID = -7689615648017718616L;

    @NotNull
    @Column(name = "NUME_STRADA", nullable = false, unique = true, length = 50)
    protected String numeStrada;

    public void setNumeStrada(String numeStrada) {
        this.numeStrada = numeStrada;
    }

    public String getNumeStrada() {
        return numeStrada;
    }


}