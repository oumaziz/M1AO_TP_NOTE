package fr.ubordeaux.ao.domain.model;

import fr.ubordeaux.ao.domain.exception.AlreadyInTripException;

import java.util.ArrayList;
import java.util.List;

public class SeatPool {

    private String id;
    private int nbSeats;
    private List<Passenger> passengers;

    public SeatPool(String id, int nbSeats) {
        this.id = id;
        this.nbSeats = nbSeats;
        this.passengers = new ArrayList<Passenger>();
    }

    public void addPaassenger(Passenger passenger) throws AlreadyInTripException {
        passengers.add(passenger);
    }

    public void removePassenger(Passenger passenger) {
        passengers.remove(passengers.indexOf(passenger));
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public int getAvailableSeatsCount() {
        return nbSeats - passengers.size();
    }

    public int getUsedSeatsCount() {
        return passengers.size();
    }
}
