package com.company.chartexample.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum RowLabels implements EnumClass<String> {

    CIMB("CIMB"),
    DBS("DBS"),
    HKVB("HKVB"),
    OCBC("OCBC"),
    RHB("RHB"),
    TPBANK("TPBANK"),
    UOB("UOB");

    private String id;

    RowLabels(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static RowLabels fromId(String id) {
        for (RowLabels at : RowLabels.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}