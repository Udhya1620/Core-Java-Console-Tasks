import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TrafficSignalSimulation {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("No of junctions: ");
            int n = sc.nextInt();

            // Distance logic
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

            // Signal count and times
            int[] signalCounts = new int[n];
            List<List<Integer>> greenTimes = new ArrayList<>();
            List<List<Integer>> redTimes = new ArrayList<>();

            System.out.print("Is number of signals same in all junctions? (yes/no): ");
            String sameSignalCount = sc.next();

            if (sameSignalCount.equalsIgnoreCase("yes")) {
                System.out.print("Enter number of signals at each junction (1/2/3): ");
                int signalCount = sc.nextInt();

                List<Integer> sameGreen = new ArrayList<>();
                List<Integer> sameRed = new ArrayList<>();

                for (int i = 0; i < signalCount; i++) {
                    System.out.print("Green time for signal " + (i + 1) + ": ");
                    sameGreen.add(sc.nextInt());

                    System.out.print("Red time for signal " + (i + 1) + ": ");
                    sameRed.add(sc.nextInt());
                }

                for (int i = 0; i < n; i++) {
                    signalCounts[i] = signalCount;
                    greenTimes.add(new ArrayList<>(sameGreen));
                    redTimes.add(new ArrayList<>(sameRed));
                }

            } else {
                for (int i = 0; i < n; i++) {
                    System.out.print("Number of signals at junction " + (i + 1) + ": ");
                    int count = sc.nextInt();
                    signalCounts[i] = count;

                    List<Integer> gList = new ArrayList<>();
                    List<Integer> rList = new ArrayList<>();

                    for (int j = 0; j < count; j++) {
                        System.out.print("Green time for signal " + (j + 1) + " at junction " + (i + 1) + ": ");
                        gList.add(sc.nextInt());

                        System.out.print("Red time for signal " + (j + 1) + " at junction " + (i + 1) + ": ");
                        rList.add(sc.nextInt());
                    }

                    greenTimes.add(gList);
                    redTimes.add(rList);
                }
            }

            System.out.print("Speed of traveller (in seconds per unit distance): ");
            double speed = sc.nextDouble();

            System.out.print("Is there any delay before junctions? (yes/no): ");
            String delayFlag = sc.next();
            double[] delays = new double[n];
            if (delayFlag.equalsIgnoreCase("yes")) {
                for (int i = 0; i < n; i++) {
                    System.out.print("Delay before junction " + (i + 1) + ": ");
                    delays[i] = sc.nextDouble();
                }
            }

            // ===== PROCESSING =====
            double totalTime = 0;

            for (int i = 0; i < n; i++) {
                totalTime += distances[i] * speed;

                if (delayFlag.equalsIgnoreCase("yes")) {
                    totalTime += delays[i];
                }

                int numSignals = signalCounts[i];
                for (int s = 0; s < numSignals; s++) {
                    int green = greenTimes.get(i).get(s);
                    int red = redTimes.get(i).get(s);
                    int cycle = green + red;

                    int currentTimeInCycle = (int)(totalTime % cycle);

                    if (currentTimeInCycle >= green) {
                        int wait = cycle - currentTimeInCycle;
                        totalTime += wait;
                    }
                }
            }

            totalTime += destinationDistance * speed;

            // ===== OUTPUT =====
            System.out.printf("\n🕒 Total time taken from A to B: %.2f seconds\n", totalTime);
        }
    }

