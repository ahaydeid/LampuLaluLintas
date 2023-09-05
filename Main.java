package satu;
public class Main {
    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight("Red", 5);

        System.out.println("Initial color: " + trafficLight.getColor());
        System.out.println("Initial duration: " + trafficLight.getDuration());

        trafficLight.changeColor();

        System.out.println("New color: " + trafficLight.getColor());
        System.out.println("New duration: " + trafficLight.getDuration());
    }
}
