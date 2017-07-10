package api.entities;


import org.springframework.data.annotation.Id;

public class DndClass {

    @Id
    private String id;
    private String name;
    private String info;

    public DndClass() {
    }

    public DndClass(String id, String name, String info) {
        this.id = id;
        this.name = name;
        this.info = info;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getInfo() {
        return info;
    }
}