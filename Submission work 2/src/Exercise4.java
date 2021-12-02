import java.util.Arrays;
public class Exercise4 {
    public static void main(String[] args) {
        int[] arr = {1,4,4,0};
        System.out.println(Arrays.toString(noDuplicate(arr)));

    }


    public static int[] noDuplicate(int[] arr){
        int numberOfDeletedNumbers = 0;
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    numberOfDeletedNumbers++;
                }
            }
        }
        int[] nonDuplicateArray = new int[arr.length - numberOfDeletedNumbers];
        int nonDuplicateArrayIndex = 0;
        for(int i = 0; i < arr.length - 1; i++){
            boolean isSame = false;
            for(int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    isSame = true;
                    break;
                }
            }

            if(!isSame){
                nonDuplicateArray[nonDuplicateArrayIndex] = arr[i];
                nonDuplicateArrayIndex++;
            }



        }
        return nonDuplicateArray;



    }
}