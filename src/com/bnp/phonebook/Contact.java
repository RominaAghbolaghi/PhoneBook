package com.bnp.phonebook;

public class Contact {
    // attributes
    private String name;
//    public String name;
    private String number;
//    public String number;

    private String capitilization(String name) {
        if (name != null && !name.isEmpty()) {
            return (Character.toUpperCase(name.charAt(0)) + name.substring(1));
        }
        return name;
    }
    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = capitilization(name);
//        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
