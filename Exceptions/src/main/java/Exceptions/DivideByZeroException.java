/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;

/**
 *
 * @author 50684
 */

public class DivideByZeroException extends Exception
{
    public DivideByZeroException(String variableName)
    {
        super("A number cannot be divided by 0, name of the variable: " +variableName);
    }
}