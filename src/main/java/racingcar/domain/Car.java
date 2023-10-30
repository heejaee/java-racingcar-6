package racingcar.domain;

public class Car {
    private final Name name;
    private final Position position;

    public Car(String name, int num) {
        this.name = Name.create(name);
        this.position = Position.create(num);
    }

    public static Car from(String name, int num) {
        return new Car(name, num);
    }

    public void plusPosition() {
        this.position.plusNum();
    }

    public Name getName() {
        return name;
    }

    public Position getPosition() {
        return position;
    }
}