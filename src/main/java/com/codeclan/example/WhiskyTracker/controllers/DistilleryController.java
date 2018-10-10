package com.codeclan.example.WhiskyTracker.controllers;

import com.codeclan.example.WhiskyTracker.repositories.DistilleryRepository.DistilleryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/distilleries")
public class DistilleryController {
    @Autowired
    DistilleryRepository distilleryRepository;

}
