package fr.ippon.mill.farmer.domain;

public interface FarmerRepository {
    void save(Farmer farmer);

    boolean exists(String email);
}
