package com.company.gaz.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s|codSiruta")
@Table(name = "GAZ_SIRUTA")
@Entity(name = "gaz$Siruta")
public class Siruta extends StandardEntity {
    private static final long serialVersionUID = 2312552713639015302L;

    @NotNull
    @Column(name = "COD_SIRUTA", nullable = false, unique = true)
    protected Integer codSiruta;

    @NotNull
    @Column(name = "LOCALITATE", nullable = false, length = 30)
    protected String localitate;

    @NotNull
    @Column(name = "JUDET", nullable = false, length = 30)
    protected String judet;

    public void setCodSiruta(Integer codSiruta) {
        this.codSiruta = codSiruta;
    }

    public Integer getCodSiruta() {
        return codSiruta;
    }

    public void setLocalitate(String localitate) {
        this.localitate = localitate;
    }

    public String getLocalitate() {
        return localitate;
    }

    public void setJudet(String judet) {
        this.judet = judet;
    }

    public String getJudet() {
        return judet;
    }


}