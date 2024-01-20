package school.mjc.stage0.conditions.finalTask;

public class IntegerDivider {
    public static void printCompletelyDivided(int dividend, int divider) {

         if (divider == 0) {
            System.out.println("division by zero");
        }
        else if (dividend/divider*divider == dividend && dividend>divider) {
            System.out.println("can be divided completely");
        }

        else {
             int result=dividend/divider;
            System.out.println("cannot be divided completely");}
    }
    public static void main (String[]args)
    {int dividend=1;
    int divider=0;
    printCompletelyDivided(dividend, divider);}
}
