class Solution {
    public int solution(int a, int b, int c, int d) {
        int small = 6;
        int[] arr = {a, b, c, d};
        
        if(a == b){ //a=b
            if(a == c){ //a=b=c
                if(a == d){
                    return 1111*a; //a=b=c=d
                } else {
                    return (int)Math.pow(10*a+d,2);//a=b=c, d
                }
            } else if(a != c){ //a=b, c
                if(a == d){ 
                    return (int)Math.pow(10*a+c,2);//a=b=d, c
                } else { //a=b, c?d
                    if(c == d){ 
                        return (a+c) * (int)Math.abs(a-c);//a=b, c=d
                    } else{
                        return c*d;//a=b, c, d
                    }
                }
            } 
            
        } else if(a != b && a == c){ // a=c, b
            if(a == d){ 
                return (int)Math.pow(10*a+b,2);// a=c=d, b
            } else { // a=c, b?d
                if(b == d){ 
                    return (a+b) * (int)Math.abs(a-b); //a=c, b=d
                }else{
                    return b*d; //a=c, b, d
                }
            }
            
        } else if(a != b && a != c && a == d){ // a=d, b?c
            if(b == c){
                return (a+b) * (int)Math.abs(a-b);//a=d, b=c
            } else {
                return b*c;//a=d, b, c
            }
            
        } else { // a, ???
            if(b == c){ // a, b=c
                if(b == d){
                    return (int)Math.pow(10*b+a,2); //a, b=c=d
                } else { 
                    return a*d; //a, b=c, d  
                }
            } else { // a, b?d, c?d
                if(b == d){ 
                    return a*c;//a, b=d, c
                } else { 
                    if(c == d){
                        return a*b;//a, b, c=d
                    } else {
                        for(int i = 0; i < 4; i++){
                            small = small > arr[i] ? arr[i] : small;
                        }
                        // System.out.println("제일 작은거");//a, b, c, d
                        return small;
                        
                    }
                }
            }
        }
        
        return 0;
    }
}