package com.company.gaz.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s|numeJudet")
@Table(name = "GAZ_JUDETE")
@Entity(name = "gaz$Judete")
public class Judete extends StandardEntity {
    private static final long serialVersionUID = 1562398133034195020L;

    @NotNull
    @Column(name = "NUME_JUDET", nullable = false, unique = true, length = 25)
    protected String numeJudet;

    public void setNumeJudet(String numeJudet) {
        this.numeJudet = numeJudet;
    }

    public String getNumeJudet() {
        return numeJudet;
    }


}