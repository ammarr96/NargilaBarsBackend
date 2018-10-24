package com.nargilabars.demo.services;

import com.nargilabars.demo.models.NargilaBar;
import com.nargilabars.demo.repositories.NargilaBarsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class NargilaBarService {

    @Autowired
    NargilaBarsRepository nargilaBarsRepository;

    public List<NargilaBar> getAllNargilaBars(){
        NargilaBar n = new NargilaBar();
        n.setId(Long.valueOf(2));
        //n.setName("Dibek1"); n.setAdress("GGGG"); n.setNumberOfGuests(Long.valueOf(3)); n.setRating(Long.valueOf(10));
        List<NargilaBar> bars = new ArrayList<>();
        bars.add(n);
        return (List<NargilaBar>) nargilaBarsRepository.findAll();
        //return bars;
    }

}
