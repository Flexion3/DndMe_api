package api.entities;


import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.Id;

public class DndClass {

    @Id
    private String id;

    private String url;
    private int index;
    private String name;
    private String info;

    @JsonProperty("hit_die")
    private int hitDie;

    @JsonProperty("saving_throws")
    private AbilityScores[] savingThrows;

    @JsonProperty("proficiencies")
    private Proficiency[] proficiencies;

    @JsonProperty(value = "proficiency_choices")
    private ProficiencyChoice[] proficiencyChoices;

    private Subclass[] subclasses;

    public String getUrl() {
        return url;
    }

    public String getId() {
        return id;
    }

    public int getIndex() {
        return index;
    }

    public int getHit_die() {
        return hitDie;
    }

    public String getName() {
        return name;
    }

    public String getInfo() {
        return info;
    }

    public AbilityScores[] getSavingThrows() {
        return savingThrows;
    }

    public Proficiency[] getProficiencies() {
        return proficiencies;
    }


    public ProficiencyChoice[] getProficiencyChoices() {
        return proficiencyChoices;
    }

    public Subclass[] getSubclasses() {
        return subclasses;
    }
}
