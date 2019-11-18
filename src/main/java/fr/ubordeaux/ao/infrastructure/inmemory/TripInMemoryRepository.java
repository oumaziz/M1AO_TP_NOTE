package fr.ubordeaux.ao.infrastructure.inmemory;

import fr.ubordeaux.ao.domain.model.Trip;
import fr.ubordeaux.ao.domain.model.TripRepository;

import java.util.HashMap;

public class TripInMemoryRepository implements TripRepository{

    private HashMap<String, Trip> trips;

    public void save(Trip trip) {

    }

    public Trip load(String id) {
        return trips.get(id);
    }
}
