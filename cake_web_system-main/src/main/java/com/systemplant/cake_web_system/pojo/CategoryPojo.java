package com.systemplant.cake_web_system.pojo;

import com.systemplant.cake_web_system.Entity.Category;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CategoryPojo {
    private Integer id;

    @NotNull
    private String name;

    @NotNull
    private String image;

    public CategoryPojo(Category category){
        this.id=category.getId();
        this.name=category.getName();
        this.image=getImage();
    }
}
