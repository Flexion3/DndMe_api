package api.entities;

public class Result{
    private String name;
    private String url;

    public Result() {
    }

    public Result(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }
}
