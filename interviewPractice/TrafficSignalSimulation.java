package interviewPractice;

import java.util.Scanner;

public class TrafficSignalSimulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Number of signals
        System.out.print("Enter the number of signals: ");
        int n = scanner.nextInt();

        // Input: Are all distances the same?
        System.out.print("Are all distances between signals the same? (yes/no): ");
        String distanceUniformInput = scanner.next();
        boolean areDistancesUniform = distanceUniformInput.equalsIgnoreCase("yes");

        double[] distances = new double[n];
        if (areDistancesUniform) {
            System.out.print("Enter the uniform distance between signals: ");
            double uniformDistance = scanner.nextDouble();
            for (int i = 0; i < n; i++) {
                distances[i] = uniformDistance;
            }
        } else {
            System.out.println("Enter distances between signals:");
            for (int i = 0; i < n; i++) {
                System.out.print("Distance to signal " + (i + 1) + ": ");
                distances[i] = scanner.nextDouble();
            }
        }

        // Input: Are all red and green times the same?
        System.out.print("Are all red and green signal times the same? (yes/no): ");
        String signalTimeUniformInput = scanner.next();
        boolean areSignalTimesUniform = signalTimeUniformInput.equalsIgnoreCase("yes");

        int[] redTimes = new int[n];
        int[] greenTimes = new int[n];
        if (areSignalTimesUniform) {
            System.out.print("Enter red time for all signals: ");
            int red = scanner.nextInt();
            System.out.print("Enter green time for all signals: ");
            int green = scanner.nextInt();
            for (int i = 0; i < n; i++) {
                redTimes[i] = red;
                greenTimes[i] = green;
            }
        } else {
            System.out.println("Enter red and green times for each signal:");
            for (int i = 0; i < n; i++) {
                System.out.print("Signal " + (i + 1) + " red time: ");
                redTimes[i] = scanner.nextInt();
                System.out.print("Signal " + (i + 1) + " green time: ");
                greenTimes[i] = scanner.nextInt();
            }
        }

        // Input: Are all paths the same?
        System.out.print("Are all paths between signals the same? (yes/no): ");
        String pathUniformInput = scanner.next();
        boolean arePathsUniform = pathUniformInput.equalsIgnoreCase("yes");

        int[] paths = new int[n];
        if (arePathsUniform) {
            System.out.print("Enter the number of paths for all signals: ");
            int uniformPaths = scanner.nextInt();
            for (int i = 0; i < n; i++) {
                paths[i] = uniformPaths;
            }
        } else {
            System.out.println("Enter the number of paths for each signal:");
            for (int i = 0; i < n; i++) {
                System.out.print("Signal " + (i + 1) + " number of paths: ");
                paths[i] = scanner.nextInt();
            }
        }

        // Input: Are there delays at signals?
        System.out.print("Are there delays at signals? (yes/no): ");
        String delayInput = scanner.next();
        boolean areDelaysPresent = delayInput.equalsIgnoreCase("yes");

        int[] delays = new int[n];
        if (areDelaysPresent) {
            System.out.println("Enter delays at each signal:");
            for (int i = 0; i < n; i++) {
                System.out.print("Delay at signal " + (i + 1) + ": ");
                delays[i] = scanner.nextInt();
            }
        }

        // Input: Vehicle speed
        System.out.print("Enter vehicle speed (e.g., 0.9): ");
        double speed = scanner.nextDouble();

        // Simulation
        double currentTime = 0.0;
        for (int i = 0; i < n; i++) {
            // Travel to the next signal
            currentTime += distances[i] * speed;

            // Add delay if any
            if (areDelaysPresent) {
                currentTime += delays[i];
            }

            // Determine signal status
            int cycleTime = redTimes[i] + greenTimes[i];
            double timeInCycle = currentTime % cycleTime;

            if (timeInCycle < redTimes[i]) {
                // Wait for the next green phase
                currentTime += (redTimes[i] - timeInCycle);
            }
            // Else, proceed without waiting
        }

        // Output: Total time taken
        System.out.println("Total time taken: " + Math.round(currentTime) + " seconds");

        scanner.close();
    }
}
