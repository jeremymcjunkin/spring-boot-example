package hello;

import org.springframework.data.repository.CrudRepository;

import hello.Teams;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface TeamsRepository extends CrudRepository<Teams, Integer> {

}