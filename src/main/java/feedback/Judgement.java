package feedback;

import java.util.ArrayList;
import java.util.List;

public class Judgement {
    InputCar inputCar = new InputCar();
    Car[] cars = inputCar.getCars();
    List<Car> winners = new ArrayList<>();

    public List<Car> findWinners(){
        int winDistance = findMaxDistance();
        for(int i=0;i< cars.length;i++){
            judgeWinner(cars[i], winDistance);
        }
        return winners;
    }

    private int findMaxDistance(){
        int distance = 0;
        for(int i=0;i<cars.length;i++){
            distance = judgeMax(distance, cars[i].getDistance());
        }
        return distance;
    }

    private int judgeMax(int distance, int compare) {
        if(distance < compare){
            return compare;
        }
        return distance;
    }

    private void judgeWinner(Car car, int winDistance) {
        if(car.getDistance() == winDistance){
            winners.add(car);
        }
    }
}
