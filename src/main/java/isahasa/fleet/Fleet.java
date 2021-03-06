package isahasa.fleet;

import java.util.ArrayList;
import java.util.List;

public class Fleet {

    private List<Ship> ships = new ArrayList<>();
private int waitingPersons;
private int waitingCargo;

    public Fleet(List<Ship> ships, int waitingPersons, int waitingCargo) {
        this.ships = ships;
        this.waitingPersons = waitingPersons;
        this.waitingCargo = waitingCargo;
    }

    public void addShip(Ship newShip) {
        ships.add(newShip);
    }

    public int getWaitingPersons() {
        return waitingPersons;
    }

    public int getWaitingCargo() {
        return waitingCargo;
    }

    public void loadShip(int numberOfPerson, int cargoWeight) {
        int remainingPersons = numberOfPerson;
        int remainingCargo = cargoWeight;

        for (Ship ship : ships) {
            if (ship instanceof CanCarryPassengers) {
                if (remainingPersons != 0) {
                    remainingPersons = ((CanCarryPassengers) ship).loadPassengers(remainingPersons);
                }
                ;
            }
            if (ship instanceof CanCarryGoods) {
                if (remainingCargo != 0) {
                    remainingCargo = ((CanCarryGoods) ship).loadCargo(remainingCargo);

                }
            }

        }
        waitingPersons = remainingPersons;
        waitingCargo = remainingCargo;
    }
}
