package me.WhileTrue.hangman.controller;

import lombok.RequiredArgsConstructor;
import me.WhileTrue.hangman.domain.Game;
import me.WhileTrue.hangman.dto.AlphabetDTO;
import me.WhileTrue.hangman.dto.DifficultyDTO;
import me.WhileTrue.hangman.repository.WordService;
import me.WhileTrue.hangman.service.GameService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class HangController {

    private final GameService gameService;
    private final WordService wordService;

    @PostMapping("/start")
    public void startGame(@RequestBody DifficultyDTO difficulty){
        int level = difficulty.getDifficulty(); //DTO로 레벨 처리
        String word = wordService.getRandomWord(level); //받은 레벨로 랜덤 단어 선택
        Game game = new Game();      //Game 인스턴스 생성
        gameService.setGame(game);
        game.setAnswer(word);
        gameService.startGame(game.getAnswer());
    }

    @PostMapping("/start/input")
    public boolean inputWord(@RequestBody AlphabetDTO alphabet){
        char alpha = alphabet.getAlphabet();
        gameService.checkAnswer(alpha);
        return false;
    }
}
