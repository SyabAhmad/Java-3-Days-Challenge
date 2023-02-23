public class insertionAtEndArray {
    public static void main(String[]args)
    {
        int[] array = {1,2,3,4,5,6};
        System.out.println("Insertion at End");
        System.out.println("First we will create a new array");
        int[] newArray = new int[array.length + 1];
        for (int i = 0; i < array.length;i++)
        {
            newArray[i] = array[i];
            newArray[i + 1] = 22; /// 22 is the targeted value to be inserted
        }
        array = newArray;
        System.out.println("New array after adding at End");
        for (int i=0;i<array.length;i++)
        {
            System.out.print(array[i] + ", ");
        }
        System.out.println();
    }
}
