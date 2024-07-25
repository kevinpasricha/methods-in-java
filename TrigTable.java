import java.lang.Math; // Importing all math functions

public class TrigTable {
    public static void main(String[] args) {
        for (int angle = 1; angle <= 89; angle++) { // Loop through all angles from 1-89
            // Print angle, sine, cosine, and tangent.
            System.out.println("Angle: " + angle + "°, Sin: " + mysin(angle) + ", Cos: " + mycos(angle) + ", Tan: " + mytan(angle));
        }
    }
    // Find the sin
    public static double mysin(int degrees) {
        double radians = degrees * Math.PI / 180; // Convert degrees to radians.
        return Math.sin(radians);
    }

    //Find cosine
    public static double mycos(int degrees) { 
        double radians = degrees * Math.PI / 180; // Convert degrees to radians.
        return Math.cos(radians);
    }

    //Find tangent
    public static double mytan(int degrees) { 
        double radians = degrees * Math.PI / 180; // Convert degrees to radians.
        return Math.tan(radians);
    }
} //End of program
