package racingcar.domain;

public class Car {
    private String name;
    private int position = 0;

    public Car(String name) {
        this.name = name;
    }

    public int getPosition() {
        return this.position;
    }

    public void move(int distance) {
        if(distance >= 4)
            this.position += distance;
    }
}
