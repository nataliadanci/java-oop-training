package calcMVC;// CalcModel.java
// Fred Swartz - December 2004
// Model
//     This model is completely independent of the user interface.
//     It could as easily be used by a command line or web interface.

import java.math.BigInteger;

public class CalcModel {
    //... Constants
    static final String INITIAL_MULTIPLY_VALUE = "1";
    static final String INITIAL_SUBTRACT_VALUE = "0";
    
    //... Member variable defining state of calculator.
    private BigInteger multiplyTotal;  // The total current value state.
    private BigInteger subtractTotal;
    
    //============================================================== constructor
    /** Constructor */
    CalcModel() {
        resetMultiply();
        resetSubtract();
    }
    
    //==================================================================== reset
    /** Reset to initial value. */
    public void resetMultiply() {
        multiplyTotal = new BigInteger(INITIAL_MULTIPLY_VALUE);
    }
    public void resetSubtract(){
        subtractTotal = new BigInteger(INITIAL_SUBTRACT_VALUE);
    }

    public void resetAll() {
        resetSubtract();
        resetMultiply();
    }
    
    //=============================================================== multiplyBy
    /** Multiply current total by a number.
    *@param operand Number (as string) to multiply total by.
    */
    public void multiplyBy(String operand) {
        multiplyTotal = multiplyTotal.multiply(new BigInteger(operand));
    }

    public void subtract(String operand){
        subtractTotal = subtractTotal.subtract(new BigInteger(operand));
    }
    
    //================================================================= setValue
    /** Set the total value. 
    *@param value New value that should be used for the calculator total. 
    */
    public void setMultiplyTotal(String value) {
        multiplyTotal = new BigInteger(value);
    }
    public void  setSubtractTotal(String value){
        subtractTotal = new BigInteger(value);
    }
    
    //================================================================= getValue
    /** Return current calculator total. */
    public String getMultiplyTotal() {
        return multiplyTotal.toString();
    }
    public String getSubtractTotal(){
        return subtractTotal.toString();
    }
}
