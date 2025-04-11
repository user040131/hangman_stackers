package me.WhileTrue.hangman.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CheckResultDTO {
    private boolean gameOver;
    private boolean isCorrect;
}
