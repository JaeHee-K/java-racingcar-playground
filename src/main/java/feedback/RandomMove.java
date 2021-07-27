package feedback;

import java.util.Random;

public class RandomMove {
    public boolean moveCheck(){
        return getRandomNumber() >= 4;
    }

    private int getRandomNumber() {
        Random rand = new Random();
        return rand.nextInt(10);
    }
}
