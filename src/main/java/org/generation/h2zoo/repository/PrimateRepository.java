package org.generation.h2zoo.repository;

import org.generation.h2zoo.model.Primate;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrimateRepository extends CrudRepository<Primate, Long> {
}
