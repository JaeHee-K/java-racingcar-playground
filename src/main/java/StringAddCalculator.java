import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringAddCalculator {

    public void start(){
        String value = inputValue();
        valueVerify(value);
        int result = calculate(value);
        System.out.printf("결과 : " + result);
    }

    public int calculate(String value){
        if(check_Empty_Null(value))
            return 0;
        if(value.length() == 1)
            return Integer.parseInt(value);
        if(value.charAt(0) == '/' && value.charAt(1) == '/') {
            return customSum(value);
        }
        if(value.length() >= 2) {
            return splitSum(value, ",|:");
        }
        return 0;
    }

    private int customSum(String value) {
        Matcher m = Pattern.compile("//(.)//(.*)").matcher(value);
        if(m.find()){
            String customDelimiter = m.group(1);
            String[] values = m.group(2).split(customDelimiter);
            return splitSum_Custom(values);
        }
        return 0;
    }

    private int splitSum_Custom(String[] values) {
        int result = 0;
        for(int i=0;i<values.length;i++)
            result += Integer.parseInt(values[i]);
        return result;
    }

    private int splitSum(String value, String delimiter) {
        int result = 0;
        String[] values = value.split(delimiter);
        for(int i=0;i<values.length;i++) {
            result += Integer.parseInt(values[i]);
        }
        return result;
    }

    private boolean check_Empty_Null(String value) {
        if(value == null || value.isEmpty())
            return true;
        return false;
    }

    private String inputValue() {
        Scanner scan = new Scanner(System.in);
        System.out.print("값을 입력하세요 : ");
        String value = scan.next();
        return value;
    }

    public void valueVerify(String value) {
        if(value.charAt(0) == '/' && value.charAt(1) == '/') {
            custom_value(value);
        }
        if(value.length() >= 2) {
            default_value(value, ",|:");
        }
    }

    private void custom_value(String value) {
        Matcher m = Pattern.compile("//(.)//(.*)").matcher(value);
        if(m.find()){
            String customDelimiter = m.group(1);
            String[] values = m.group(2).split(customDelimiter);
            exceptJudge(values);
        }
    }

    private void default_value(String value, String delimiter) {
        String[] values = value.split(delimiter);
        for(int i=0;i<values.length;i++) {
            notAllowParameter(Integer.parseInt(values[i]));
        }
    }

    private void exceptJudge(String[] values) {
        for(int i=0;i< values.length;i++){
            notAllowParameter(Integer.parseInt(values[i]));
        }
    }

    private void notAllowParameter(int value) {
        if(value < 0 || value > 65535){
            System.out.println("양의 정수만 입력 가능합니다.");
            System.out.println("시스템을 재시작 해주세요.");
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        StringAddCalculator stringAddCalculator = new StringAddCalculator();
        stringAddCalculator.start();
    }
}
