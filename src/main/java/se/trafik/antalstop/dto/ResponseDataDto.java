package se.trafik.antalstop.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ResponseDataDto <T>{
    @JsonProperty("Version")
    private String version;

    @JsonProperty("Type")
    private String type;

    @JsonProperty("Result")
    private List<T> result;

    public ResponseDataDto() {
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

    public List<T> getResult() {
        return result;
    }

    public void setResult(List<T> result) {
        this.result = result;
    }
}
