package api.controllers;

import api.entities.Counter;
import api.entities.DndClass;
import api.services.DndClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
public class DndClassReaderController {


    @Autowired
    DndClassService dndClassService;

    @GetMapping("/import/classes")
    public ResponseEntity<Object> getAllDndClasses(){
        String api = "http://dnd5eapi.co/api/";
        RestTemplate restTemplate = new RestTemplate();
        List<DndClass> dndClasses = new ArrayList<>();
        Counter c = restTemplate.getForObject(api + "classes", Counter.class);
        for (int i = 1; i <= c.getCount(); i++) {
            dndClasses.add(restTemplate.getForObject(api + "classes/" + i, DndClass.class));
        }
        dndClassService.deleteAll();
        dndClasses.forEach(dndClass -> dndClassService.create(dndClass));
        return new ResponseEntity<>(dndClassService.findAll(), HttpStatus.OK);
    }




}
