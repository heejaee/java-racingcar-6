package racingcar.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cars {

    public static final List<String> CarNames = new ArrayList<>();

    public void create(String[] cars) {
        CarNames.addAll(Arrays.asList(cars));
    }

    public void reset() {
        CarNames.clear();
    }
}
