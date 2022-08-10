package com.arch2.dockerapi.controller;

import com.arch2.dockerapi.entity.MusicEntity;
import com.arch2.dockerapi.repo.MusicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/music")
public class MusicController {

    @Autowired
    private MusicRepository repository;

    @GetMapping()
    public List<MusicEntity> getMusics() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public MusicEntity getMusic(@PathVariable Long id) {
        return repository.findById(id).get();
    }

    @PostMapping("/save")
    public MusicEntity saveMusic(@RequestBody MusicEntity musicEntity) {
        return repository.save(musicEntity);
    }

}
