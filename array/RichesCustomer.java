public class RichesCustomer{
    public static void main(String[] args){

        int[][] arr = {
                {356,478,345},
                {454,987,344},
                {231,785,674}
        };

        System.out.println("richest customer value is"+ max(arr));
    }
    static int max(int[][] arr){
        int greatest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            int sum = 0;
            for(int j=0; j<arr[i].length; j++){
                sum +=arr[i][j];
            }
            if(sum>greatest){
                greatest=sum;
            }
        }
        return greatest;
    }
}