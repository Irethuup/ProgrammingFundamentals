package MidExam_19_10_24;

import java.util.Scanner;

public class JourneyToTheLegendaryArtifact_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initial energy - real number
        double energy = Double.parseDouble(scanner.nextLine());
        // Collected artifact pieces
        int artifactPieces = 0;
        // Count of mountains passed
        int mountainCount = 0;

        // Continue reading until the journey ends or the character runs out of energy
        while (true) {
            String terrain = scanner.nextLine().trim();

            // Break the loop when a "Journey ends here!" is given
            if (terrain.equalsIgnoreCase("Journey ends here!")) {
                break;
            }

            // Different terrains
            switch (terrain.toLowerCase()) {
                case "mountain":
                    energy -= 10;
                    mountainCount++;
                    // Every third mountain, we collect an artifact piece
                    if (mountainCount % 3 == 0) {
                        artifactPieces++;
                    }
                    break;
                case "desert":
                    energy -= 15;
                    break;
                case "forest":
                    energy += 7;
                    break;
                default:
                    // Invalid terrain input
                    System.out.println("Invalid terrain: " + terrain);
                    continue;  // Skip to the next iteration instead of returning
            }

            // Check if energy drops below or equal to zero after every move
            if (energy <= 0) {
                System.out.println("The character is too exhausted to carry on with the journey.");
                return;
            }

            // If all 3 pieces are collected, the journey is successful
            if (artifactPieces == 3) {
                System.out.printf("The character reached the legendary artifact with %.2f energy left.%n", energy);
                return;
            }
        }

        // If the journey ends and not all artifact pieces were found
        if (artifactPieces < 3) {
            int neededPieces = 3 - artifactPieces;
            System.out.printf("The character could not find all the pieces and needs %d more to complete the legendary artifact.%n", neededPieces);
        }
    }
}