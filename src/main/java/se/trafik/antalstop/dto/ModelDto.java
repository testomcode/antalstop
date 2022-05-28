package se.trafik.antalstop.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ModelDto<T> {

    @JsonProperty("StatusCode")
    private Integer statusCode;

    @JsonProperty("Message")
    private String message;

    @JsonProperty("ExecutionTime")
    private Integer executionTime;

    @JsonProperty("ResponseData")
    private ResponseDataDto<T> responseData;

    public ModelDto() {
    }

    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getExecutionTime() {
        return executionTime;
    }

    public void setExecutionTime(Integer executionTime) {
        this.executionTime = executionTime;
    }

    public ResponseDataDto<T> getResponseData() {
        return responseData;
    }

    public void setResponseData(ResponseDataDto<T> responseData) {
        this.responseData = responseData;
    }
}
