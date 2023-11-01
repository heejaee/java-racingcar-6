package racingcar.domain;

public class Car implements Comparable<Car> {
    private final Name name;
    private final Position position;

    private Car(String name, int num) {
        this.name = Name.create(name);
        this.position = Position.create(num);
    }

    public static Car from(String name, int num) {
        return new Car(name, num);
    }

    public void plusPosition(int random) {
        position.plusNum(random);
    }

    public String getName() {
        return name.getName();
    }

    public int getPosition() {
        return position.getNum();
    }

    public int findMaxPosition(int max) {
        return position.findLargerNum(max);
    }

    @Override
    public int compareTo(Car otherCar) {
        return position.getNum() - otherCar.getPosition();
    }

    public boolean isWinner(Car maxCar) {
        return position == maxCar.position;
    }
}