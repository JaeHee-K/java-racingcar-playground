package feedback;

public class Car {
    public String name;
    private int distance = 0;

    public Car(String name){
        if(name.isBlank()){
            throw new IllegalArgumentException("자동차 이름을 입력해주세요.");
        }
        if(name.length() > 5 || name.length() < 1){
            throw new IllegalArgumentException("자동차 이름은 1~5 글자로 구성해야 합니다.");
        }
        this.name = name.trim();
    }

    public void movement(){
        RandomMove randomMove = new RandomMove();
        if(randomMove.moveCheck()){
            this.distance += 1;
        }
    }

    public String getName(){
        return name;
    }
    public int getDistance() {
        return distance;
    }
}
