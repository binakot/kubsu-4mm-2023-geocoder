package ru.kubsu.geocoder.repositry;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.kubsu.geocoder.model.Test;

import java.util.Optional;

/**
 *
 */
@Repository
public interface TestRepository extends CrudRepository<Test, Integer> {
    Optional<Test> findByName(String name);
}
