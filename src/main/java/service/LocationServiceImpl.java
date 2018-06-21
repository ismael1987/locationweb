package service;

import model.Location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repos.LocationRepository;

import java.util.List;
import java.util.Optional;

@Service
public class LocationServiceImpl implements LocationService{


    public LocationRepository getLocationRepository() {
        return locationRepository;
    }

    public void setLocationRepository(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }

    @Autowired
    private LocationRepository locationRepository;

    @Override
    public Location saveLocation(Location location) {
        return locationRepository.save(location);
    }

    @Override
    public Location updateLocation(Location location) {
        return locationRepository.save(location);
    }

    @Override
    public void deleteLocation(Location location) {
        locationRepository.delete(location);

    }

    @Override
    public Optional<Location> getLocationById(int id) {
        return locationRepository.findById(id);
    }

    @Override
    public List<Location> getAllLocations() {
        return locationRepository.findAll();
    }
}
