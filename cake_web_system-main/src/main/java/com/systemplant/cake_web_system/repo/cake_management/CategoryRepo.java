package com.systemplant.cake_web_system.repo.cake_management;

import com.systemplant.cake_web_system.Entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepo  extends JpaRepository<Category,Integer> {


}
