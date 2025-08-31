package com.practice.polling.mapper;

import com.practice.polling.Dto.PollCreateRequest;
import com.practice.polling.Dto.PollCreateResponse;
import com.practice.polling.entity.Poll;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PollMapper {
    PollCreateRequest toDto(Poll poll);

    Poll toEntity(PollCreateRequest pollCreateRequest);

    PollCreateResponse toPollResponse(Poll poll);
}
