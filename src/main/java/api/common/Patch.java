package api.common;

public class Patch {
    private String op;
    private String path;
    private String value;

    public String getOp() {
        return op;
    }

    public String getPath() {
        return path;
    }

    public String getValue() {
        return value;
    }


}
