import java.util.Random;

public class CarActivity {
    ResultRacing resultRacing = new ResultRacing();
    RacingCar[] cars;
    int count;

    public CarActivity(RacingCar[] cars, int count) {
        this.cars = cars;
        this.count = count;
    }

    public void carRacing(){
        for(int i=0;i<count;i++){
            setCarDistance();
            resultRacing.stateView(cars);
        }
    }

    public void setCarDistance(){
        int[] moveValue = carMoveValue();
        for(int i=0;i<cars.length;i++){
            countDistance(i, moveValue[i]);
        }
    }

    public void countDistance(int carNum,int move){
        if(move >= 4){
            cars[carNum].distance += 1;
        }
    }

    public int[] carMoveValue(){
        int[] moveValue = new int[cars.length];
        for(int i=0;i<cars.length;i++){
            moveValue[i] = randomValue();
        }
        return moveValue;
    }

    public int randomValue(){
        Random rand = new Random();
        return rand.nextInt(10);
    }
}