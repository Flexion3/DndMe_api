package api.dndclass;


import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

public interface DndClassService {
    DndClass create(DndClass dndClass);

    void delete(String id);

    List<DndClass> findAll();
}
