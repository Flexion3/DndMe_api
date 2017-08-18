package api.services;

import api.entities.Counter;
import api.entities.DndClass;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

public class ReaderService {

    private static String DND5E_API = "http://dnd5eapi.co/api/";
    RestTemplate restTemplate = new RestTemplate();


    List<DndClass> getDndClasses (){
        List<DndClass> dndClasses = new ArrayList<>();
        Counter c = restTemplate.getForObject(DND5E_API + "classes", Counter.class);
        for (int i = 1; i <= c.getCount(); i++) {
            dndClasses.add(restTemplate.getForObject(DND5E_API + "classes/" + i, DndClass.class));
        }
        return dndClasses;
    }

}
