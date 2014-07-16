package ca.bcit.comp2613.battleships.repository;

import org.springframework.data.repository.CrudRepository;

import ca.bcit.comp2613.battleships.model.Ship; 

public interface ShipRepository extends CrudRepository<Ship, String>{

}
