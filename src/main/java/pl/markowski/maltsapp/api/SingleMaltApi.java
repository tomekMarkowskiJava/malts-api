package pl.markowski.maltsapp.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pl.markowski.maltsapp.dao.entity.SingleMalt;
import pl.markowski.maltsapp.manager.SingleMaltManager;

import java.util.Optional;

@RestController
@RequestMapping("/api/malts")
public class SingleMaltApi {

    private SingleMaltManager singleMaltManager;

    public SingleMaltApi(SingleMaltManager singleMaltManager) {
        this.singleMaltManager = singleMaltManager;
    }

    @Autowired


    @GetMapping("/all")
    public Iterable<SingleMalt> getAll() {
        return singleMaltManager.findAll();
    }

    @GetMapping()
    public Optional<SingleMalt> getById(@RequestParam Integer index) {
        return singleMaltManager.findById(index);

    }

    @PostMapping
    public SingleMalt addMalt(@RequestBody SingleMalt singleMalt){
        return singleMaltManager.save(singleMalt);
    }

    @PutMapping
    public SingleMalt updateMalt(@RequestBody SingleMalt singleMalt){
        return singleMaltManager.save(singleMalt);
    }

    @DeleteMapping
    public void deleteMalt(@RequestParam Integer index){
        singleMaltManager.deleteById(index);
    }
}
