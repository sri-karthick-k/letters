package com.example.demo.service;
import com.example.demo.Region;
import com.example.demo.repo.RegionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class RegionService {

    @Autowired
    private RegionRepository regionRepository;

    public List<Region> getAllRegions() {
        return regionRepository.findAll();
    }

    public Optional<Region> getRegionById(String id) {
        return regionRepository.findById(id);
    }

    public Region saveRegion(Region region) {
        return regionRepository.save(region);
    }

    public void deleteRegion(String id) {
        regionRepository.deleteById(id);
    }
}
