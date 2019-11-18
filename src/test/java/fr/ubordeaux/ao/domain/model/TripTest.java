package ao.domain.model;

import fr.ubordeaux.ao.domain.exception.AlreadyInTripException;
import fr.ubordeaux.ao.domain.exception.LocationException;
import fr.ubordeaux.ao.domain.model.Passenger;
import fr.ubordeaux.ao.domain.model.Train;
import fr.ubordeaux.ao.domain.model.Trip;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class TripTest {

    @Test
    public void ShouldNotBookTripTwice() {
        Train train = null;

        try {
            train = new Train("TR1478", "Bordeaux", "Paris", 100);

            Trip trip = new Trip("TGV8264", train, "15h00", "17h04");

            Passenger passenger = new Passenger("PA105024", "John", "Doe");

            trip.addPassenger(passenger);

            trip.addPassenger(passenger);

            fail("should not be able to create a Train with identical source and destination.");

        } catch (LocationException e) {

        } catch (AlreadyInTripException e) {

        }
    }

    @Test
    public void encapsulationShouldBePreserved() {
        Train train = null;

        try {
            train = new Train("TR1478", "Bordeaux", "Paris", 100);

            Trip trip = new Trip("TGV8264", train, "15h00", "17h04");

            Passenger passenger1 = new Passenger("PA105024", "John", "Doe");
            Passenger passenger2 = new Passenger("PA105024", "John", "Doe");

            trip.addPassenger(passenger1);
            trip.addPassenger(passenger2);

            trip.getPassengers().clear();

            assertEquals(2, trip.getPassengers().size());

        } catch (LocationException e) {

        } catch (AlreadyInTripException e) {

        }
    }
}
