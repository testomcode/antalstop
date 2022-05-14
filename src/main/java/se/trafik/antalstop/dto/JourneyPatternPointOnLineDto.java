package se.trafik.antalstop.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class JourneyPatternPointOnLineDto {
    @JsonProperty("LineNumber")
    private Integer lineNumber;

    @JsonProperty("DirectionCode")
    private Integer directionCode;

    @JsonProperty("JourneyPatternPointNumber")
    private Integer journeyPatternPointNumber;

    @JsonProperty("LastModifiedUtcDateTime")
    private String lastModifiedUtcDateTime;

    @JsonProperty("ExistsFromDate")
    private String existsFromDate;

    public JourneyPatternPointOnLineDto() {
    }

    public Integer getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(Integer lineNumber) {
        this.lineNumber = lineNumber;
    }

    public Integer getDirectionCode() {
        return directionCode;
    }

    public void setDirectionCode(Integer directionCode) {
        this.directionCode = directionCode;
    }

    public Integer getJourneyPatternPointNumber() {
        return journeyPatternPointNumber;
    }

    public void setJourneyPatternPointNumber(Integer journeyPatternPointNumber) {
        this.journeyPatternPointNumber = journeyPatternPointNumber;
    }

    public String getLastModifiedUtcDateTime() {
        return lastModifiedUtcDateTime;
    }

    public void setLastModifiedUtcDateTime(String lastModifiedUtcDateTime) {
        this.lastModifiedUtcDateTime = lastModifiedUtcDateTime;
    }

    public String getExistsFromDate() {
        return existsFromDate;
    }

    public void setExistsFromDate(String existsFromDate) {
        this.existsFromDate = existsFromDate;
    }

    @Override
    public String toString() {
        return "JourneyPatternPointOnLineDto{" +
                "lineNumber=" + lineNumber +
                ", directionCode=" + directionCode +
                ", journeyPatternPointNumber=" + journeyPatternPointNumber +
                ", lastModifiedUtcDateTime='" + lastModifiedUtcDateTime + '\'' +
                ", existsFromDate='" + existsFromDate + '\'' +
                '}';
    }
}
