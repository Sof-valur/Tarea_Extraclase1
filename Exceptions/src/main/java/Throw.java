
import Exceptions.DivideByZeroException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 50684
 */
public class Throw {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int amountOfSuccessfullDivides = 0;
        try
        {
            divide(1,5); 
            amountOfSuccessfullDivides++;
            divide(1,5);
            amountOfSuccessfullDivides++;
            divide(1,5);
            amountOfSuccessfullDivides++;
            divide(1,0);
            amountOfSuccessfullDivides++;
            divide(1,5);
            amountOfSuccessfullDivides++;
        }
        catch(DivideByZeroException e)
        {
            System.out.println(e.toString());
        }
        finally
        {
            System.out.println("The amound of successful divides is: " + amountOfSuccessfullDivides);
        }
        
    }
    
    private static double divide(int numerator, int denominator) throws DivideByZeroException
    {
        double result;
        
        if (denominator == 0) {
            throw new DivideByZeroException("denominator");
        }
        
        result = numerator / denominator;
        
        return result;
    } 
} 
