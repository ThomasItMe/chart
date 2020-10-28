package com.company.chartexample.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "CHARTEXAMPLE_COUNTRY_SALES")
@Entity(name = "chartexample_CountrySales")
public class CountrySales extends StandardEntity {
    private static final long serialVersionUID = -4479541582800917303L;

    @Column(name = "PRODUCT")
    protected String product;

    @Column(name = "CATEGORY")
    protected String category;

    @Column(name = "COUNTRY")
    protected String country;

    @Column(name = "SALES")
    protected Integer sales;

    @Column(name = "EXPENSE")
    protected Integer expense;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getProduct() {
        return product;
    }

    public Integer getExpense() {
        return expense;
    }

    public void setExpense(Integer expense) {
        this.expense = expense;
    }

    public Integer getSales() {
        return sales;
    }

    public void setSales(Integer sales) {
        this.sales = sales;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}