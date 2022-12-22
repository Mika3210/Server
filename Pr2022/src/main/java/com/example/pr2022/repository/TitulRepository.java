package com.example.pr2022.repository;


import com.example.pr2022.model.Titul;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TitulRepository extends JpaRepository<Titul, Integer> {
    Titul findTitulByNameTitul(String name);
}
