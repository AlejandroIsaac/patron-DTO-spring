package com.jaax.dto.service;

import com.jaax.dto.entity.Local;
import com.jaax.dto.repository.LocalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LocalServiceImpl implements LocalService{
    @Autowired
    LocalRepository localRepository;

    @Override
    public Local create(Local local) {
        return localRepository.save(local);
    }

    @Override
    public List<Local> getAll() {
        return localRepository.findAll();
    }
}
