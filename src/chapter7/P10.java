package chapter7;

public class P10 {
public static void main(String[] args) {
 double[] numbers = new double[10];
 
 java.util.Scanner input = new java.util.Scanner(System.in);
 System.out.print("Enter ten numbers: ");

 for (int i = 0; i < numbers.length; i++) 
   numbers[i] = input.nextDouble();

 System.out.println("The index of the min is " + 
     indexOfSmallestElement(numbers));
}

public static int indexOfSmallestElement(double[] list) {
 double min = list[0];
 int minIndex = 0;

 for (int i = 1; i < list.length; i++)
   if (min > list[i]) {
     min = list[i];
     minIndex = i;
   }

 return minIndex;
}
}
