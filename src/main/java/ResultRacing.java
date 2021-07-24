import java.util.List;

public class ResultRacing {
    boolean review = true;

    public void stateView(RacingCar[] cars){
        reviewStart(review);
        for(int i=0;i< cars.length;i++){
            System.out.println(cars[i].name + " : " + distanceConvert(cars[i].distance));
        }
        System.out.println("--------------------");
    }

    private void reviewStart(boolean review) {
        if(review == true)
            System.out.println("실행 결과");
        this.review = false;
    }

    public String distanceConvert(int distance){
        String convertDistance = "";
        for(int i=0;i<distance;i++){
            convertDistance += "-";
        }
        return convertDistance;
    }

    public void ResultRacing(RacingCar[] cars){
        Judgement judgement = new Judgement();
        List<String> winnerList;

        winnerList = judgement.refereeRacing(cars);
        System.out.println(winnerList + "가 최종 우승했습니다.");
    }
}
