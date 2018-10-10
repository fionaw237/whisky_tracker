package com.codeclan.example.WhiskyTracker.controllers;

import com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository.WhiskyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/whiskies")
public class WhiskyController {
    @Autowired
    WhiskyRepository whiskyRepository;

}
