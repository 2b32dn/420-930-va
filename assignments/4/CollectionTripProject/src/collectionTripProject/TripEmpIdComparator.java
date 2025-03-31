package collectionTripProject;

import java.util.Comparator;

public class TripEmpIdComparator implements Comparator<Trip> {
  @Override
  public int compare(Trip trip1, Trip trip2) {
    if (trip1.getEmp_id() < trip2.getEmp_id()) {
      return -1;
    } else {
      return 1;
    }
  }
}
