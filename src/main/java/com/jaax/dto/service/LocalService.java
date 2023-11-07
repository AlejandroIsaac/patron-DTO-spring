package com.jaax.dto.service;

import com.jaax.dto.entity.Local;

import java.util.List;

public interface LocalService {


    Local create(Local local);
    List<Local> getAll();
}
