package astronaut;

import java.util.Scanner;

public class Main {

    static private final Scanner scanner = new Scanner(System.in);

    static DataClass data = new DataClass();

    public static void SetData(){
        System.out.print("Enter Full Name : ");
        data.Name = scanner.nextLine();
        System.out.print("Enter Phone Number : ");
        data.PhnNo = scanner.nextLine();
        System.out.print("Enter Email Address : ");
        data.Email = scanner.nextLine();
        System.out.print("Enter City : ");
        data.City = scanner.nextLine();
        System.out.print("Enter Street Name : ");
        data.Street = scanner.nextLine();
        System.out.print("Enter House Number : ");
        data.HseNo = scanner.nextLine();
        System.out.print("Enter Apartment Number : ");
        data.AptNo = scanner.nextInt();



        System.out.print("Astronaut data : "  + data.Name + ","+ data.PhnNo +"," + data.Email +"," + data.City + "," + data.HseNo + ","+ data.Street + ","+ data.AptNo);

    }


    public static void main(String[] args){

        SetData();

        scanner.close();
    }

}
