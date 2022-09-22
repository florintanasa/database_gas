package com.company.gaz.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;
import javax.validation.constraints.NotNull;

@NamePattern("%s|tipArtera")
@Table(name = "GAZ_ARTERA")
@Entity(name = "gaz$Artera")
public class Artera extends StandardEntity {
    private static final long serialVersionUID = -5123472151056253088L;

    @NotNull
    @Column(name = "TIP_ARTERA", nullable = false, unique = true, length = 15)
    protected String tipArtera;

    public void setTipArtera(String tipArtera) {
        this.tipArtera = tipArtera;
    }

    public String getTipArtera() {
        return tipArtera;
    }


}