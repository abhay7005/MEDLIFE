package com.medlife.api.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.medlife.api.entity.MedicineDistributor;

/**
 * @author Abhay
 *
 */
@Transactional
public interface MedicineDistributorService {
	MedicineDistributor addMedicineDistributor(MedicineDistributor medicineDistributor);
	boolean deleteMedicineDistributorById(String id);
	MedicineDistributor getMedicineDistributorById(String id);
	MedicineDistributor updateMedicineDistributor(MedicineDistributor medicineDistributor);
	List<MedicineDistributor> getAllDistributors();
	List<MedicineDistributor> getDistributorsByName(String distributorName);
	MedicineDistributor getDistributorByName(String distributorName);
	Long getCountByRegisteredDate(String registeredDate);
	List<MedicineDistributor> getTop5CompanyAddedByDate(String date);
}
