public class deletionFromHeadArray {
    public static void main(String[]args)
    {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        ///// at head of the array
        System.out.println("At head of the array");
        int[] array1 = {1,2,3,4,5,6,7};
        int head = array1[0];

        int[] newArray1 = new int[array1.length -1];

        for(int i=head;i<array1.length;i++)
        {
            newArray1[i-1] = array1[i];
        }
        System.out.println();
        array1 = newArray1;
        for (int i=0;i<array1.length;i++)
        {
            System.out.print(array1[i] + ", ");
        }
        System.out.println();
    }
}
