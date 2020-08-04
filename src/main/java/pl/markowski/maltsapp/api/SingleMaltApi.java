package pl.markowski.maltsapp.api;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pl.markowski.maltsapp.dao.entity.SingleMalt;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/malts")
public class SingleMaltApi {

    private List<SingleMalt> singleMaltsList;

    public SingleMaltApi() {
        singleMaltsList = new ArrayList<>();
        singleMaltsList.add(new SingleMalt(1, "Ardbeg", 10));
        singleMaltsList.add(new SingleMalt(2, "Glenmorangie Lasanta", 12));
        singleMaltsList.add(new SingleMalt(3, "Singleton", 18));

    }

    @GetMapping("/all")
    public List<SingleMalt> getAll() {
        return singleMaltsList;
    }

    @GetMapping()
    public SingleMalt getById(@RequestParam int index) {
        Optional<SingleMalt> first = singleMaltsList.stream().
                filter(element -> element.getId() == index).findFirst();
        return first.get();

    }

    @PostMapping
    public boolean addMalt(@RequestBody SingleMalt singleMalt){
        return singleMaltsList.add(singleMalt);
    }

    @PutMapping
    public boolean updateMalt(@RequestBody SingleMalt singleMalt){
        return singleMaltsList.add(singleMalt);
    }

    @DeleteMapping
    public boolean deleteMalt(@RequestParam int index){
        return singleMaltsList.removeIf(element -> element.getId() == index);
    }
}
