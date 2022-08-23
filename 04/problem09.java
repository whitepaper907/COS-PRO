import java.util.*;

class Main {
    public String solution(int hour, int minute) {
        String answer = "";
			  double ahour = (double)(30*hour) + minute*0.5; // 시간 각도
			  double aminute = (double)minute * (1/6.0); // 분 각도
			  
			  double ans = (ahour > aminute)? ahour - aminute : aminute - ahour; 
			  answer = String.format("%.1f",ans);
        return answer;
    }

public static void main(String[] args) {
        Main sol = new Main();
        int hour = 3;
        int minute = 0;
        String ret = sol.solution(hour, minute);
  
        System.out.println("solution 메소드의 반환 값은 \"" + ret + "\" 입니다.");
    }
}
