package com.example.pr2022.service;


import com.example.pr2022.model.Titul;

import java.util.List;

public interface TitulService {
    List<Titul> findAll();

    Titul findById(Integer id);

    Titul create(Titul resource);
}
