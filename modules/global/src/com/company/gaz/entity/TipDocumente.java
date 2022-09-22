package com.company.gaz.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s|denumire")
@Table(name = "GAZ_TIP_DOCUMENTE")
@Entity(name = "gaz$TipDocumente")
public class TipDocumente extends StandardEntity {
    private static final long serialVersionUID = -3648275852834700553L;

    @NotNull
    @Column(name = "DENUMIRE", nullable = false)
    protected String denumire;

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public String getDenumire() {
        return denumire;
    }


}