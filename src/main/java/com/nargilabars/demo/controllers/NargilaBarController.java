package com.nargilabars.demo.controllers;

import com.nargilabars.demo.models.NargilaBar;
import com.nargilabars.demo.services.NargilaBarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

//spring.datasource.url=jdbc:mysql://sql7.freemysqlhosting.net:3306/sql7262635
//spring.datasource.username=sql7262635
//spring.datasource.password=nB9WNB2rmD

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

    @PostMapping(value="/insertNargilaBar")
    public String createAdmin(@Valid @RequestBody final NargilaBar nb) {
        return nargilaBarService.createNargilaBar(nb);
    }

}
