public class LargestNumber {
    public static int Large(int number[]){
        int largest=Integer.MAX_VALUE;
        int smallest=Integer.MIN_VALUE;
        for(int i=0;i<number.length;i++){
            if(largest<number[i]){
               largest=number[i];
            }
        if(smallest>number[i]){
            smallest=number[i];
        }
        }
        System.out.println("smallest value is :"+smallest);
        return largest;
    }
    public static void main(String args[]){
        int number[]={1,2,6,3,5};
        
        System.out.print("largest value is :" + Large(number));
    }
}
