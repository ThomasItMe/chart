package com.company.chartexample.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum Smoker implements EnumClass<String> {

    YES("YES"),
    NO("NO");

    private String id;

    Smoker(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static Smoker fromId(String id) {
        for (Smoker at : Smoker.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}