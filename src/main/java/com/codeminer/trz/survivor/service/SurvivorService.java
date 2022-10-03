package com.codeminer.trz.survivor.service;

import com.codeminer.trz.survivor.dto.SurvivorDTO;

import java.util.List;

public interface SurvivorService {
    SurvivorDTO insert(SurvivorDTO survivorDTO) throws Exception;

    SurvivorDTO update(SurvivorDTO survivorDTO) throws Exception;

    void delete(int id) throws Exception;

    List<SurvivorDTO> findAll() throws Exception;

    SurvivorDTO findById(int id) throws Exception;

}
