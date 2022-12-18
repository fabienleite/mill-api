package fr.ippon.mill.farmer.application;

import fr.ippon.mill.farmer.domain.Farmer;
import fr.ippon.mill.farmer.domain.FarmerAlreadyExistsException;
import fr.ippon.mill.farmer.domain.FarmerRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class FarmerService {

    private final FarmerRepository farmerRepository;

    public FarmerService(FarmerRepository farmerRepository){
        this.farmerRepository=farmerRepository;
    }

    @Transactional
    public String register(Farmer farmer) throws FarmerAlreadyExistsException{

        boolean alreadyExists = farmerRepository.exists(farmer.getEmail());
        if(alreadyExists){
            throw new FarmerAlreadyExistsException(farmer.getEmail());
        }
        this.farmerRepository.save(farmer);
        return farmer.getReference().toString();
    }
}
