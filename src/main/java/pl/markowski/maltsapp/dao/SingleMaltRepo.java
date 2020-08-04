package pl.markowski.maltsapp.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.markowski.maltsapp.dao.entity.SingleMalt;

@Repository
public interface SingleMaltRepo extends CrudRepository<SingleMalt, Integer> {
}
