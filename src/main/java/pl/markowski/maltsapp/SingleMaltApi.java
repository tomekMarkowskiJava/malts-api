package pl.markowski.maltsapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class SingleMaltApi {

    private List<SingleMalt> singleMalts;

    public SingleMaltApi() {
        singleMalts = new ArrayList<>();
        singleMalts.add(new SingleMalt(1, "Ardbeg", 10));
        singleMalts.add(new SingleMalt(2, "Glenmorangie Lasanta", 12));
        singleMalts.add(new SingleMalt(3, "Singleton", 16));

    }

    @GetMapping
    public List<SingleMalt> getAll() {
        return singleMalts;
    }
}
