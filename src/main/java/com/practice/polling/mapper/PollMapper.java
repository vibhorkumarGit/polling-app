package com.practice.polling.mapper;

import com.practice.polling.Dto.PollDto;
import com.practice.polling.entity.Poll;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PollMapper {
    PollDto toDto(Poll poll);

    Poll toEntity(PollDto pollDto);
}
