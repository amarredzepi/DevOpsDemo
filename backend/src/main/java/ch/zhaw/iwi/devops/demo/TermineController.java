package ch.zhaw.iwi.devops.demo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin
@RestController
public class TermineController {

private Map<Integer, Termine> termine = new HashMap<Integer, Termine>();

@EventListener(ApplicationReadyEvent.class)
    public void init() {
        this.termine.put(1,new Termine(1, "Kundentermin UBS", "Kickoff Reporting Projekt", "28/03/2023", "28/03/2023"));
        this.termine.put(2,new Termine(2, "Teamsitzung", "Besprechung offener Punkte von letzte Woche", "29/03/2023", "29/03/2023"));
        this.termine.put(3,new Termine(3, "1:1 mit Chef", "Aktuelle Leistungen besprehen", "30/03/2023", "30/03/2023"));
        System.out.println("Init Data");
    }
    
    //Termine Abschnitt Start

    @GetMapping("/testtermine")
    public String test() {
        return "ToDo app is up and running!";
    }

    @GetMapping("/services/termineping")
    public String ping() {
        String languageCode = "de";
        return "{ \"status\": \"ok\", \"userId\": \"admin"+ "\", \"languageCode\": \"" + languageCode + "\",\"version\": \"0.0.1" + "\"}";
    }

    @GetMapping("/terminecount")
    public int count() {
        return this.termine.size();
    }

    @GetMapping("/services/termine")
    public List<PathListEntry<Integer>> termine() {
        var result = new ArrayList<PathListEntry<Integer>>();
        for (var termin : this.termine.values()) {
            var entry = new PathListEntry<Integer>();
            entry.setKey(termin.getId(), "termineKey");
            entry.setName(termin.getTitle());
            entry.getDetails().add(termin.getDescription());
            entry.getDetails().add(termin.getDatum_von());
            entry.getDetails().add(termin.getDatum_bis());
            entry.setTooltip(termin.getDescription());
            entry.setTooltip(termin.getDatum_von());
            entry.setTooltip(termin.getDatum_bis());
            result.add(entry);
        }
        return result;
    }

    @GetMapping("/services/termine/{id}")
    public Termine getTermine(@PathVariable Integer id) {
        return this.termine.get(id);
    }

    @PostMapping("/services/termine")
    public void createTermine(@RequestBody Termine termin) {
        var newId = this.termine.keySet().stream().max(Comparator.naturalOrder()).orElse(0) + 1;
        termin.setId(newId);
        this.termine.put(newId, termin);
    }
    @PutMapping("/services/termine/{id}")
    public void createTermine(@PathVariable Integer id, @RequestBody Termine termin) {
        termin.setId(id);
        this.termine.put(id, termin);
    }

    @DeleteMapping("/services/termine/{id}")
    public Termine deleteTermine(@PathVariable Integer id) {
        return this.termine.remove(id);
    }

}

    //Termine Abschnitt End