package immutable.satellite;

import java.util.ArrayList;
import java.util.List;

public class SpaceAgency {

    List<Satellite> satellites = new ArrayList<>();

    public void registerSatellite(Satellite satellite) {
        if(satellite== null) {
            throw new NullPointerException("Parameter must not be null !");
        }
        satellites.add(satellite);

    }

    public Satellite findSatelliteByRegisterIdent(String registerIdent) {
        for (Satellite s : satellites) {
            if(s.getRegisterIdent().equals(registerIdent)) {
                return s;
            }
        }
        throw new IllegalArgumentException(" Satellite with the given registration cannot be found !" + registerIdent);
    }

    @Override
    public String toString() {
        return satellites.toString();
    }
}
