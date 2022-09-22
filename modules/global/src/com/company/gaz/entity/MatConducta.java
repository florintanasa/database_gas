package com.company.gaz.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s|tipMatConducta")
@Table(name = "GAZ_MAT_CONDUCTA")
@Entity(name = "gaz$MatConducta")
public class MatConducta extends StandardEntity {
    private static final long serialVersionUID = 1280683836971767015L;

    @NotNull
    @Column(name = "TIP_MAT_CONDUCTA", nullable = false, unique = true, length = 15)
    protected String tipMatConducta;

    public void setTipMatConducta(String tipMatConducta) {
        this.tipMatConducta = tipMatConducta;
    }

    public String getTipMatConducta() {
        return tipMatConducta;
    }


}