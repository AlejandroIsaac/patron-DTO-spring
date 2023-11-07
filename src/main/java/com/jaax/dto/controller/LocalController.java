package com.jaax.dto.controller;

import com.jaax.dto.entity.Local;
import com.jaax.dto.service.LocalServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("/api/local")
public class LocalController {
    @Autowired
    LocalServiceImpl localService;

    @PostMapping
    Local create(@RequestBody Local local){
        return localService.create(local);
    }

    @GetMapping
    List<Local> getAll(){
        return localService.getAll();
    }
}
