package com.company.gaz.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s|debitRegulator")
@Table(name = "GAZ_TIP_REGULATOR")
@Entity(name = "gaz$TipRegulator")
public class TipRegulator extends StandardEntity {
    private static final long serialVersionUID = 7905906656354774333L;

    @NotNull
    @Column(name = "DENUMIRE_REGULATOR", nullable = false, length = 25)
    protected String denumireRegulator;

    @NotNull
    @Column(name = "DEBIT_REGULATOR", nullable = false, precision = 5, scale = 2)
    protected BigDecimal debitRegulator;

    public void setDenumireRegulator(String denumireRegulator) {
        this.denumireRegulator = denumireRegulator;
    }

    public String getDenumireRegulator() {
        return denumireRegulator;
    }

    public void setDebitRegulator(BigDecimal debitRegulator) {
        this.debitRegulator = debitRegulator;
    }

    public BigDecimal getDebitRegulator() {
        return debitRegulator;
    }


}