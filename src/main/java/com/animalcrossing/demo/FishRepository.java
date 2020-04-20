package com.animalcrossing.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface FishRepository extends JpaRepository<Fish, Long> {
}
