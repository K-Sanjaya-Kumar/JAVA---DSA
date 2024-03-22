public class Basic1 {
    public static void update(int marks[]) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }

    public static void main(String[] args) {
        int marks[] = { 45, 67, 89 };
        update(marks);
        //for print 
        for (int i=0;i<marks.length;i++){
            System.out.println("marks[i]" + marks[i]);
        }
    }
}
