package loop.forloop;

public class breaker {
    public static void main(String[] args) {
       
        for(int i=1;i<=20;i++){
            if(i==6){
                 //break;
                continue;
                
            }
            System.out.println(i);
        }
    }
}
