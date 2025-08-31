package com.practice.polling.Dto;

import java.util.List;

public record PollCreateRequest(String question, List<String> options) {
}
