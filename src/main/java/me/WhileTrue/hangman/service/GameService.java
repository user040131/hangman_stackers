package me.WhileTrue.hangman.service;

import lombok.Getter;
import lombok.Setter;
import me.WhileTrue.hangman.domain.Game;
import me.WhileTrue.hangman.repository.WordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.ArrayList;
import java.util.List;
@Getter
@Setter
@Service
public class GameService {

    private Game game;

    public void setGame(Game game){
        this.game = game;
    }
    public void startGame(String answer) {
        if(game.getLife() == 0){
            game.setGameOver(true);
        }
    }
    public void checkAnswer(char input){
        boolean isCorrect = false;

        for(int i = 0; i < game.getAnswerCharArray().length; i++){
            if(game.getAnswerCharArray()[i] == input){
                game.getTryCharArray()[i] = input;
                isCorrect = true;
            }
        }

        if(!isCorrect){
            game.setLife(game.getLife() - 1);
        }
        if(game.getLife()==0){
            game.setGameOver(true);
        }
    }

}
