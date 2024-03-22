package DSA.string;

public class shortestpath {
    //Time Complexcity O(n)
    public static float printShortestPath(String path) {
        // initial x and y
        int x = 0;
        int y = 0;
        for (int i = 0; i < path.length(); i++) {
            char direction = path.charAt(i);
            if (direction == 'S') {
                y--;
            } else if (direction == 'N') {
                y++;
            } else if (direction == 'W') { 
                x--;
            } else {
                x++;
            }
        }

        int x2 = x * x;
        int y2 = y * y;
        return (float) Math.sqrt(x2 + y2);
    }

    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println(printShortestPath(path));
    }
}
