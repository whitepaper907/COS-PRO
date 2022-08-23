import java.util.*;

class Main {
    public int solution(int a, int b) {
        int answer = 0;
			  //소수의 제곱수 저장
			  ArrayList<Integer> prime = new ArrayList<>();
			  ArrayList<Integer> pp = new ArrayList<>(); // 
			  ArrayList<Integer> ppp = new ArrayList<>(); //세제곱
			  for(int i = 2; i*i<1000000000;i++){
					int j;
					for(j=0;j<prime.size();j++){
						if(i%prime.get(j)==0) break;
					}
					if(j==prime.size()){
						prime.add(i);
						pp.add(i*i);
						pp.add(i*i*i);
					}
					
				}
			  
			  for(int i=a;i<=b;i++){
					if(pp.contains(i))
						answer++;
				}
        return answer;
    }

    public static void main(String[] args){
        Main sol = new Main();
        int a = 6;
        int b = 30;
        int ret = sol.solution(a, b);

        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
}
