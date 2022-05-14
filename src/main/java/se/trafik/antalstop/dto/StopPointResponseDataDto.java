package se.trafik.antalstop.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class StopPointResponseDataDto {
    @JsonProperty("Version")
    private String version;

    @JsonProperty("Type")
    private String type;

    @JsonProperty("Result")
    private List<StopPointDto> result;

    public StopPointResponseDataDto() {
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

    public List<StopPointDto> getResult() {
        return result;
    }

    public void setResult(List<StopPointDto> result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "StopPointResponseDataDto{" +
                "version='" + version + '\'' +
                ", type='" + type + '\'' +
                ", result=" + result +
                '}';
    }
}
