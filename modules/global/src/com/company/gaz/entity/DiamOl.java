package com.company.gaz.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s|codSpecific")
@Table(name = "GAZ_DIAM_OL")
@Entity(name = "gaz$DiamOl")
public class DiamOl extends StandardEntity {
    private static final long serialVersionUID = 4201834437299611171L;

    @NotNull
    @Column(name = "COD_SPECIFIC", nullable = false, unique = true)
    protected Integer codSpecific;

    @NotNull
    @Column(name = "DIAMETRU", nullable = false, length = 15)
    protected String diametru;

    public void setCodSpecific(Integer codSpecific) {
        this.codSpecific = codSpecific;
    }

    public Integer getCodSpecific() {
        return codSpecific;
    }

    public void setDiametru(String diametru) {
        this.diametru = diametru;
    }

    public String getDiametru() {
        return diametru;
    }


}