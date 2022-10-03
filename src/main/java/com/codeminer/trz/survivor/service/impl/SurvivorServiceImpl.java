package com.codeminer.trz.survivor.service.impl;

import com.codeminer.trz.survivor.dto.SurvivorDTO;
import com.codeminer.trz.survivor.repository.SurvivorRepository;
import com.codeminer.trz.survivor.service.SurvivorService;

import java.util.List;

public class SurvivorServiceImpl implements SurvivorService {

    private SurvivorRepository survivorRepository;

    public SurvivorServiceImpl() {
        if (survivorRepository == null) {
            survivorRepository = new SurvivorRepository();
        }
    }

    @Override
    public SurvivorDTO insert(SurvivorDTO survivorDTO) throws Exception {
        return survivorRepository.insert(survivorDTO);
    }

    @Override
    public SurvivorDTO update(SurvivorDTO survivorDTO) {
        return null;
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public List<SurvivorDTO> findAll() {
        return null;
    }

    @Override
    public SurvivorDTO findById(int id) {
        return null;
    }
}
