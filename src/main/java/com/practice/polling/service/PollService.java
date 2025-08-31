package com.practice.polling.service;


import com.practice.polling.Dto.PollDto;
import com.practice.polling.entity.Poll;
import com.practice.polling.mapper.PollMapper;
import com.practice.polling.repository.PollRepository;
import org.springframework.stereotype.Service;

@Service
public class PollService {

    private final PollRepository pollRepository;
    private final PollMapper pollMapper;

    public PollService(PollRepository pollRepository, PollMapper pollMapper) {
        this.pollRepository = pollRepository;
        this.pollMapper = pollMapper;
    }

    public PollDto createPoll(PollDto pollDto) {
        Poll poll = pollMapper.toEntity(pollDto);

        Poll SavedPoll = pollRepository.save(poll);

        return pollMapper.toDto(SavedPoll);
    }
}
