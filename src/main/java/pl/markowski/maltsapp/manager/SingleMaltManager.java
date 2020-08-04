package pl.markowski.maltsapp.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;
import pl.markowski.maltsapp.dao.SingleMaltRepo;
import pl.markowski.maltsapp.dao.entity.SingleMalt;

import java.util.Optional;

@Service
public class SingleMaltManager {

    private SingleMaltRepo singleMaltRepo;

    @Autowired
    public SingleMaltManager(SingleMaltRepo singleMaltRepo) {
        this.singleMaltRepo = singleMaltRepo;
    }

    public Optional<SingleMalt> findById(Integer id){
        return singleMaltRepo.findById(id);
    }

    public Iterable<SingleMalt> findAll(){
        return singleMaltRepo.findAll();
    }

    public SingleMalt save(SingleMalt singleMalt){
        return singleMaltRepo.save(singleMalt);
    }

    public void deleteById(Integer id){
        singleMaltRepo.deleteById(id);
    }


}
