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
        switch (status) { case "NEW":
            System.out.println("New");
            break; case "EXECUTE":
            System.out.println("Execute");
            break; case "PENDING":
            System.out.println("Pending"); break;
            default: break;
        }

    }
}
