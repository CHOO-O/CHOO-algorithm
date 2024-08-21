import java.util.*;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        //1. 친구들의 최종 선물 수 저장할 HashMap
        //2. 선물지수를 계산해 저장할 HashMap
        HashMap<String, Integer> ans = new HashMap<>();
        HashMap<String, Integer> giftScore = new HashMap<>(); //보낸선물
        HashMap<String, Integer> giftScore1 = new HashMap<>(); //받은선물
        HashMap<String, Integer> giftScore2 = new HashMap<>(); //선물지수

        for(int i = 0; i < friends.length; i++){
            ans.put(friends[i], 0);
            giftScore.put(friends[i], 0);
            giftScore1.put(friends[i], 0);
        }

        //3. 선물을 주고받은 기록을 정리하기 - 보낸사람 받는사람 순서쌍
        HashMap<String, Integer> giftPair = new HashMap<>();
        for(int i = 0; i < gifts.length; i++){
            String[] splitArray = gifts[i].split(" "); 
            String giver = splitArray[0];
            String taker = splitArray[1];
            
            if(giftPair.containsKey(gifts[i])){ //만약 동일한 key값을 가진다면
                giftPair.put(gifts[i], giftPair.get(gifts[i]) + 1);
                giftScore.put(giver, giftScore.get(giver) + 1);
                giftScore1.put(taker, giftScore1.get(taker) + 1);
            } else { //없으면 (첫등록)
                giftPair.put(gifts[i], 1); 
                giftScore.put(giver, giftScore.get(giver) + 1);
                giftScore1.put(taker, giftScore1.get(taker) + 1);
            }
        }
        // System.out.println("giftPair" + giftPair);
        // System.out.println("보낸선물" + giftScore);
        // System.out.println("받은선물" + giftScore1);


        //선물지수 계산
        int sum = 0;
        for(int i = 0; i < friends.length; i++){
            String[] splitArray = gifts[i].split(" "); 
            String giver = splitArray[0];
            giftScore2.put(friends[i], giftScore.get(friends[i]) - giftScore1.get(friends[i]));
        }
        // System.out.println("선물지수" + giftScore2);

        //4. 모든 선물 쌍을 구해서
        ArrayList<String> allPair = new ArrayList<>();
        for(int i = 0; i < friends.length; i++){
            for(int j = 0; j < friends.length; j++){
                if(friends[i] != friends[j]){
                    allPair.add(friends[i] + " " + friends[j]);
                }
            }
        }

        String[] allPairArr = new String[allPair.size()];

        for(int i = 0; i < allPair.size(); i++){
            allPairArr[i] = allPair.get(i);
        }
        // System.out.println("allPair" + allPair);

        // System.out.println("---------------------------------");
        for(int i = 0; i < friends.length; i++){
            String friend = friends[i];
            for(int j = i + 1; j < friends.length; j++){
                // System.out.printf("%s와 %s를 비교\n", friend, friends[j]);
                //따져봐야 할 것
                //A가 B에게 준 선물 수
                int AtoB = giftPair.getOrDefault(friend + " " + friends[j], 0);
                // System.out.println("A가 B에게 준 선물 수: " + giftPair.getOrDefault(friend + " " + friends[j], 0));
                //B가 A에게 준 선물 수
                int BtoA = giftPair.getOrDefault(friends[j] + " " + friend, 0);
                // System.out.println("B가 A에게 준 선물 수: " + giftPair.getOrDefault(friends[j] + " " + friend, 0));
                if(AtoB != 0 || BtoA != 0){ //둘 중 하나라도 0이 아니면
                    if(AtoB > BtoA){ //A가 B에게 준 선물이 더 많을 경우
                        ans.put(friend, ans.get(friend) + 1 );
                    } else if(AtoB < BtoA){ //B가 A에게 준 선물이 더 많을 경우
                        ans.put(friends[j], ans.get(friends[j]) + 1 );
                    } else { //같을 때 -> 선물지수 계산
                        if(giftScore2.get(friend) > giftScore2.get(friends[j])){ //A의 선물지수가 B의 선물지수보다 클때
                            ans.put(friend, ans.get(friend) + 1 );
                        } else if(giftScore2.get(friend) < giftScore2.get(friends[j])){ //B의 선물지수가 A의 선물지수보다 클 때
                            ans.put(friends[j], ans.get(friends[j]) + 1 );
                        } //같으면 아무일도 안일어남
                    }
                } else { //둘 다 0이라면
                    if(giftScore2.get(friend) > giftScore2.get(friends[j])){ //A의 선물지수가 B의 선물지수보다 클때
                        ans.put(friend, ans.get(friend) + 1 );
                    } else if(giftScore2.get(friend) < giftScore2.get(friends[j])){ //B의 선물지수가 A의 선물지수보다 클 때
                        ans.put(friends[j], ans.get(friends[j]) + 1 );
                    } //같으면 아무일도 안일어남
                }

                // System.out.println(ans);
            }
        }
        // System.out.println("---------------------------------");

        int answer = Collections.max(ans.values());

        return answer;
    }
}