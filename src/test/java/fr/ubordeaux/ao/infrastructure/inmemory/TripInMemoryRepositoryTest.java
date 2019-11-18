package fr.ubordeaux.ao.infrastructure.inmemory;

import fr.ubordeaux.ao.domain.exception.LocationException;
import fr.ubordeaux.ao.domain.model.Train;
import fr.ubordeaux.ao.domain.model.Trip;
import fr.ubordeaux.ao.domain.model.TripRepository;
import fr.ubordeaux.ao.infrastructure.inmemory.TripInMemoryRepository;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TripInMemoryRepositoryTest {

    @Test
    public void shouldSaveATrip() {
        Train train = null;

        try {
            train = new Train("TR1478", "Bordeaux", "Paris", 100);

            Trip trip = new Trip("TGV8264", train, "15h00", "17h04");

            TripRepository repo = new TripInMemoryRepository();

            repo.save(trip);

            assertEquals(repo.load("TGV8264"), trip);
        } catch (LocationException e) {
        }
    }
}
