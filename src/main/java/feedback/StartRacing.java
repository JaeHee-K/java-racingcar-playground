package feedback;

public class StartRacing {
    InputCar inputCar = new InputCar();
    ViewStatus viewStatus = new ViewStatus();
    Car[] cars = inputCar.getCars();
    int count = inputCar.getCount();

    public void start(){
        for(int i=0;i<count;i++){
            move();
            carStatus(cars);
        }
    }

    private void move() {
        for(int i=0;i<cars.length;i++){
            cars[i].movement();
        }
    }

    private void carStatus(Car[] cars) {
        viewStatus.carsStatus(cars);
    }
}
