package se.trafik.antalstop.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StopPointModelDto {
    @JsonProperty("StatusCode")
    private Integer statusCode;

    @JsonProperty("Message")
    private String message;

    @JsonProperty("ExecutionTime")
    private Integer executionTime;

    @JsonProperty("ResponseData")
    private StopPointResponseDataDto responseData;

    public StopPointModelDto() {
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

    public StopPointResponseDataDto getResponseData() {
        return responseData;
    }

    public void setResponseData(StopPointResponseDataDto responseData) {
        this.responseData = responseData;
    }

    @Override
    public String toString() {
        return "StopPointModelDto{" +
                "statusCode=" + statusCode +
                ", message='" + message + '\'' +
                ", executionTime=" + executionTime +
                ", responseData=" + responseData +
                '}';
    }
}
