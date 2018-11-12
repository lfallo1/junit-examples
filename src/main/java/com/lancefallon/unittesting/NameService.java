package com.lancefallon.unittesting;

public class NameService {

    public StringHelper stringHelper;

    public NameService(StringHelper stringHelper){
        this.stringHelper = stringHelper;
    }

    public String greet(String name){
        return "Hello, " + this.stringHelper.toUpper(name);
    }

}
