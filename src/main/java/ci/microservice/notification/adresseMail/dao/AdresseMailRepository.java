package ci.microservice.notification.adresseMail.dao;

import ci.microservice.notification.adresseMail.models.AdresseMail;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@Repository
public interface AdresseMailRepository extends MongoRepository<AdresseMail, String> {


}