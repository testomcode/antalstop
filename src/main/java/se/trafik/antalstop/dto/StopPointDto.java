package se.trafik.antalstop.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StopPointDto {
    @JsonProperty("StopPointNumber")
    private Integer stopPointNumber;

    @JsonProperty("StopPointName")
    private String stopPointName;

    @JsonProperty("StopAreaNumber")
    private Integer stopAreaNumber;

    @JsonProperty("LocationNorthingCoordinate")
    private Double locationNorthingCoordinate;

    @JsonProperty("LocationEastingCoordinate")
    private Double locationEastingCoordinate;

    @JsonProperty("ZoneShortName")
    private String zoneShortName;

    @JsonProperty("StopAreaTypeCode")
    private String stopAreaTypeCode;

    @JsonProperty("LastModifiedUtcDateTime")
    private String lastModifiedUtcDateTime;

    @JsonProperty("ExistsFromDate")
    private String existsFromDate;

    public StopPointDto() {
    }

    public Integer getStopPointNumber() {
        return stopPointNumber;
    }

    public void setStopPointNumber(Integer stopPointNumber) {
        this.stopPointNumber = stopPointNumber;
    }

    public String getStopPointName() {
        return stopPointName;
    }

    public void setStopPointName(String stopPointName) {
        this.stopPointName = stopPointName;
    }

    public Integer getStopAreaNumber() {
        return stopAreaNumber;
    }

    public void setStopAreaNumber(Integer stopAreaNumber) {
        this.stopAreaNumber = stopAreaNumber;
    }

    public Double getLocationNorthingCoordinate() {
        return locationNorthingCoordinate;
    }

    public void setLocationNorthingCoordinate(Double locationNorthingCoordinate) {
        this.locationNorthingCoordinate = locationNorthingCoordinate;
    }

    public Double getLocationEastingCoordinate() {
        return locationEastingCoordinate;
    }

    public void setLocationEastingCoordinate(Double locationEastingCoordinate) {
        this.locationEastingCoordinate = locationEastingCoordinate;
    }

    public String getZoneShortName() {
        return zoneShortName;
    }

    public void setZoneShortName(String zoneShortName) {
        this.zoneShortName = zoneShortName;
    }

    public String getStopAreaTypeCode() {
        return stopAreaTypeCode;
    }

    public void setStopAreaTypeCode(String stopAreaTypeCode) {
        this.stopAreaTypeCode = stopAreaTypeCode;
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
        return "StopPointDto{" +
                "stopPointNumber=" + stopPointNumber +
                ", stopPointName='" + stopPointName + '\'' +
                ", stopAreaNumber=" + stopAreaNumber +
                ", locationNorthingCoordinate=" + locationNorthingCoordinate +
                ", locationEastingCoordinate=" + locationEastingCoordinate +
                ", zoneShortName='" + zoneShortName + '\'' +
                ", stopAreaTypeCode='" + stopAreaTypeCode + '\'' +
                ", lastModifiedUtcDateTime='" + lastModifiedUtcDateTime + '\'' +
                ", existsFromDate='" + existsFromDate + '\'' +
                '}';
    }
}
