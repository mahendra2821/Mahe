 import java.util.Scanner;
    public class lati_langi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the latitude of city 1: ");
        double city1Lat = scanner.nextDouble();

        System.out.println("Enter the longitude of city 1: ");
        double city1Lon = scanner.nextDouble();

        System.out.println("Enter the latitude of city 2: ");
        double city2Lat = scanner.nextDouble();

        System.out.println("Enter the longitude of city 2: ");
        double city2Lon = scanner.nextDouble();

        // Calculate and print the distance
        double distance = calculateDistance(city1Lat, city1Lon, city2Lat, city2Lon);
        System.out.printf("The distance between the two cities is approximately %.2f kilometers.", distance);

        scanner.close();
    }

    public static double calculateDistance(double lat1, double lon1, double lat2, double lon2) {
        // Radius of the Earth in kilometers
        double earthRadius = 6371.0;

        // Convert latitude and longitude from degrees to radians
        lat1 = Math.toRadians(lat1);
        lon1 = Math.toRadians(lon1);
        lat2 = Math.toRadians(lat2);
        lon2 = Math.toRadians(lon2);

        // Haversine formula to calculate distance
        double dlon = lon2 - lon1;
        double dlat = lat2 - lat1;
        double a = Math.pow(Math.sin(dlat / 2), 2) + Math.cos(lat1) * Math.cos(lat2) * Math.pow(Math.sin(dlon / 2), 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        double distance = earthRadius * c;

        return distance;
    }
}

