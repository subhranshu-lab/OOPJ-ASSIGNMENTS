import java.lang.*;

class A4Q2{

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Floating Point No:");
        double n1 = sc.nextDouble();

        System.out.println("Enter Second Floating Point No:");
        double n2 = sc.nextDouble();

        int a = (int)(n1 * 1000);
        int b = (int)(n2 * 1000);

        if(a == b){
            System.out.println("The numbers are same up to three decimal places.");
        }
        else{
            System.out.println("The numbers are different.");
        }

        sc.close();
    }
}