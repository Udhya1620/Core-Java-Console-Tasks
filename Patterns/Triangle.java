package Patterns;

import java.util.Scanner;

public class Triangle {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        String trianglePattern = generateTrianglePattern(rows);
        System.out.println(trianglePattern);
        // Set a breakpoint on the following line to visualize the trianglePattern variable
        System.out.println("Debug Visualizer: " + trianglePattern);
    }

    public static String generateTrianglePattern(int n) {
        StringBuilder pattern = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                pattern.append("* ");
            }
            pattern.append("\n");
        }
        return pattern.toString();

       
    }
}