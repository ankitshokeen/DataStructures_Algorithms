public class Patterns {
    public static void main(String[] args) {

        pattern9(5);

    }
    public static void pattern1(int n){
        for(int row=0; row<=n; row++){
            for(int column=0; column<=n; column++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern2(int n){
        for(int row=0; row<=n; row++){
            for(int column=0; column<=row; column++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern3(int n){
        for(int row=0; row<=n; row++){
            for(int column=0; column<=n- row; column++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern4(int n){
        for(int row=1; row<=n; row++){
            for(int column=1; column<=row; column++){
                System.out.print(column +" ");
            }
            System.out.println();
        }
    }

    public static void pattern5(int n){
        for(int row=0; row<=n*2; row++){
            int totalColumns = row>n ? n*2 -row :row;
            for(int column=0; column<=totalColumns; column++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern28(int n){
        for(int row=0; row<=n*2; row++){

            int totalCols = row>n ? n*2 -row :row;
            int totalSpaces = n- totalCols;

            for(int spaces=0; spaces<totalSpaces; spaces++){
                System.out.print(" ");
            }
            for(int col=0; col<=totalCols; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern10(int n){
        for(int row=0; row<=n; row++){

            int totalSpaces = n- row;

            for(int spaces=0; spaces<totalSpaces; spaces++){
                System.out.print(" ");
            }

            for(int col=0; col<=row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern9(int n){
        for(int row=n; row>=0; row--){

            int totalSpaces = n- row;
            
            for(int spaces=0; spaces<totalSpaces; spaces++){
                System.out.print(" ");
            }

            for(int col=0; col<=row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
