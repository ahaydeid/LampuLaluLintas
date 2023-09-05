package satu;
class TrafficLight {
    private String color;
    private int duration;

    public TrafficLight(String color, int duration) {
        this.color = color;
        this.duration = duration;
    }

    public String getColor() {
        return color;
    }

    public int getDuration() {
        return duration;
    }

    public void changeColor() {
        if (color.equals("Red")) {
            color = "Green";
            duration = 10;
        } else if (color.equals("Green")) {
            color = "Yellow";
            duration = 3;
        } else {
            color = "Red";
            duration = 5;
        }
    }
}
