package com.mongo.db.utils;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
@Builder
@AllArgsConstructor
public class ResponseWrapper {
    Object data;
    private Integer status;

    /**
     * Wraps data with status code
     * @param data response from the api
     * @param status status code
     * @return the wrapped data
     */
    public static ResponseWrapper getResponse(Object data, Integer status) {
        return ResponseWrapper.builder().data(data).status(status).build();
    }

    /**
     * Wraps data with status code
     * @param data response from the api
     * @param httpStatus http-status
     * @return the wrapped data
     */
    public static ResponseWrapper getResponse(Object data, HttpStatus httpStatus) {
        return ResponseWrapper.getResponse(data, httpStatus.value());
    }
}
