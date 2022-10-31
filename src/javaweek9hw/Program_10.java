package javaweek9hw;

import java.util.Scanner;

// Write the programme that tell you which line pass through particular stations.
//Just use Zone 1 stations name
public class Program_10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bakerloo \n Central \n District \n Jubilee \n northern");
        System.out.println("");
        System.out.println("Enter Train Name from above list:  ");
        String city = scan.nextLine();
        Program_10 obj = new Program_10();
        obj.stationName(city);
        scan.close();
    }
    public void stationName(String city) {
        switch (city) {
            case "Bakerloo":
                System.out.println("Edgware Road, Marlebone, Baker Street, Oxford Circus, Picadilly Circus, Charging Cross");
                break;
            case "Central":
                System.out.println("Marble Arch, Bond street,Oxford Circus,Holborn, St Pauls, Bank, Liverpool Street ");
                break;
            case "District":
                System.out.println("Tower Mill, Monument, Embankment, Westminster, Victoria, South Kensington, Earls Court");
                break;
            case "Jubilee":
                System.out.println("Baker Street, Bond Street, Green Park, Westminster, Waterloo, Southwark,London Bridge");
                break;
            case "northern":
                System.out.println("Euston, Warren Street, Tottanham Court Road, Leicester Square, Charging Cross,Embankment, Waterloo");
                break;
            default:
                System.out.println("Please enter correct name of Train: ");
        }

    }
}
