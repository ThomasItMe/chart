package com.company.chartexample.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "CHARTEXAMPLE_PIVOT_TABLE")
@Entity(name = "chartexample_PivotTable")
public class PivotTable extends StandardEntity {
    private static final long serialVersionUID = -6361083221801460031L;

    @Column(name = "ROW_")
    private Integer row;

    @Column(name = "TOTAL_BILL")
    private Double totalBill;

    @Column(name = "SEX")
    private String sex;

    @Column(name = "SMOKER")
    private String smoker;

    @Column(name = "DAY_")
    private String day;

    @Column(name = "TIME_")
    private String time;

    @Column(name = "SIZE_")
    private Integer size;

    @Column(name = "TIP")
    private Double tip;

    public Double getTip() {
        return tip;
    }

    public void setTip(Double tip) {
        this.tip = tip;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Time getTime() {
        return time == null ? null : Time.fromId(time);
    }

    public void setTime(Time time) {
        this.time = time == null ? null : time.getId();
    }

    public Day getDay() {
        return day == null ? null : Day.fromId(day);
    }

    public void setDay(Day day) {
        this.day = day == null ? null : day.getId();
    }

    public Smoker getSmoker() {
        return smoker == null ? null : Smoker.fromId(smoker);
    }

    public void setSmoker(Smoker smoker) {
        this.smoker = smoker == null ? null : smoker.getId();
    }

    public Sex getSex() {
        return sex == null ? null : Sex.fromId(sex);
    }

    public void setSex(Sex sex) {
        this.sex = sex == null ? null : sex.getId();
    }

    public Double getTotalBill() {
        return totalBill;
    }

    public void setTotalBill(Double totalBill) {
        this.totalBill = totalBill;
    }

    public Integer getRow() {
        return row;
    }

    public void setRow(Integer row) {
        this.row = row;
    }
}