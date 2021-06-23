/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author m-w-n
 */
public class MyException extends Exception
{
    String str1;
    MyException(String str2)
    {
        str1 = str2;
    }
    public String toString()
    {
        return("MyException occured: "+str1);
    }
}
class Example1
{
    public static void main(String[] args)
    {
        try
        {
            System.out.println("Starting of try block");
            throw new MyException("This is My error Message"); //I'm throwing the custom exception using throw
        }catch(MyException exp)
        {
            System.out.println("Catch Block");
            System.out.println("exp");
        }
    }
}
