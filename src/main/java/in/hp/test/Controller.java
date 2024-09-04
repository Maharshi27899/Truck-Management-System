package in.hp.test;

import in.hp.entity.Truck;
import in.hp.service.TruckService;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

/**
 * Hello world!
 *
 */
public class Controller
{
    public static void main( String[] args )
    {
        TruckService service = new TruckService();



//        Truck truck1 = new Truck("Eicher 19","2011",7000,"Shivam");
//        Truck truck2 = new Truck("TATA 22","2013",10000,"Amit");
//        Truck truck3 = new Truck("Tauras 16T","2014",16000,"Abhishek");
//        Truck truck4 = new Truck("Container","2012",7000,"Anshul");
//        Truck truck5 = new Truck("Eicher 407","2010",9000,"Yuvraj");
//        Truck truck6 = new Truck("Eicher 407","2010",9000,"Yuvraj");


        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            while (true){
                System.out.println("Enter You Choice : ");
                System.out.println("1. ADD TRUCK");
                System.out.println("2. SEARCH TRUCK");
                System.out.println("3. DELETE TRUCK");
                System.out.println("4. UPDATE TRUCK");
                System.out.println("5. SHOW ALL TRUCKS");
                System.out.println("6. EXIT");

                int choice = Integer.parseInt(br.readLine());
                TruckService truckService = new TruckService();
                Integer tid = null;
                Truck truck = null;
                String tname = null, tmodel = null, tdriver= null;
                Integer tcapacity = null;
                String status = null;


                switch (choice){
                    case 1://add Truck
                        System.out.println("Enter Truck Name : ");
                        tname = br.readLine();
                        System.out.println("Enter Truck Model : ");
                        tmodel = br.readLine();
                        System.out.println("Enter Truck Capacity : ");
                        tcapacity = Integer.parseInt(br.readLine());
                        System.out.println("Enter Driver Name : ");
                        tdriver = br.readLine();

//                        Create new Truck
                        truck = new Truck(tname,tmodel,tcapacity,tdriver);

                        status = truckService.addTruck(truck);
                        System.out.println("Status : "+status);
                        break;

                    case 2://search truck
                        System.out.println("Enter Truck ID : ");
                        tid = Integer.parseInt(br.readLine());
                        truck = truckService.getTruckByID(tid);
                        if(truck == null){
                            System.out.println("Status : Truck Not Existed !!!");
                        }else {
                            System.out.println("Truck Details :");
                            System.out.println("Truck Id : "+truck.getId());
                            System.out.println("Truck Name : "+truck.getName());
                            System.out.println("Truck Model : "+truck.getModel());
                            System.out.println("Truck Capacity : "+truck.getCapacity());
                            System.out.println("Truck Driver Name : "+truck.getName());
                        }
                        break;
                }
            }


        }catch (Exception e){
            e.printStackTrace();
        }




//        service.addTruck(truck1);
//        service.addTruck(truck2);
//        service.addTruck(truck3);
//        service.addTruck(truck4);
//        service.addTruck(truck5);

//        System.out.println(service.alreadyExist(truck6));
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
