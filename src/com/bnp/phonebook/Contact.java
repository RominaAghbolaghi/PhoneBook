package com.bnp.phonebook;

public class Contact {
    // attributes
    private String name;
//    public String name;
    private String number;
//    public String number;



    private String capitilization(String name) {
        if (name != null && !name.isEmpty()) {
            return (Character.toUpperCase(name.charAt(0)) + name.substring(1).toLowerCase());
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

//    public void setNumber(String number) {
//        this.number = number;
//    }
    private int getFirstDigit(int number) {
        String strNum = Integer.toString(number);
        char firstChar = strNum.charAt(0);
        int firstDigit = Character.getNumericValue(firstChar);
        return firstDigit;
    }
    public void setNumber(int number) {
        if (getFirstDigit(number) != 0)
            this.number = "0" + number;
        else {
            this.number = String.valueOf(number);
        }
    }
//    public String phonebookList() {
//        return ("Name: " + getName() + "    Phone number: " + getNumber());
//    }
    public String contactList() {
        return ("Your contact's name is: " + getName()+ "\n");
    }
    public String phoneList() {
        return ("Your contact's number is: " + getNumber() + "\n");
    }
    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                '}';
    }

}
