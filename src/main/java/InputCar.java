import java.util.Scanner;

public class InputCar {
    static InputCar inputCar = new InputCar();
    Scanner scan = new Scanner(System.in);
    RacingCar[] carStorage;
    int countStorage;

    public void inputMain(){
        RacingCar[] car = addCar();
        setCarStorage(car);
        int count = setCount();
        setCountStorage(count);
    }

    public String setCar(){
        String name;
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분.");
        name = scan.next();
        return name;
    }

    public String[] splitCarList(){
        String name = setCar();
        String[] names = name.split(",");
        namesVerify(names);
        return names;
    }

    public void namesVerify(String[] names) {
        for(int i=0;i< names.length;i++){
            length_5(names[i]);
        }
    }

    public void length_5(String name) {
        if(name.length() > 5){
            System.out.println("자동차 이름은 5글자가 넘지 않도록 입력해주세요.");
            System.out.println("시스템을 재시작 해주세요.");
            System.exit(0);
        }
    }

    public RacingCar[] addCar(){
        String[] names = inputCar.splitCarList();
        int distance = 0;
        RacingCar[] car = new RacingCar[names.length];
        for(int i=0;i<names.length;i++){
            car[i] = new RacingCar(names[i], distance);
        }
        return car;
    }

    public int setCount(){
        int count;
        System.out.println("시도할 회수는 몇회인가요?");
        count = scan.nextInt();
        return count;
    }

    public void setCarStorage(RacingCar[] car){
        carStorage = car;
    }
    public void setCountStorage(int count){
        countStorage = count;
    }
    public RacingCar[] getCarStorage(){
        return carStorage;
    }
    public int getCountStorage(){
        return countStorage;
    }
}