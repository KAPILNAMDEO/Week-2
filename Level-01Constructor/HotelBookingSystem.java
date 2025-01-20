/*Hotel Booking System: Create a HotelBooking class with attributes guestName, roomType, and nights. Use default, parameterized, and copy constructors
 to initialize bookings.*/
 
 class HotelBooking{
    
    String guestName;
    String roomType;
    int nights;
    //default constructor
    HotelBooking(){
        this.guestName="unknown";
        this.roomType="Non-Ac";
        this.nights=0;
    }
    //parameterized constructor
    HotelBooking(String guestName,String roomType,int nights){
        this.guestName=guestName;
        this.roomType=roomType;
        this.nights=nights;
    }
    //copy constructor
    HotelBooking(HotelBooking otherBooking){
        this.guestName=otherBooking.guestName;
        this.roomType=otherBooking.roomType;
        this.nights=otherBooking.nights;
    }
    //method to display details of hotelBooking
    void displayDeatils(){
        System.out.println("\nGuest Name    :"+guestName);
        System.out.println("Room type   :"+roomType);
        System.out.println("Number of Nights Stand:"+nights);
    }


 }
 public class HotelBookingSystem{
    public static void main(String[] args) {
        HotelBooking hotelBooking1=new HotelBooking();//call default constructor
        hotelBooking1.displayDeatils();

        HotelBooking hotelBooking2=new HotelBooking("Kapil Namdeo","AC Duplex",8);//call parameter constructor 
        hotelBooking2.displayDeatils();

        HotelBooking hotelBooking3=new HotelBooking(hotelBooking2);//call copy constructor
        System.out.println("Copy of hotelbooking1: ");
        hotelBooking3.displayDeatils();





        
    }
 }