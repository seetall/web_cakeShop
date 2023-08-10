package com.systemplant.cake_web_system.repo.cake_management;

import com.systemplant.cake_web_system.Entity.Plant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlantRepo extends JpaRepository<Plant, Integer> {
//    Plant findById(long id);
//    Plant findByName(String name);
//    List<Plant> findAllByOrderByIdAsc();
//    List<Plant> findAllByCategoryId(long categoryId);

}
