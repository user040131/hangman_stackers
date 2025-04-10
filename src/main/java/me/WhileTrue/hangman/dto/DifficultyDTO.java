package me.WhileTrue.hangman.dto;

import lombok.Data;

@Data
public class DifficultyDTO {
    private int difficulty;

    public int getDifficulty() {
        return difficulty;
    }
}
