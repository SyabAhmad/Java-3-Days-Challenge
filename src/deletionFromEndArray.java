public class deletionFromEndArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        ///// at tail of the array
        System.out.println("at end of the array");
        int[] array2 = {1,2,3,4,5,6,7};

        int[] newArray2 = new int[array2.length-1];

        for(int i=0;i< newArray2.length;i++)
        {
            newArray2[i] = array2[i];
        }
        array2 = newArray2;

        for(int i =0;i<array2.length;i++){
            System.out.print(array2[i] + ", ");
        }
    }
}
