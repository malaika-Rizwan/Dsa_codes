package sirAneesLab;

import java.util.Scanner;

public class TemperatureLinkedList {
    private TemperatureData head;  


    public void insert(TemperatureData data) {
        if (head == null) {
            head = data;
        } else {
            TemperatureData temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = data;
        }
    }

   
    public void loadData() {
        insert(new TemperatureData(1, "CityA", "2025-11-01", "08:00", "November", 15.2));
        insert(new TemperatureData(2, "CityA", "2025-11-02", "08:00", "November", 16.5));
        insert(new TemperatureData(3, "CityA", "2025-11-03", "08:00", "November", 14.8));
        insert(new TemperatureData(4, "CityA", "2025-11-04", "08:00", "November", 17.1));
        insert(new TemperatureData(5, "CityA", "2025-11-05", "08:00", "November", 13.9));
     
    }

    public double averageTemperature() {
        if (head == null) return 0;
        double sum = 0;
        int count = 0;
        TemperatureData temp = head;
        while (temp != null) {
            sum += temp.temperature;
            count++;
            temp = temp.next;
        }
        return sum / count;
    }


    public double totalTemperature() {
        double sum = 0;
        TemperatureData temp = head;
        while (temp != null) {
            sum += temp.temperature;
            temp = temp.next;
        }
        return sum;
    }

    
    public double minimumTemperature() {
        if (head == null) return 0;
        double min = head.temperature;
        TemperatureData temp = head.next;
        while (temp != null) {
            if (temp.temperature < min) {
                min = temp.temperature;
            }
            temp = temp.next;
        }
        return min;
    }

    public double maximumTemperature() {
        if (head == null) return 0;
        double max = head.temperature;
        TemperatureData temp = head.next;
        while (temp != null) {
            if (temp.temperature > max) {
                max = temp.temperature;
            }
            temp = temp.next;
        }
        return max;
    }

    public int numberOfMeasurements() {
        int count = 0;
        TemperatureData temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public static void main(String[] args) {
        TemperatureLinkedList list = new TemperatureLinkedList();
        list.loadData();  

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Temperature Data Analysis Menu ---");
            System.out.println("1. Average Temperature");
            System.out.println("2. Total Temperature");
            System.out.println("3. Minimum Temperature");
            System.out.println("4. Maximum Temperature");
            System.out.println("5. Number of Measurements");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.printf("Average Temperature: %.2f°C%n", list.averageTemperature());
                    break;
                case 2:
                    System.out.printf("Total Temperature: %.2f°C%n", list.totalTemperature());
                    break;
                case 3:
                    System.out.printf("Minimum Temperature: %.2f°C%n", list.minimumTemperature());
                    break;
                case 4:
                    System.out.printf("Maximum Temperature: %.2f°C%n", list.maximumTemperature());
                    break;
                case 5:
                    System.out.println("Number of Measurements: " + list.numberOfMeasurements());
                    break;
                case 6:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 6.");
            }
        } while (choice != 6);

        scanner.close();
    }
}
