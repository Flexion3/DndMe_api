package api.services;

import api.entities.DndClass;
import api.repositories.DndClassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

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
    public List<DndClass> findAll() {
        return (List<DndClass>)dndClassRepository.findAll();
    }
}
