package school.mjc.stage0.conditions.finalTask;

public class TriangleSidesValidator {
    public static void validate(double firstSide, double secondSide, double thirdSide) {
        if ((firstSide>0 && secondSide>0 && thirdSide>0) && (firstSide+secondSide>thirdSide && firstSide+thirdSide>secondSide & secondSide+thirdSide>firstSide))
        {System.out.println("this is a valid triangle");}
else {System.out.println("it's not a triangle");}
    }
    public static void main (String[]args)
    {double firstSide=1;
        double secondSide=2;
        double thirdSide=3;
        validate(firstSide,secondSide,thirdSide);
    }
}
