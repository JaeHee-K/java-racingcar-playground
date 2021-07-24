import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Judgement {
    public List<String> refereeRacing(RacingCar[] cars){
        List<Integer> winner = new ArrayList<>();
        List<String> winnerList;
        for(int i=0;i<cars.length;i++){
            winner.add(cars[i].distance);
        }
        winnerList = findWinner(cars, winner);
        return winnerList;
    }

    private List<String> findWinner(RacingCar[] cars, List<Integer> winner) {
        List<String> winnerList = new ArrayList<String>();
        int win = Collections.max(winner);
        for(int i=0;i<cars.length;i++){
            winnerList = addWinner(cars, winnerList, win, i);
        }
        return winnerList;
    }

    private List<String> addWinner(RacingCar[] cars, List<String> winnerList , int win, int carNum) {
        if(cars[carNum].distance == win)
            winnerList.add(cars[carNum].name);
        return winnerList;
    }
}
