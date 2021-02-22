package week16d01;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CanoeOffice {

    List<CanoeRental> canoeRentals = new ArrayList<>();

   public void addRental(CanoeRental cr){
       canoeRentals.add(cr);
   }

    public CanoeRental findRentalByName(String name) {
       for (CanoeRental cr : canoeRentals) {
           if (cr.getName().equals(name) && cr.isActive()) {
               return cr;
           }
       }
       throw new IllegalArgumentException("Can not find name" + name);
    }

    public void closeRentalByName(String name, LocalDateTime endTime) {
       CanoeRental cr = findRentalByName(name);
        cr.setEndTime(endTime);
    }

    public double getRentalPriceByName(String name, LocalDateTime endTime) {
        CanoeRental cr = findRentalByName(name);
        return cr.calculateRentalSum(endTime);
    }

    public List<CanoeRental> listClosedRentals() {
        List<CanoeRental> ret = new ArrayList<>();
        for (CanoeRental cr : canoeRentals) {
            //if (cr.getEndTime() == null) {
            if (!cr.isActive()) {
                ret.add(cr);
            }
        }
        return ret;
    }

   public Map<CanoeType, Integer> countRentals() {
       Map<CanoeType,Integer> counts = new HashMap<>();
       for ( CanoeRental cr : canoeRentals) {
           CanoeType tp = cr.getCanoeType();
           if (counts.containsKey(tp)) {
               int cnt =counts.get(tp);
               cnt ++;
               counts.put(tp,cnt);
           }else {
               counts.put(tp, 1);
           }
       }
       return counts;
   }


}
