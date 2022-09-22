package com.company.gaz.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s|calitateRepLegal")
@Table(name = "GAZ_REP_LEGAL")
@Entity(name = "gaz$RepLegal")
public class RepLegal extends StandardEntity {
    private static final long serialVersionUID = 4191265292934050399L;

    @NotNull
    @Column(name = "CALITATE_REP_LEGAL", nullable = false)
    protected String calitateRepLegal;

    public void setCalitateRepLegal(String calitateRepLegal) {
        this.calitateRepLegal = calitateRepLegal;
    }

    public String getCalitateRepLegal() {
        return calitateRepLegal;
    }


}