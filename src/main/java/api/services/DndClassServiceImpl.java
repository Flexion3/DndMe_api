package api.services;

import api.entities.DndClass;
import api.repositories.DndClassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Map;

@Service
public class DndClassServiceImpl implements DndClassService {

    @Autowired
    DndClassRepository dndClassRepository;

    @Override
    public DndClass create(DndClass dndClass) {
        return dndClassRepository.save(dndClass);
    }

    @Override
    public void delete(String id) {
        dndClassRepository.delete(id);
    }

    @Override
    public void deleteAll() {
        dndClassRepository.deleteAll();
    }

    @Override
    public DndClass find(int index) {
        return dndClassRepository.findByIndex(index);
    }

    @Override
    public List<DndClass> findAll() {
        return (List<DndClass>)dndClassRepository.findAll();
    }

    @Override
    public DndClass patch(int index, Map<String, Object> dndPatch) {
        return null;
    }
}
