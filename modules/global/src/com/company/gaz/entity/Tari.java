package com.company.gaz.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s|denumireTara")
@Table(name = "GAZ_TARI")
@Entity(name = "gaz$Tari")
public class Tari extends StandardEntity {
    private static final long serialVersionUID = -3548014310269719824L;

    @NotNull
    @Column(name = "DENUMIRE_TARA", nullable = false, unique = true, length = 25)
    protected String denumireTara;

    public void setDenumireTara(String denumireTara) {
        this.denumireTara = denumireTara;
    }

    public String getDenumireTara() {
        return denumireTara;
    }


}