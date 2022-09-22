package com.company.gaz.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s|denumireTipTelefon")
@Table(name = "GAZ_TIP_TELEFON")
@Entity(name = "gaz$TipTelefon")
public class TipTelefon extends StandardEntity {
    private static final long serialVersionUID = -6693364639519676912L;

    @NotNull
    @Column(name = "DENUMIRE_TIP_TELEFON", nullable = false, unique = true, length = 25)
    protected String denumireTipTelefon;

    public void setDenumireTipTelefon(String denumireTipTelefon) {
        this.denumireTipTelefon = denumireTipTelefon;
    }

    public String getDenumireTipTelefon() {
        return denumireTipTelefon;
    }


}