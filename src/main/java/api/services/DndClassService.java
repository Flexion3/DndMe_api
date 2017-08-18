package api.services;


import api.entities.DndClass;

import java.util.List;
import java.util.Map;

public interface DndClassService {
    DndClass create(DndClass dndClass);

    void delete(String id);

    void deleteAll();

    DndClass find(int index);

    List<DndClass> findAll();

    DndClass patch(int index, Map<String, Object> dndPatch);
}
