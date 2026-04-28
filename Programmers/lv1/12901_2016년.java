import java.time.LocalDate;

class Solution {
    public String solution(int a, int b) {
        String answer = "";
        LocalDate lt = LocalDate.of(2016,a,b);
        answer = lt.getDayOfWeek().toString();
        if(answer == "MONDAY") {
            return "MON";
        } else if(answer == "TUESDAY") {
            return "TUE";
        } else if(answer == "WEDNESDAY") {
            return "WED";
        } else if(answer == "THURSDAY") {
            return "THU";
        } else if(answer == "FRIDAY") {
            return "FRI";
        } else if(answer == "SATURDAY") {
            return "SAT";
        } else if(answer == "SUNDAY") {
            return "SUN";
        }
        return answer;
    }
}
