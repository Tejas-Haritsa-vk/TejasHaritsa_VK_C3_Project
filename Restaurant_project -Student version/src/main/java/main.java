import java.time.LocalTime;

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
        } catch (restaurantNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}