package se.trafik.antalstop.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class JourneyPatternPointOnLineModelDto {
    @JsonProperty("StatusCode")
    private Integer statusCode;

    @JsonProperty("Message")
    private String message;

    @JsonProperty("ExecutionTime")
    private Integer executionTime;

    @JsonProperty("ResponseData")
    private JourneyPatternPointOnLineResponseDataDto responseData;

    public JourneyPatternPointOnLineModelDto() {
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

    public JourneyPatternPointOnLineResponseDataDto getResponseData() {
        return responseData;
    }

    public void setResponseData(JourneyPatternPointOnLineResponseDataDto responseData) {
        this.responseData = responseData;
    }

    @Override
    public String toString() {
        return "JourneyPatternPointOnLineModelDto{" +
                "statusCode=" + statusCode +
                ", message='" + message + '\'' +
                ", executionTime=" + executionTime +
                ", responseData=" + responseData +
                '}';
    }
}
