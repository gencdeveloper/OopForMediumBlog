package Abstract;

public class MainTest {

    public static void main(String[] args) {

        BaseScoreCalculator baseScoreCalculator = new MenScoreCalculator();//abstract olugu icin base i cagiramiyoruz.
        baseScoreCalculator.scoreCalculate();
        baseScoreCalculator.gameOver();


        BaseScoreCalculator  scoreCalculator = new WomenScoreCalculator();
        scoreCalculator.scoreCalculate();
        scoreCalculator.gameOver();

        BaseScoreCalculator forChildCalculator = new ChildScoreCalculator();
        forChildCalculator.scoreCalculate();
        forChildCalculator.gameOver();



    }

}
