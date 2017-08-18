package api.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StartingEquipment {
    private String url;

    @JsonProperty("class")
    private String dndClass;

    public String getUrl() {
        return url;
    }

    public String getDndClass() {
        return dndClass;
    }
}
