import java.util.ArrayList;
import java.util.Arrays;

public class backtrackingANDmaze {
    public static void main(String[] args) {
        //System.out.println(maze(3, 3));
        //mazePaths("", 3, 3);
        //System.out.println(mazePathsAL("", 3, 3));
        //System.out.println(mazePathsVHD("", 3, 3));
        boolean[][] arr = {
                {true, true, true},
                {true, false, true},
                {true, true, true}
        };
        //mazeWithObstacles("", arr, 0, 0);
        boolean[][] arr2 = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
        mazeAllPathsBacktracking("", arr2, 0, 0);
        boolean[][] arr3 = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
        int[][] path = new int[arr3.length][arr3[0].length];
        mazePathsandSteps("", arr3, 0, 0, path, 1);
    }

    static int maze(int r, int c) {
        if (r == 1 || c == 1) {
            return 1;
        }
        int bottom = maze(r - 1, c);
        int right = maze(r, c - 1);
        return bottom + right;
    }

    static void mazePaths(String p, int r, int c){
        if (r==1 && c==1){
            System.out.println(p);
            return;
        }
        if (r > 1) {
            mazePaths(p + 'D', r - 1, c);
        }
        if (c > 1) {
            mazePaths(p + 'R', r, c - 1);
        }
    }

    static ArrayList<String> mazePathsAL(String p, int r, int c){
        if (r==1 && c==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if (r > 1){
            list.addAll(mazePathsAL(p+'D', r -1, c));
        }
        if (c > 1){
            list.addAll(mazePathsAL(p+'R', r, c -1));
        }
        return list;
    }

    static ArrayList<String> mazePathsVHD(String p, int r, int c){
        if (r==1 && c==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();

        if (r > 1 && c > 1){
            list.addAll(mazePathsVHD(p+'D', r -1, c -1));
        }
        if (r > 1){
            list.addAll(mazePathsVHD(p+'V', r -1, c));
        }
        if (c > 1){
            list.addAll(mazePathsVHD(p+'H', r, c -1));
        }
        return list;
    }

    static void mazeWithObstacles(String p, boolean[][] arr, int r, int c){
        if (r==arr.length -1 && c==arr[0].length -1){
            System.out.println(p);
            return;
        }

        if (!arr[r][c]) return;

        if (r < arr.length -1){
            mazeWithObstacles(p+'D', arr, r +1, c);
        }
        if (c < arr[0].length -1){
            mazeWithObstacles(p+'R', arr, r, c +1);
        }
    }

    static void mazeAllPathsBacktracking(String p, boolean[][] arr, int r, int c){
        if (r==arr.length -1 && c==arr[0].length -1){
            System.out.println(p);
            return;
        }

        if (!arr[r][c]) return;

        arr[r][c] = false;

        if (r < arr.length -1){
            mazeAllPathsBacktracking(p+'D', arr, r+1, c);
        }
        if (c < arr[0].length -1){
            mazeAllPathsBacktracking(p+'R', arr, r, c+1);
        }
        if (r > 0){
            mazeAllPathsBacktracking(p+'U', arr, r-1, c);
        }
        if (c > 0){
            mazeAllPathsBacktracking(p+'L', arr, r, c-1);
        }

        arr[r][c] = true;
    }

    static void mazePathsandSteps(String p, boolean[][] arr, int r, int c, int[][] arr2, int steps){
        if (r==arr.length -1 && c==arr[0].length -1){
            for (int[] arrp : arr2){
                arr2[r][c]=steps;
                System.out.println(Arrays.toString(arrp));
            }
            System.out.println(p);
            System.out.println();
        }
        if (!arr[r][c]){
            return;
        }

        arr[r][c]=false;
        arr2[r][c]=steps;

        if (r<arr.length -1){
            mazePathsandSteps(p+'D', arr, r+1, c, arr2, steps+1);
        }
        if (c<arr[0].length -1){
            mazePathsandSteps(p+'R', arr, r, c+1, arr2, steps+1);
        }
        if (r>0){
            mazePathsandSteps(p+'U', arr, r-1, c, arr2, steps+1);
        }
        if (c>0){
            mazePathsandSteps(p+'L', arr, r, c-1, arr2, steps+1);
        }
        arr2[r][c]=0;
        arr[r][c]=true;
    }
}