package com.systemplant.cake_web_system.pojo;

import com.systemplant.cake_web_system.Entity.Plant;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PlantPojo {
    private Integer id;

    @NotNull
    private String namep;

    @NotNull
    private String description;

    private Integer category;

    //    private MultipartFile image;
    @NotNull
    private String image;


    public PlantPojo(Plant plant){
        this.id=plant.getId();
        this.namep=plant.getNamep();
        this.description=getDescription();
        this.category=getCategory();
        this.image=getImage();

    }
}
