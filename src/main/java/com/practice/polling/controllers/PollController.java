package com.practice.polling.controllers;

import com.practice.polling.Dto.PollCreateRequest;
import com.practice.polling.Dto.PollCreateResponse;
import com.practice.polling.service.PollService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/polls")
public class PollController {

    public final PollService pollService;

    public PollController(PollService pollService) {
        this.pollService = pollService;
    }

    @PostMapping
    public ResponseEntity<PollCreateResponse> createPoll(@RequestBody PollCreateRequest poll) {
        PollCreateResponse pollResponse = pollService.createPoll(poll);
        return new ResponseEntity<>(pollResponse, HttpStatus.CREATED);
    }

}
