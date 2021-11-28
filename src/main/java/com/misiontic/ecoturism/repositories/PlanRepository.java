package com.misiontic.ecoturism.repositories;

import com.misiontic.ecoturism.models.Plan;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PlanRepository extends MongoRepository<Plan, String> {
}
