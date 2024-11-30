class Solution {
    public long solution(String numbers) {
        long answer = 0;
        String temp = numbers;
        
        temp = temp.replaceAll("zero", "0");
        temp = temp.replaceAll("one", "1");
        temp = temp.replaceAll("two", "2");
        temp = temp.replaceAll("three", "3");
        temp = temp.replaceAll("four", "4");
        temp = temp.replaceAll("five", "5");
        temp = temp.replaceAll("six", "6");
        temp = temp.replaceAll("seven", "7");
        temp = temp.replaceAll("eight", "8");
        temp = temp.replaceAll("nine", "9");
        
        answer = Long.valueOf(temp);
        
        return answer;
    }
}