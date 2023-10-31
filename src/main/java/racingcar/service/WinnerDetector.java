package racingcar.service;

import racingcar.repository.CarsRepository;
import racingcar.repository.WinnerRepository;

public class WinnerDetector {
    private final PrintService print = new PrintService();
    private final CarsRepository carsRepo = new CarsRepository();
    private final WinnerRepository winnerRepo = new WinnerRepository();

    public void find() {
        winnerRepo.saveNum(carsRepo.findMaxPosition());
        add();
    }

    private void add() {
        for (int i = 0; i < carsRepo.size(); i++) {
            if (winnerRepo.isWinner(carsRepo.getPosition(i))) {
                winnerRepo.add(carsRepo.getName(i));
            }
        }
    }

    public void displayResult() {
        print.winner(winnerRepo.convertListToString());
    }
}
