package com.Day05Inheritance.level2SingleInheritance;
//use abtract class to hide data
abstract  class Device{
    protected String deviceID;
    protected String status;
    Device(String deviceID,String status){
        this.deviceID=deviceID;
        this.status=status;
    }
    //use abstract method
    public abstract void  displayStatus();


}
//thermostats extends device
class Thermostat extends Device{
    double temperatureSetting;
    Thermostat(String deviceID,String status,double temperatureSetting){
        super(deviceID,status);
         this.deviceID=deviceID;
         this.status=status;
         this.temperatureSetting=temperatureSetting;
    }
    @Override
    public void displayStatus(){
        System.out.println("Device details");
        System.out.println("Device ID: "+deviceID);
        System.out.println("Device status: "+status);
        System.out.println("Device temperature Setting: "+temperatureSetting);
    }

}
//test class
public class SmartHomeDevices {
    public static void main(String[] args) {
        Device thermostat=new Thermostat("S001","ON",22.4);
        thermostat.displayStatus();

    }
}
