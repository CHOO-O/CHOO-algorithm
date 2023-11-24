import java.util.*;
import java.lang.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        
        ArrayList<Integer> ansList = new ArrayList<>(); //최종답 저장할 arraylist
        //오늘 날짜 문자열 today : "YYYY.MM.DD"
        //약관의 유효기간을 담은 문자열 배열 terms : "약관종류 유효기간(1~100 개월수)" (ex "A, 12")
        //수집된 개인정보의 정보를 담은 문자열 배열 privacies : "수집된날짜 약관종류" (ex "YYYY.MM.DD B")
        //파기해야 할 개인정보의 번호(오름차순) answer
        
        //0. today
        String[] todayEach = today.split("\\.");
        int todayYear = Integer.valueOf(todayEach[0]);
        int todayMonth = Integer.valueOf(todayEach[1]);
        int todayDay = Integer.valueOf(todayEach[2]);
        
        //1. terms 구분하기
        HashMap<String, Integer> termsMap = new HashMap<>();
        
        for(int i = 0; i < terms.length; i++){
            String[] tempTerms = terms[i].split(" ");
            termsMap.put(tempTerms[0], Integer.valueOf(tempTerms[1]));
        }
        
        // System.out.println(termsMap);
        
        //2. privacies 구분하기
        HashMap<Integer, String> privMap = new HashMap<>();
        
        for(int i = 0; i < privacies.length; i++){
            privMap.put(i+1, privacies[i]);
        }
        
        // System.out.println(privMap);
        
        //3. privacies 따져보기
        for(int i = 1; i <= privMap.size(); i++){
            String[] privEach = privMap.get(i).split(" "); //하나의 개인정보
            // System.out.println(privEach[1]); //해당 개인정보의 약관종류
            int termsMonth = termsMap.get(privEach[1]); // 그 약관종류에 해당하는 개월 수
            
            // System.out.println(privEach[0]); //해당 개인정보의 수집일
            String[] dayEach = privEach[0].split("\\.");
            int privYear = Integer.valueOf(dayEach[0]); //수집년도 int로 변환
            int privMonth = Integer.valueOf(dayEach[1]); //수집월 int로 변환
            int privDay = Integer.valueOf(dayEach[2]); //수집일 int로 변환
            
            // 날짜계산 -> -1일 해줘야함
            // 개월이 12를 넘길수도 있다이말이야
            
            if(termsMonth >= 12){ //약관개월이 12를 넘을경우
                if(termsMonth%12 != 0){ //약관개월이 12로 맞아떨어지지 않으면
                    privYear += termsMonth/12;
                    if((privMonth + termsMonth%12) > 12){ //나머지를 달에 더했는데 12를 넘으면
                        privYear += 1;
                        privMonth = (privMonth + termsMonth%12) -12;
                    } else { //나머지를 달에 더했는데 12를 안넘으면 
                        privMonth += termsMonth%12;
                    }
                } else { //약관개월이 12로 맞아떨어지면 년도만 바뀜
                    privYear += (privMonth + termsMonth)/12; 
                }
            } else if(termsMonth < 12 && (privMonth + termsMonth) > 12) { //12는 안넘는데 합이 넘을때
                privYear += 1;
                privMonth = (privMonth + termsMonth)%12;
            } else { //12도 안넘고 합도 안넘을 때
                privMonth += termsMonth;
            }
            
            // -1해주는 과정
            if(privDay != 1){ //1일이 아니면 그냥 -1
                privDay -= 1;
            } else { //1일일 때
                if(privMonth != 1){ //1월 1일이 아니면
                    privMonth -= 1;
                    privDay = 28;
                } else { //1월 1일일 때
                    privYear -= 1;
                    privMonth = 12;
                    privDay = 28;
                }
            }

            System.out.println("오늘날짜 " + todayYear + "." + todayMonth + "." + todayDay);
            System.out.println("계산후날짜 " + privYear + "." + privMonth + "." + privDay);
            
            // 계산후 날짜와 오늘날짜 비교
            // 계산 후 날짜 -1일 까지 보관 가능하다는 뜻
            // 그러니 오늘 날짜가 최종계산날짜보다 크면(지났으면)
            // 오늘날짜 == 최종날짜 까지는 괜찮음
            // 하루라도 넘어가면 안된다
            
            if(todayYear > privYear){ //오늘년도가 최종년도보다 크면
                ansList.add(i);
            } else if (todayYear == privYear){ //오늘년도 == 최종년도이면
                if(todayMonth > privMonth){ //년도가 같은데 오늘월 > 계산월 이면
                    ansList.add(i); 
                } else if(todayMonth == privMonth){ //년도가 같고 월이 같으면
                    if(todayDay > privDay){ //년도도 같고 월도 같은데 날짜가 지났으면
                        ansList.add(i);
                    }
                }
            } 
        }
        
        int[] answer = new int[ansList.size()];
        for(int i = 0; i < ansList.size(); i++){
            answer[i] = ansList.get(i);
        }
        
        return answer;
    }
}