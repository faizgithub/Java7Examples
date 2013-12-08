package com.examples.switchstringclass;

/**
 * Created with IntelliJ IDEA.
 * User: faiz
 * Date: 08/12/2013
 * Time: 21:38
 * To change this template use File | Settings | File Templates.
 */
public class SwitchString {



    public static void main (String args[])
    {
        String status = "NEW";
        if (status.equalsIgnoreCase("NEW")) { System.out.println("Hi this is NEW");
        } else if (status.equalsIgnoreCase("EXECUTE")) { System.out.println("Hi this is EXECUTE");
        } else if (status.equalsIgnoreCase("PENDING")) { System.out.println("Hi this is PENDING");
        }

    }
}
