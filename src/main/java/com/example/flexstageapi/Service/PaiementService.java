package com.example.flexstageapi.Service;

import com.example.flexstageapi.Entities.PaiementEntity;
import com.example.flexstageapi.Repository.PaiementRepository;
import org.springframework.stereotype.Service;

@Service
public class PaiementService {

    public final PaiementRepository paiementRepository;

    public PaiementService(PaiementRepository paiementRepository) {
        this.paiementRepository = paiementRepository;
    }

    public void effectuerPaiement(PaiementEntity paiement) {
        paiementRepository.save(paiement);
    }
}
