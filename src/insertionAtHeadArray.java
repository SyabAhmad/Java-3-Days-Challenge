public class insertionAtHeadArray {
    public static void main(String[]args)
    {
        int[] array = {1,2,3,4,5,6,7,8,9};
        System.out.println("Insertion at head");
        int[] newArray1 = new int[array.length+1];
        int value1 = 2003;
        newArray1[0] = value1;
        for (int i = 0; i < array.length;i++)
        {
            newArray1[i+1] = array[i];
        }
        array = newArray1;
        System.out.println("after insertion at head");
        for (int i = 0; i < array.length;i++)
        {
            System.out.print(array[i] + ", ");
        }
        System.out.println();
    }
}
