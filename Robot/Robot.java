package Robot;


public class Robot {
    private static double posx, posy, lmotor, rmotor, angle = 0;

    public static void setLeftMotor(double speed) {
        lmotor = speed;
    }

    public static void setRightMotor(double speed) {
        lmotor = speed;
    }

    public static void tick() {

    }
    public static void sayHi() {
        System.out.println("Hello! I am a robot.");
    }
}