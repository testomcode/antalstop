package se.trafik.antalstop.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class JourneyPatternPointOnLineResponseDataDto {
    @JsonProperty("Version")
    private String version;

    @JsonProperty("Type")
    private String type;

    @JsonProperty("Result")
    private List<JourneyPatternPointOnLineDto> result;

    public JourneyPatternPointOnLineResponseDataDto() {
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<JourneyPatternPointOnLineDto> getResult() {
        return result;
    }

    public void setResult(List<JourneyPatternPointOnLineDto> result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "JourneyPatternPointOnLineResponseDataDto{" +
                "version='" + version + '\'' +
                ", type='" + type + '\'' +
                ", result=" + result +
                '}';
    }
}
