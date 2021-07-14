package com.example.countdaysapi.controller;

import com.example.countdaysapi.model.Church;
import com.example.countdaysapi.repository.ChurchRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController

public class ChurchController {

    private final ChurchRepository churchRepository;


    @GetMapping("/church")
    public ResponseEntity<List<Church>> getAllChurch(){
        return ResponseEntity.ok(churchRepository.findAll());
    }

    @PostMapping("/church")
    public ResponseEntity<Church> createNewChurch(@RequestBody Church newChurch){
        return new ResponseEntity<>(saveChurch(newChurch), HttpStatus.CREATED);
    }

    private Church saveChurch(Church church){
        Church newChurch = new Church(
            church.getChurchName(),
                church.getCity(),
                church.getPriestName(),
                church.getPriestLastName(),
                church.getPriestSecondLastName(),
                church.getPass(),
                church.getOrdinationDay()
        );
        return churchRepository.save(newChurch);
    }
}
