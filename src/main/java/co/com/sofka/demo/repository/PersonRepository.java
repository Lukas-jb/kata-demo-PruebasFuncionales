package co.com.sofka.demo.repository;

import co.com.sofka.demo.modelo.Person;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Mono;

public interface PersonRepository extends ReactiveMongoRepository<Person,String> {

    Mono<Person> findByName(String name);

}
