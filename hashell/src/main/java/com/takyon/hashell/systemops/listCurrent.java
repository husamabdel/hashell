package com.takyon.hashell.systemops;

import java.io.*;

public class listCurrent {

    private String currentDir = System.getProperty("user.home");
    private File file = new File(currentDir);

    public listCurrent(String params){

    }

    public listCurrent(){



    }


    public String getCurrentDir() {
        return currentDir;
    }

    public void setCurrentDir(String currentDir) {
        this.currentDir = currentDir;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }


    public void listAllFiles(){

        File[] subs = file.listFiles();

        System.out.println("****Listing all content of: "+currentDir+" ****\n");
        for(File f : subs){

            if(f.isDirectory()){

                System.out.println("\tDirectory: " + f.getName()+"\n");

            }
            else if(f.isFile()){

                System.out.println("\tFile: " + f.getName()+"\n");

            }

        }

    }

    public void listOnlyDirs(){

        File[] subs = file.listFiles();

        for(File f : subs){

            if(f.isDirectory()){

                System.out.println("\tDirectory: " + f.getName()+"\n");

            }
            else if(f.isFile()){

                continue;

            }

        }


    }

    public void listOnlyFiles(){

        File[] subs = file.listFiles();

        for(File f : subs){

            if(f.isFile()){

                System.out.println("\tFiles: " + f.getName()+"\n");

            }
            else if(f.isDirectory()){

                continue;

            }

        }


    }




    
}
