//Youre on your own!
//Jk ask for help if you need it (but also look at previous programs!!)
import java.util.Scanner;

class Program4{
    public static void main(String[] args){
    int a;
    int b;
    int c;
    int d;
    int sum;
    double average;
    
    Scanner myScanner = new Scanner(System.in);
    
    System.out.println("Enter a 3 digit number:");
    a = myScanner.nextInt();
    System.out.println("Enter another 3 digit number:");
    b = myScanner.nextInt();
    System.out.println("Enter another 3 digit number:");
    c = myScanner.nextInt();
    System.out.println("Enter another 3 digit number:");
    d = myScanner.nextInt();
    
    sum = a+b+c+d;
    average = (double) sum/4;
    
    System.out.println("The sum of the four numbers is " + sum);
    System.out.println("The average of the four numbers is " + average);
    
}
}


//Paste console output below:
/*
Enter a 3 digit number:
475
Enter another 3 digit number:
821
Enter another 3 digit number:
369
Enter another 3 digit number:
562
The sum of the four numbers is 2227
The average of the four numbers is 556.75

*/
