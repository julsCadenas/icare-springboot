package icare.repository;

import icare.model.deptModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface deptRepo extends MongoRepository<deptModel, String> {
       
}
