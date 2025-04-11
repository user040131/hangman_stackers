package me.WhileTrue.hangman.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class AnswerDTO {
    private String answer;
    private String topic;
}
