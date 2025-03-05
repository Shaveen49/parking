import java.util.Scanner;

public class Parking {
    public static void main(String[] args) {

        System.out.println("Parking complete");


        Scanner sc = new Scanner(System.in);

        Vehicle[] vehicle = new Vehicle[5];
        int indexCount = 0;

        while (true) {
            System.out.println("1.Park in bus");
            System.out.println("2.Park in car");
            System.out.println("3.Park in van");
            System.out.println("4.vehicle out");
            System.out.println("5.Quit");

            System.out.println("Enter option:");
            int option = sc.nextInt();

            switch (option) {
                case 1:
                    vehicle[indexCount]= new Bus();
                    System.out.println("Enter vehicle name:");
                    String busName = sc.next();
                    vehicle[indexCount].setName(busName);
                    System.out.println("Enter vehicle model:");
                    String vehicleModel = sc.next();
                    vehicle[indexCount].setModel(vehicleModel);
                    vehicle[indexCount].inParking();
                    indexCount++;
                    break;

                case 2:
                    vehicle[indexCount] = new Car();
                    System.out.println("Enter vehicle name:");
                    String carName = sc.next();
                    vehicle[indexCount].setName(carName);
                    System.out.println("Enter vehicle model:");
                    String carModel = sc.next();
                    vehicle[indexCount].setModel(carModel);
                    vehicle[indexCount].inParking();
                    indexCount++;
                    break;

                case 3:
                    vehicle[indexCount] = new Van();
                    System.out.println("Enter vehicle name:");
                    String vanName = sc.next();
                    vehicle[indexCount].setName(vanName);
                    System.out.println("Enter vehicle model:");
                    String vanModel = sc.next();
                    vehicle[indexCount].setModel(vanModel);
                    vehicle[indexCount].inParking();
                    indexCount++;
                    break;
                case 4:
                    System.out.println("Enter vehicale that want to be parked out");
                    int parkingNumber = sc.nextInt();
                    vehicle[parkingNumber-1].outParking();
                    System.out.println("Vehicle parked out: " + vehicle[parkingNumber-1].getName() + " " + vehicle[parkingNumber-1].getModel());
                    vehicle[parkingNumber-1] = null;
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        }

//        for(int i = 0; i < vehicle.length; i++){
//            if(vehicle[i] != null){
//                System.out.println("Vehicle Name: "+ vehicle[i].getName()+"Vehicle Model: "+ vehicle[i].getModel());
//            }
//        }

    }
}
