package fr.ubordeaux.ao.domain.model;

import fr.ubordeaux.ao.domain.exception.LocationException;

public class Train {

    private String id;
    private String source;
    private String destination;
    private int nbSeats;

    public Train(String id, String source, String destination, int nbSeats) throws LocationException {
        this.id = id;
        this.source = source;
        this.destination = destination;
        this.nbSeats = nbSeats;
    }

    public String getId() {
        return id;
    }

    public String getSource() {
        return source;
    }

    public String getDestination() {
        return destination;
    }

    public int getNbSeats() {
        return nbSeats;
    }

    @Override
    public String toString() {
        return "TripInMemoryRepository{" +
                "id='" + id + '\'' +
                ", source='" + source + '\'' +
                ", destination='" + destination + '\'' +
                ", nbSeats=" + nbSeats +
                '}';
    }
}
