public class SpeedConverter {
    public SpeedConverter(double kilometersPerHour) {
        printConversion(kilometersPerHour);
        System.out.println(toMilesPerHour(kilometersPerHour) + " MPH");
    }
    public static void printConversion(double kilometersPerHour){
        double milesPerHour = (kilometersPerHour * 1.609);
        int roundedMPH = (int) Math.round(milesPerHour);
        if(milesPerHour < 0){
            System.out.println("Invalid Value");
        }else {
            System.out.println(kilometersPerHour + " km/h = " +
                    roundedMPH + " mi/h");
        }
    }
    public static long toMilesPerHour(double kilometersPerHour){
        if (kilometersPerHour < 0) {
            return -1;
        }
            return Math.round(kilometersPerHour * 1.609);
    }
}
