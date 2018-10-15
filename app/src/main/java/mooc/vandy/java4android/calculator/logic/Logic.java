package mooc.vandy.java4android.calculator.logic;

import mooc.vandy.java4android.calculator.logic.Add;
import mooc.vandy.java4android.calculator.logic.Divide;
import mooc.vandy.java4android.calculator.logic.Multiply;
import mooc.vandy.java4android.calculator.logic.Subtract;
import mooc.vandy.java4android.calculator.ui.ActivityInterface;

/**
 * Performs an operation selected by the user.
 */
public class Logic 
       implements LogicInterface {
    /**
     * Reference to the Activity output.
     */
    private static final int ADDITION = 1;
    private static final int SUBTRACTION = 2;
    private static final int MULTIPLICATION = 3;
    private static final int DIVISION = 4;
    protected ActivityInterface mOut;

    /**
     * Constructor initializes the field.
     */
    public Logic(ActivityInterface out){
        mOut = out;
    }

    /**
     * Perform the @a operation on @a argumentOne and @a argumentTwo.
     */
    public void process(int argumentOne,
                        int argumentTwo,
                        int operation){
        // TODO -- start your code here
        if(operation == ADDITION)
        {
            Add a = new Add(argumentOne,argumentTwo);
            mOut.print(a.toString());
        }
        else if(operation == SUBTRACTION)
        {
            Subtract b = new Subtract(argumentOne,argumentTwo);
            mOut.print(b.toString());
        }
        else if(operation == MULTIPLICATION)
        {
            Multiply c = new Multiply(argumentOne,argumentTwo);
            mOut.print(c.toString());
        }
        else{
            Divide d = new Divide(argumentOne,argumentTwo);
            mOut.print(d.toString());
        }
    }
}
