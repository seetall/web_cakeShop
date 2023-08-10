package com.systemplant.cake_web_system.service;


import com.systemplant.cake_web_system.Entity.Plant;
import com.systemplant.cake_web_system.pojo.PlantPojo;

import java.io.IOException;
import java.util.List;

public interface PlantService {
    List<Plant> fetchAll();

    String savePlant (PlantPojo plantPojo) throws IOException;

    Plant fetchById(Integer id);

    void deleteById(Integer id);

    List<Plant> getAllPlant();
}
