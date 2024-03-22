package pattern;

public class star {
    public static void starPattern(int n){
       //i=lines
       //j=stars
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        starPattern(5);
    }
}
