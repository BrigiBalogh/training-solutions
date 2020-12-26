package isahasa.fleet;

public class FerryBoat  implements Ship,CanCarryPassengers, CanCarryGoods {

    private final CanCarryPassengers canCarryPassengers;
    private final CanCarryGoods canCarryGoods;

    public FerryBoat(int maxCargoWeight, int maxPassegers) {
        canCarryPassengers = new  CanCarryPassengersBehaviour(maxPassegers);
        canCarryGoods = new CanCarryGoodsBehaviour(maxCargoWeight);
    }

    @Override
    public int loadCargo(int cargoWeight) {
        return canCarryGoods.loadCargo(cargoWeight);
    }

    @Override
    public int getCargoWeight() {
        return canCarryGoods.getCargoWeight();
    }

    @Override
    public int loadPassengers(int passengers) {
        return canCarryPassengers.loadPassengers(passengers);
    }

    public int getPassengers() {
        return canCarryPassengers.getPassengers();
    }
}
