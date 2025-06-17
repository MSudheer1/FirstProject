package Enum;

import java.util.Scanner;

public class Planets {

            enum Planet {
                MERCURY, VENUS, EARTH, MARS, JUPITER, SATURN, URANUS, NEPTUNE;
            }
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);


                System.out.println("Enter the name of the planet (e.g., MERCURY, VENUS, EARTH):");
                String userInput = sc.next().toUpperCase();

                try {
                    Planet planet = Planet.valueOf(userInput);

                    switch (planet) {
                        case MERCURY:
                            System.out.println("Mercury is the smallest planet.");
                            break;
                        case VENUS:
                            System.out.println("Venus is the hottest planet.");
                            break;
                        case EARTH:
                            System.out.println("Earth is our home planet.");
                            break;
                        case MARS:
                            System.out.println("Mars is the Red Planet.");
                            break;
                        case JUPITER:
                            System.out.println("Jupiter is the largest planet.");
                            break;
                        case SATURN:
                            System.out.println("Saturn has beautiful rings.");
                            break;
                        case URANUS:
                            System.out.println("Uranus rotates on its side.");
                            break;
                        case NEPTUNE:
                            System.out.println("Neptune is the farthest planet.");
                            break;
                    }
                } catch (IllegalArgumentException e) {
                    System.out.println("Invalid planet name. Please enter a valid planet.");
                } finally {
                    System.out.println("Again see the input!");
                    sc.close();
                }
            }
        }
