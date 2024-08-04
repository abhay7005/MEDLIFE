package com.medlife.api.serviceimpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medlife.api.dao.MedicineDistributorDao;
import com.medlife.api.entity.MedicineDistributor;
import com.medlife.api.service.MedicineDistributorService;

/**
 * @author Abhay
 *
 */
@Service
public class MedicineDistributorServiceImp implements MedicineDistributorService {

	@Autowired
	private MedicineDistributorDao medicineDistributorDao;

	@Override
	public MedicineDistributor addMedicineDistributor(MedicineDistributor medicineDistributor) {
		return null;

	}

	@Override
	public boolean deleteMedicineDistributorById(String id) {
		return false;
		
	}

	@Override
	public MedicineDistributor getMedicineDistributorById(String id) {
		return null;
		
	}

	@Override
	public MedicineDistributor updateMedicineDistributor(MedicineDistributor medicineDistributor) {
		return medicineDistributor;
	}

	@Override
	public List<MedicineDistributor> getAllDistributors() {
		return null;
		
	}

	@Override
	public List<MedicineDistributor> getDistributorsByName(String distributorName) {
		return null;
		
	}

	@Override
	public MedicineDistributor getDistributorByName(String distributorName) {
		return null;
		
	}

	@Override
	public Long getCountByRegisteredDate(String registeredDate) {
		return null;
		
	}

	@Override
	public List<MedicineDistributor> getTop5CompanyAddedByDate(String date) {
		return null;
		
	}

}
