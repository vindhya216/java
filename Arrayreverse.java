public class Arrayreverse
{
    public static void main(String[] args)
    {
        int arr[] = {10, 55, 60, 23, 75, 42, 89, 15};
        // Print elements in reverse order
        for (int i = arr.length - 1; i >= 0; i--)
        {
            System.out.print(arr[i] + " ");
        }
    }
}