public class deletionFromSpecificIndex {
    public static void main(String[]args)
    {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("at specific location");
        int[] newArray = new int[array.length -1];
        int index1 = 3;
        for (int i = 0; i < index1; i++) {
            newArray[i] = array[i];
        }
        for(int i=index1+1;i<array.length;i++)
        {
            newArray[i-1] = array[i];
        }
        array = newArray;

        System.out.println("After Operations");
        for(int i=0;i<array.length;i++)
        {
            System.out.print(array[i] + ",  ");
        }
        System.out.println();
    }
}
