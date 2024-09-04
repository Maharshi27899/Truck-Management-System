package in.hp.test;

import in.hp.entity.Truck;
import in.hp.service.TruckService;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        TruckService service = new TruckService();

        Truck truck1 = new Truck("Eicher 19","2011",7000,"Shivam");
        Truck truck2 = new Truck("TATA 22","2013",10000,"Amit");
        Truck truck3 = new Truck("Tauras 16T","2014",16000,"Abhishek");
        Truck truck4 = new Truck("Container","2012",7000,"Anshul");
        Truck truck5 = new Truck("Eicher 407","2010",9000,"Yuvraj");

        service.addTruck(truck1);
        service.addTruck(truck2);
        service.addTruck(truck3);
        service.addTruck(truck4);
        service.addTruck(truck5);

        // Hello Sandeep how are you

//        Truck truck = service.getTruckByID(1);
//        System.out.println("Truck Data : "+ truck);
//
//        truck.setDriver_name("Shobhit");
//        service.updateTruck(truck);
//        System.out.println("Updated Truck Data : "+ truck);
//
//        List<Truck> allTrucks = service.getAllTrucks();
//        System.out.println("All trucks in DataBase : ");
//        for(Truck truck0 : allTrucks){
//            System.out.println(truck0);
//        }
    }
}
