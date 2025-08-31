package com.practice.polling.service;


import com.practice.polling.Dto.PollCreateRequest;
import com.practice.polling.Dto.PollCreateResponse;
import com.practice.polling.entity.Poll;
import com.practice.polling.mapper.PollMapper;
import com.practice.polling.repository.PollRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class PollService {

    private final PollRepository pollRepository;
    private final PollMapper pollMapper;

    public PollService(PollRepository pollRepository, PollMapper pollMapper) {
        this.pollRepository = pollRepository;
        this.pollMapper = pollMapper;
    }

    public PollCreateResponse createPoll(PollCreateRequest pollDto) {
        Poll poll = pollMapper.toEntity(pollDto);

        poll.setPollId(UUID.randomUUID());

        Poll SavedPoll = pollRepository.save(poll);

        return pollMapper.toPollResponse(SavedPoll);
    }
}
