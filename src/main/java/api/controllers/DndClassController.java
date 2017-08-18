package api.controllers;

import api.entities.DndClass;
import api.services.DndClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.sound.midi.Patch;
import java.util.Map;

@RestController
@CrossOrigin
public class DndClassController {


    @Autowired
    private DndClassService dndClassService;

    @GetMapping("/classes")
    public ResponseEntity<Object> getAllDndClasses(){
        return new ResponseEntity<>(dndClassService.findAll(), HttpStatus.OK);
    }

    @PatchMapping("/classes/{index}")
    public ResponseEntity<Object> patchDndClass(@PathVariable int index, @RequestBody Map<String, Object> patch){
        dndClassService.patch(index, patch);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping("/classes")
    public ResponseEntity<Object> insertDndClasses(@RequestBody DndClass inputDndClass){
        return new ResponseEntity<>(dndClassService.create(inputDndClass), HttpStatus.CREATED);
    }

    @DeleteMapping("/classes/{id}")
    public ResponseEntity<Object> deleteDndClass(@PathVariable String id){
        dndClassService.delete(id);
        return new ResponseEntity<>(HttpStatus.GONE);
    }
}
