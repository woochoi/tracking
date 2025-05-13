package com.member.tracking.domain.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum SiteType {
    A1("A1"),
    A2("A2"),
    A3("A3"),
    B1("B1"),
    B2("B2"),
    B3("B3");

    private final String code;

    SiteType(String code) {
        this.code = code;
    }

    @JsonValue
    public String getCode() {
        return code;
    }

    @JsonCreator
    public static SiteType fromCode(String code) {
        for (SiteType type : SiteType.values()) {
            if (type.code.equals(code)) {
                return type;
            }
        }
        return null;
    }
}
