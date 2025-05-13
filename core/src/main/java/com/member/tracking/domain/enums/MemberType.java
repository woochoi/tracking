package com.member.tracking.domain.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum MemberType {
    PP("PP"),
    EP("EP"),
    IB1("IB1"),
    IS1("IS1");

    private final String code;

    MemberType(String code) {
        this.code = code;
    }

    @JsonValue
    public String getCode() {
        return code;
    }

    @JsonCreator
    public static MemberType fromCode(String code) {
        for (MemberType type : MemberType.values()) {
            if (type.code.equals(code)) {
                return type;
            }
        }
        return null;
    }
}
