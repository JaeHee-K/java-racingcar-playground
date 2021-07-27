package feedback;

import java.util.List;

public class ViewStatus {

    public void carsStatus(Car[] cars){
        System.out.println("---------------");
        for(int i=0;i< cars.length;i++){
            System.out.println(nameCheck(cars[i]) + " : " + distanceCheck(cars[i].getDistance()));
        }
    }

    private String nameCheck(Car car){
        return car.getName();
    }

    private String distanceCheck(int distance){
        String row ="";
        for(int i=0;i<distance;i++){
            row += "-";
        }
        return row;
    }

    public void winnerView(List<Car> cars){
        System.out.print("승리자 : ");
        for(int i=0;i<cars.size();i++){
            System.out.print(cars.get(i).getName());
        }
    }
}
