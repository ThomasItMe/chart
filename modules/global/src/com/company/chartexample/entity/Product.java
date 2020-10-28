package com.company.chartexample.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "CHARTEXAMPLE_PRODUCT")
@Entity(name = "chartexample_Product")
@NamePattern("%s|name")
public class Product extends StandardEntity {
    private static final long serialVersionUID = 2234295715685820680L;

    @Column(name = "ROW_LABELS")
    private String rowLabels;

    @Column(name = "CATEGORY")
    private String category;

    @Column(name = "NAME")
    private String name;

    @Column(name = "REVOLVING")
    private Integer revolving;

    @Column(name = "TERM_LOAN")
    private Integer termLoan;

    @Column(name = "GRAND_TOTAL")
    private Integer grandTotal;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getGrandTotal() {
        return grandTotal;
    }

    public void setGrandTotal(Integer grandTotal) {
        this.grandTotal = grandTotal;
    }

    public Integer getTermLoan() {
        return termLoan;
    }

    public void setTermLoan(Integer termLoan) {
        this.termLoan = termLoan;
    }

    public Integer getRevolving() {
        return revolving;
    }

    public void setRevolving(Integer revolving) {
        this.revolving = revolving;
    }

    public RowLabels getRowLabels() {
        return rowLabels == null ? null : RowLabels.fromId(rowLabels);
    }

    public void setRowLabels(RowLabels rowLabels) {
        this.rowLabels = rowLabels == null ? null : rowLabels.getId();
    }
}