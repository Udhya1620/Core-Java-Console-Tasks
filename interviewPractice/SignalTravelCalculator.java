package interviewPractice;
import java.util.*;

public class SignalTravelCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // INPUT
        System.out.print("No of junctions: ");
        int n = sc.nextInt();

        System.out.print("Is distance same between junctions? (yes/no): ");
        String distanceSame = sc.next();
        double[] distances = new double[n];
        if (distanceSame.equalsIgnoreCase("yes")) {
            System.out.print("Distance between junctions: ");
            double d = sc.nextDouble();
            Arrays.fill(distances, d);
        } else {
            for (int i = 0; i < n; i++) {
                System.out.print("Distance to junction " + (i + 1) + ": ");
                distances[i] = sc.nextDouble();
            }
        }

        System.out.print("Distance from last junction to destination: ");
        double destinationDistance = sc.nextDouble();

        System.out.print("Are signal times same? (yes/no): ");
        String sameSignal = sc.next();
        int[] greenTimes = new int[n];
        int[] redTimes = new int[n];
        if (sameSignal.equalsIgnoreCase("yes")) {
            System.out.print("Green time: ");
            int g = sc.nextInt();
            System.out.print("Red time: ");
            int r = sc.nextInt();
            Arrays.fill(greenTimes, g);
            Arrays.fill(redTimes, r);
        } else {
            for (int i = 0; i < n; i++) {
                System.out.print("Green time at junction " + (i + 1) + ": ");
                greenTimes[i] = sc.nextInt();
                System.out.print("Red time at junction " + (i + 1) + ": ");
                redTimes[i] = sc.nextInt();
            }
        }

        System.out.print("Speed of traveller: ");
        double speed = sc.nextDouble();

        System.out.print("Is there any delay before junctions? (yes/no): ");
        String delayFlag = sc.next();
        double[] delays = new double[n];
        if (delayFlag.equalsIgnoreCase("yes")) {
            for (int i = 0; i < n; i++) {
                System.out.print("Delay before junction " + (i + 1) + ": ");
                delays[i] = sc.nextDouble();
            }
        } // else delays remain 0

        // PROCESS
        double totalTime = 0;

        for (int i = 0; i < n; i++) {
            totalTime += distances[i] * speed;

            if (delayFlag.equalsIgnoreCase("yes")) {
                totalTime += delays[i];
            }

            int green = greenTimes[i];
            int red = redTimes[i];
            int cycle = green + red;
            int currentCycleTime = (int)(totalTime % cycle);

            if (currentCycleTime >= green) {
                int waitTime = cycle - currentCycleTime;
                totalTime += waitTime;
            }
        }

        totalTime += destinationDistance * speed;

        // OUTPUT
        System.out.printf("Total time taken to reach from A to B: %.2f seconds\n", totalTime);
    }
}
