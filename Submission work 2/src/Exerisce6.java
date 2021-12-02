public class Exerisce6 {
    public static void main(String[] args) {
        int[] arr1 = {23, 45, 77, 93, 17};
        int[] arr2 = {23, 50, 90, 17,};
        System.out.println(ifEstranged(arr1,arr2));
    }
       public  static  int [] intersection(int[] arr1 , int[] arr2) {
        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    count++;
                }
            }
        }
        int count2 = 0;
        int[] arr3 = new int[count];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    arr3[count2] = arr1[i];
                    count2++;
                }
            }
        }

        return arr3;
    }
    public  static boolean ifEstranged(int [] arr1 , int [] arr2){
      int [] arr3 = intersection(arr1,arr2);
    if (arr3.length ==0) {

        return true;
    }
    return false;
}
}






