package fr.ubordeaux.ao.domain.model;

import fr.ubordeaux.ao.domain.exception.AlreadyInTripException;

import java.util.HashMap;
import java.util.List;

public class Trip {

    private String id;
    private Train train;
    private String departureTime;
    private String arrivalTime;
    private SeatPool seats;

    public Trip(String id, Train train, String departureTime, String arrivalTime) {
        this.id = id;
        this.train = train;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.seats = new SeatPool(this.train.getId(), this.train.getNbSeats());
    }

    public void addPassenger(Passenger passenger) throws AlreadyInTripException {
        this.seats.addPaassenger(passenger);
    }

    public void removePassenger(Passenger passenger) {
        this.seats.removePassenger(passenger);
    }

    public List<Passenger> getPassengers() {
        return seats.getPassengers();
    }

    public int getBookedSeatsCount() {
        return this.getBookedSeatsCount();
    }

    public int getAvailableSeatsCount() {
        return this.getAvailableSeatsCount();
    }
}
