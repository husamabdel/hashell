package com.takyon.hashell;

import java.util.*;
import javax.crypto.*;
//import java.net.*;
import java.io.*;
import com.takyon.hashell.systemops.*;

/**
 * Hello world!
 *
 */
public class hashell 
{

    static String shellEnv=System.getProperty("user.name")+"@"+System.getenv("COMPUTERNAME")+" Running in: "+System.getProperty("os.name")+"";

    static String SHELL = System.getProperty("user.name")+"@"+System.getenv("COMPUTERNAME")+":  ";

    final static String OPERATIONS[]={
        
        "LOGON-USER", 
        "WORKING-DIR", 
        "WRITE", 
        "WRITE-TO", 
        "GOTO",
        "LIST-CURRENT",
        "LIST-LOCATION",
        "LOCAL-FILES",
        "LOCAL-DIRS"
    
    
    };

    static listCurrent workingDir;


    static Scanner input = new Scanner(System.in);

    public static void main( String[] args )
    {
        String opString;


        System.out.println("HASHELL V0.1 RUNNING IN- "+System.getProperty("os.name")+"\n\n");


        do{
        
            System.out.print(SHELL);
            opString = input.next();

            for(String in : OPERATIONS){
                
                if(!(opString.equals(in))){
                    //System.out.println("");
                    break;
                }
                continue;

            }

            //Exit handler:
            if(opString.equalsIgnoreCase("exit")){
                System.out.println("Exiting...");
                System.exit(0);
            }

            //LOGON-USER:
            if(opString.equalsIgnoreCase("LOGON-USER")){

                LOGONUSER();

            }

            if(opString.equalsIgnoreCase("WORKING-DIR")){

                Currentf();

            }

            if(opString.equalsIgnoreCase("LIST-CURRENT")){

                listCurrentf();

            }
            if(opString.equalsIgnoreCase("LIST-FILES") || opString.equalsIgnoreCase("LSF")){

                listFilesOnly();

            }


        } while (!opString.equalsIgnoreCase("exit"));

        
    }


    public static void LOGONUSER(){

        loguser user = new loguser();
        user.PrintLogUser();

    }

    public static void Currentf(){

        listCurrent files = new listCurrent();

        System.out.println(files.getCurrentDir());

    }

    public static void listCurrentf(){

        listCurrent list = new listCurrent();
        list.listAllFiles();

    }

    public static void listFilesOnly(){

        listCurrent filesOnly = new listCurrent();
        filesOnly.listOnlyFiles();

    }



}
