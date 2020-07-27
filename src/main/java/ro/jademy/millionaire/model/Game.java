package ro.jademy.millionaire.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Game {

    private static final List<Level> LEVELS = Arrays.asList(
            new Level(1, 0, 100, 0),
            new Level(2, 0, 200, 0),
            new Level(3, 0, 500, 0),
            new Level(4, 0 , 700, 0),
            new Level(5, 0, 1000, 0),
            new Level(6, 1, 2000, 1000),
            new Level(7, 1, 4000, 1000),
            new Level(8, 1, 8000, 1000),
            new Level(9, 1, 16000, 1000),
            new Level(10, 1, 32000, 1000),
            new Level(11, 2, 64000, 32000),
            new Level(12, 2, 125000, 32000),
            new Level(13, 2, 250000, 32000),
            new Level(14, 2, 50000, 32000),
            new Level(15, 3, 1000000, 500000)
    );

    // 15 questions
    // 4 break points
    //      - > level [1, 5]    -> difficulty 0
    //      - > level [6, 10]   -> difficulty 1
    //      - > level [11, 14]  -> difficulty 2
    //      - > level 15        -> difficulty 3

    private List<Question> difficultyZeroQuestions = new ArrayList<>();
    private List<Question> difficultyOneQuestions = new ArrayList<>();
    private List<Question> difficultyTwoQuestions = new ArrayList<>();
    private List<Question> difficultyThreeQuestions = new ArrayList<>();

    private List<Lifeline> lifelines = new ArrayList<>();
    private Level currentLevel = LEVELS.get(0);

    public Game(List<Question> difficultyZeroQuestions, List<Question> difficultyOneQuestions, List<Question> difficultyTwoQuestions, List<Question> difficultyThreeQuestions) {
        this.difficultyZeroQuestions = difficultyZeroQuestions;
        this.difficultyOneQuestions = difficultyOneQuestions;
        this.difficultyTwoQuestions = difficultyTwoQuestions;
        this.difficultyThreeQuestions = difficultyThreeQuestions;

        lifelines.add(new Lifeline("50-50"));
        lifelines.add(new Lifeline("50-50"));
        lifelines.add(new Lifeline("50-50"));
    }

    public void start() {
        // show welcome screen
        // optionally: show rules (rounds, lifelines etc) & commands

        // show current level question
        // read command from player
        //  - if lifeline -> apply lifeline
        //  - if end game -> end game
        //  - read answer -> check answer
        //      - if answer correct -> go to next level (set next level as current, set amount of money etc)
        //      - if answer incorrect -> end game (calculate end sum, show bye bye message etc)


        showWelcome();
        showRules();
    }

    private void showWelcome() {
    }

    private void showRules() {

    }
}
