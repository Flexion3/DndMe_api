package api.entities;

public class AbilityScores{
    private int index;
    private String url;
    private String name;
    private String full_name;

    public AbilityScores() {
    }

    public AbilityScores(int index, String url, String name, String full_name) {
        this.url = url;
        this.name = name;
    }

    public int getIndex() {
        return index;
    }

    public String getFull_name() {
        return full_name;
    }

    public String getUrl() {
        return url;
    }

    public String getName() {
        return name;
    }
}
