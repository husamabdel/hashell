package com.takyon.hashell.systemops;

public class loguser {

    private String LOGUSER= System.getProperty("user.name");

    private String PARAMS[];

    public loguser(String PARAMS[]){
        this.PARAMS=PARAMS;
    }

    public loguser(){
        
    }

    public String getLOGUSER(){

        return this.LOGUSER;

    }

    public void PrintLogUser(){

        System.out.println(LOGUSER);

    }
    
}
