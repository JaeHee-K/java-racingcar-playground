package feedback;

import java.util.Scanner;

public class InputCar {
    Scanner scan = new Scanner(System.in);
    private static Car[] cars;
    private static int count;

    public void Begin(){
        setCars();
        setCount();
    }

    private void setCars(){
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분)");
        String names = scan.nextLine();
        arrangeCars(splitCars(names));
    }

    private void arrangeCars(String[] splitCars) {
        cars = new Car[splitCars.length];
        for(int i=0;i<splitCars.length;i++){
            cars[i] = new Car(splitCars[i]);
        }
    }

    private String[] splitCars(String names) {
        return names.split(",");
    }

    private void setCount() {
        System.out.println("시도할 회수는 몇회인가요?");
        count = scan.nextInt();
    }

    public Car[] getCars(){
        return cars;
    }
    public int getCount(){
        return count;
    }
}
