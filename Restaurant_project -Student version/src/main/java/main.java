import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

class main {
    public static void main(String[] args) {

        LocalTime openingTime = LocalTime.now().minusHours(4); //LocalTime.parse("10:30:00");
        LocalTime closingTime = openingTime.plusHours(5);
        Restaurant r1 = new Restaurant("A", "a_loc", openingTime, closingTime);

        RestaurantService rs1 = new RestaurantService();
        rs1.addRestaurant("AAA", "a_loc", openingTime, closingTime);
        rs1.addRestaurant("BBB", "b_loc", openingTime, closingTime);
        rs1.addRestaurant("CCC", "c_loc", openingTime, closingTime);
        try {
            Restaurant R1 = rs1.findRestaurantByName("AAA");
            System.out.println("Restaurant "+R1.getName()+" is currently open: "+R1.isRestaurantOpen());
            R1.addToMenu("Sweet corn soup",119);
            R1.addToMenu("Vegetable lasagne", 269);
            R1.addToMenu("Vegetable noodles", 180);
            System.out.println(R1.getMenu());
            List<String> order = new ArrayList<>();
            order.add("Sweet corn soup");
            order.add("Vegetable lasagne");
            System.out.println(order);
        } catch (restaurantNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}