package com.nargilabars.demo.controllers;

import com.nargilabars.demo.models.NargilaBar;
import com.nargilabars.demo.services.NargilaBarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/nargilabars")
@CrossOrigin(origins = "http://localhost:4200")
public class NargilaBarController {
    @Autowired
    NargilaBarService nargilaBarService;

    @GetMapping("/all")
    public List<NargilaBar> getAll(){
        return nargilaBarService.getAllNargilaBars();
    }
}
