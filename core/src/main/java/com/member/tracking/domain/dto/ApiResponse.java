package com.member.tracking.domain.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ApiResponse<T> {
    private T data;
    private String code;
    private String message;

    public static <T> ApiResponse<T> ok(T data) {
        return new ApiResponse<T>(data, "OK", null);
    }

    public static <T> ApiResponse<T> fail(T data, ErrorCode code) {
        return new ApiResponse<T>(data, code.getCode(), code.getMessage());
    }

    public static <T> ApiResponse<T> fail(T data, ErrorCode code, String message) {
        return new ApiResponse<T>(data, code.getCode(), message);
    }

}
