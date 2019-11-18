package fr.ubordeaux.ao.domain.model;

import fr.ubordeaux.ao.domain.model.Passenger;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    @Test
    public void passengersShouldBeEqual() {
        Passenger passenger1 = new Passenger("PA105024", "John", "Doe");
        Passenger passenger2 = new Passenger("PA105024", "John", "Doe");

        assertEquals(passenger1, passenger2);
    }
}
