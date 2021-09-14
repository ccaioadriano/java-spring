package com.aulao.spring.projetospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aulao.spring.projetospring.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
