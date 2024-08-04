package com.medlife.api.serviceimpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medlife.api.dao.MedicineCompanyDao;
import com.medlife.api.entity.MedicineCompany;
import com.medlife.api.service.MedicineCompanyService;

/**
 * @author Abhay
 *
 */
@Service
public class MedicineCompanyServiceImp implements MedicineCompanyService {

	@Autowired
	private MedicineCompanyDao medicineCompanyDao;

	@Override
	public MedicineCompany addMedicineCompany(MedicineCompany medicineCompany) {
		return null;

	}

	@Override
	public boolean deleteMedicineCompanyById(String id) {
		return false;
		
	}

	@Override
	public MedicineCompany getMedicineCompanyById(String id) {
		return null;
		
	}

	@Override
	public MedicineCompany updateMedicineCompany(MedicineCompany medicineCompany) {
		return null;
		
		
	}

	@Override
	public List<MedicineCompany> getAllMedicineCompanys() {
		return null;
		
	}

	@Override
	public List<MedicineCompany> getCompanysByName(String companyName) {
		return null;
		
	}

	@Override
	public MedicineCompany getCompanyByName(String companyName) {
		return null;
		
	}

	@Override
	public Long getCountByRegisteredDate(String registeredDate) {
		return null;
		
	}

	@Override
	public List<MedicineCompany> getTop5CompanyAddedByDate(String registeredDate) {
		return null;
		
	}

}
