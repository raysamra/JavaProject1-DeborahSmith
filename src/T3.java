public class T3 {
    public static void main(String[] args) {
        int [][] num={
                {7,9,11,13,15,17},
                {2,4,6,8,10,12},
                {25,30,45,50,65,70}
        };
        for(int i=0; i<num.length; i++){
            for(int j=0; j<num[i].length; j++){
                if(num[i][j]%2==0){
                    System.out.print(num[i][j]+" ");
                }
            }
        }
    }
}
