package com.company.gaz.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s|tipAct")
@Table(name = "GAZ_TIP_ACT")
@Entity(name = "gaz$TipAct")
public class TipAct extends StandardEntity {
    private static final long serialVersionUID = 8272640172326420908L;

    @NotNull
    @Column(name = "TIP_ACT", nullable = false, unique = true, length = 15)
    protected String tipAct;

    @NotNull
    @Column(name = "EXPLICATII", nullable = false, length = 100)
    protected String explicatii;

    public void setTipAct(String tipAct) {
        this.tipAct = tipAct;
    }

    public String getTipAct() {
        return tipAct;
    }

    public void setExplicatii(String explicatii) {
        this.explicatii = explicatii;
    }

    public String getExplicatii() {
        return explicatii;
    }


}