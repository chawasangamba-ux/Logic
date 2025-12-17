public class linearSearch{
    public static int linearSearch(int number[] , int target){
        for (int i = 0 ; i<= number.length; i++){
        if (number[i] == target) {
        return i;
            }
        }
        return -1;
    }
        public static void main(String[] args){
        int number[] = {1,2,4,6,8};
        int target = 4;
        int result = linearSearch(number,target);
        if (result!=-1){
            System.out.println("The value is at index "+ result );
        }
        }
}