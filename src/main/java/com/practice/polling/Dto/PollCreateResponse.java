package com.practice.polling.Dto;

import java.util.List;
import java.util.UUID;

public record PollCreateResponse(UUID pollId, String question, List<String> options) {
}
