package com.company.chartexample.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum Time implements EnumClass<String> {

    DINNER("DINNER"),
    LUNCH("LUNCH");

    private String id;

    Time(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static Time fromId(String id) {
        for (Time at : Time.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}