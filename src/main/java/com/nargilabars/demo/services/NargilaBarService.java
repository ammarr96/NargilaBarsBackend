package com.nargilabars.demo.services;

import com.nargilabars.demo.models.NargilaBar;
import com.nargilabars.demo.repositories.NargilaBarsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.nio.file.FileSystemNotFoundException;
import java.util.List;
import java.util.Optional;

@Service
public class NargilaBarService {

    @Autowired
    NargilaBarsRepository nargilaBarsRepository;

    public List<NargilaBar> getAllNargilaBars(){
        return (List<NargilaBar>) nargilaBarsRepository.findAll();
    }

    public NargilaBar getNargilaBarById(Long id) {
        return nargilaBarsRepository.findById(id).orElseThrow(() -> new FileSystemNotFoundException("User not found"));
    }

}
