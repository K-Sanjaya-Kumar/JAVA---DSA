package operator;

public class logical {
    public static void main(String[] args) {
        boolean condition1=(56>33);
        boolean condition2=(77>45);

        // if two condition is true then it is true other wise false
        System.out.println(condition1 && condition2);
        //if one,two condition true  its true two wrong false 
        System.out.println(condition1||condition2);
        System.out.println(!condition1);
       

    }
}
