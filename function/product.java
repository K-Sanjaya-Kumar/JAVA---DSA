package function;

public class product {
    public static int Multiply(int a,int b){
        int product=a*b;
        return product;
    }
    public static void main(String[] args) {
        int a=7;
        int b=8;
        int prod=Multiply(a, b);
        System.out.println("prduct = " + prod);
    }
}
