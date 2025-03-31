package collectionTripProject;

import java.util.Comparator;

public class TripTotalCostComparator implements Comparator<Trip> {
  @Override
  public int compare(Trip trip1, Trip trip2) {
    if (trip1.CalculateCostTrip() > trip2.CalculateCostTrip()) {
      return -1;
    } else {
      return 1;
    }
  }
}