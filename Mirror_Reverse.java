import java.util.Scanner;
class Mirror_Inverse 
{
    static boolean isMirrorInverse(int arr[])
    {
        for (int i = 0; i < arr.length; i++) 
	{
            if (arr[arr[i]] != i)
                return false;
        }
        return true;
    }

    public static void main(String[] args)
    {
        int arr[] = new int [5];
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter 5 values :");
	for(int i=0;i<=4;i++)
	{
		arr[i]=sc.nextInt();
	}
	
        if (isMirrorInverse(arr))
            System.out.println("Given Array is Mirror Inverse");
        else
            System.out.println("Given Array is not Mirror Inverse");
    }
}
