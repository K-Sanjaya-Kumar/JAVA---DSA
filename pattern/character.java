package pattern;

public class character {
    public static void charPattern(int n){
        char ch='A';
        for(int i=1;i<=n;i++){
            for(int chars=1;chars<=i;chars++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        charPattern(6);
    }
}
