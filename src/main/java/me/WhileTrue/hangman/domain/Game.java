package me.WhileTrue.hangman.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class Game {
    List<Character> rightAlphabet = new ArrayList<>();
    List<Character> wrongAlphabet = new ArrayList<>();
    String answer;
    char[] answerCharArray;
    char[] tryCharArray;

    boolean gameOver = false;
    int life = 5; //목숨이 몇 개였더라

    public void setAnswer(String answer){
        this.answer = answer;
        this.answerCharArray = answer.toCharArray();
        this.tryCharArray = new char[answerCharArray.length];
        this.life = 5;
        this.gameOver = false;
    }
}
