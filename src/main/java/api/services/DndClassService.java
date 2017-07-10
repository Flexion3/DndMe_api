package api.services;


import api.entities.DndClass;

import java.util.List;

public interface DndClassService {
    DndClass create(DndClass dndClass);

    void delete(String id);

    List<DndClass> findAll();
}
