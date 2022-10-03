package com.codeminer.trz.survivor.repository;

import com.codeminer.trz.survivor.dto.SurvivorDTO;
import com.codeminer.trz.util.UtilRepository;

import java.sql.*;

public class SurvivorRepository {

    public SurvivorDTO insert(SurvivorDTO survivorDTO) throws Exception {
        String query = "INSERT INTO survivor (name, age) VALUES (?, ?)";

        PreparedStatement prest = UtilRepository.getPreparedStatement(query);
        prest.setString(1, survivorDTO.getName());
        prest.setInt(2, survivorDTO.getAge());

        survivorDTO.setId(UtilRepository.insert(prest));

        return survivorDTO;
    }
}
