import java.util.*;

class Main {
	
	  ArrayList<Integer> ret = new ArrayList<>();
	
	  public void make_card(ArrayList<Integer> card, int len, String str, int card_len){
			
			for(int i=0;i<card.size();i++){
				if(len==card_len-1){
					str += Integer.toString(card.get(i));
					if(!ret.contains(Integer.parseInt(str)))
						ret.add(Integer.parseInt(str));
				}
				else{
					ArrayList<Integer> ncard = new ArrayList<>();
					ncard.addAll(card);
					ncard.remove(card.get(i));
					make_card(ncard, len+1, str+Integer.toString(card.get(i)),card_len);
				}
			}
			
		} 
	
    public int solution(int[] card, int n) {
        int answer = 0;
			
			  ret.add(0);  //인덱스 값을 1부터 시작하기 위함
			  // 정렬
			  Arrays.sort(card);
			  // 카드 저장
			  ArrayList<Integer> cards = new ArrayList<>();
			  for(int i=0;i<card.length;i++){
					cards.add(card[i]);
				}
			  make_card(cards, 0, "", card.length);

			  // 몇번째인지 확인
			  answer = ret.indexOf(n);
			  
        return answer;
    }
    
    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        Main sol = new Main();
        int card1[] = {1, 2, 1, 3};
        int n1 = 1312;
        int ret1 = sol.solution(card1, n1);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

        int card2[] = {1, 1, 1, 2};
        int n2 = 1122;
        int ret2 = sol.solution(card2, n2);
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
    }    
}
