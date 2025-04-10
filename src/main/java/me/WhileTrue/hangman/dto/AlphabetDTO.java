package me.WhileTrue.hangman.dto;

import lombok.Data;

@Data
public class AlphabetDTO {
    private char alphabet;

    public char getAlphabet() {
        return alphabet;
    }
}
