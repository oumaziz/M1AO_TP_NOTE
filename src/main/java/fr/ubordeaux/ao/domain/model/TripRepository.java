package fr.ubordeaux.ao.domain.model;

public interface TripRepository {

    public void save(Trip trip);
    public Trip load(String id);
}
