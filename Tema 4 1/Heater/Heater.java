package Heater;

class Heater {
    private double temperature;
    private double min;
    private double max;
    private double increment;

    Heater(double max, double min) { 
        temperature = 15.0;
        increment = 5;
        this.max = max;
        this.min = min;    
    }

    double getTemperature() {return temperature;}

    void warmer() {temperature += increment<max ? increment : 0;}
    void cooler() {temperature -= increment>min ? increment : 0;}
    void setIncrement(double increment){ this.increment = (5>=increment && increment>=1) ? increment : this.increment;}
}
