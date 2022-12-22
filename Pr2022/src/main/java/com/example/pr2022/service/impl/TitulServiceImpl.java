package com.example.pr2022.service.impl;

import com.example.pr2022.model.Titul;
import com.example.pr2022.repository.TitulRepository;
import com.example.pr2022.service.TitulService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TitulServiceImpl implements TitulService {

    private final TitulRepository repository;

    @Autowired
    public TitulServiceImpl(TitulRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Titul> findAll() {
        List<Titul> Tituls = repository.findAll();
        return repository.findAll();
    }

    @Override
    public Titul findById(Integer id) {
        return repository.findById(id).get();
    }

    @Override
    public Titul create(Titul resource) {
        return repository.saveAndFlush(resource);
    }
}
