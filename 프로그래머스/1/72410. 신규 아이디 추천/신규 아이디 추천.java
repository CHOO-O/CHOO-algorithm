class Solution {
    public String solution(String new_id) {
        String answer = "";
        boolean isNeedFix = false;
    
        while(true){
            if(new_id.length() < 3 || new_id.length() > 15){
                isNeedFix = true;
            } else if(!new_id.matches("[a-z0-9-_.]+")){
                isNeedFix = true;
            } else if(new_id.startsWith(".") || new_id.endsWith(".") || new_id.contains("..")){
                isNeedFix = true;
            } else {
                isNeedFix = false;
            }

            if(isNeedFix){
                // 1
                new_id = new_id.toLowerCase();

                // 2
                new_id = new_id.replaceAll("[^a-z0-9-_.]", "");

                // 3
                while(new_id.contains("..")){
                    new_id = new_id.replaceAll("\\.+", ".");
                }

                // 4
                if(new_id.startsWith(".")){
                    new_id = new_id.substring(1);
                }
                if(new_id.endsWith(".")){
                    new_id = new_id.substring(0, new_id.length()-1);
                }

                // 5
                if(new_id.length() == 0){
                    new_id = "a";
                }

                // 6
                if(new_id.length() > 15){
                    new_id = new_id.substring(0, 15);
                }

                // 7
                if(new_id.length() < 3){
                    while(new_id.length() < 3){
                        new_id += new_id.charAt(new_id.length()-1);
                    }
                }
                answer = new_id;
            } else {
                answer = new_id;
                break;
            }
        }
        
        return answer;
    }
}