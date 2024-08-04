package com.medlife.api.serviceimpl;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medlife.api.dao.DoctorDao;
import com.medlife.api.entity.DoctorsTimeOff;
import com.medlife.api.service.DoctorService;
/**
 * @author Abhay
 *
 */
@Service
public class DoctorServiceImpl implements DoctorService {

	@Autowired
	private DoctorDao dao;

	@Override
	public int setTimeOff(DoctorsTimeOff doctorsTimeOff) {

		return 0;

	}
	
	@Override
	public List<DoctorsTimeOff> getDoctorTimeOff(String doctorUsername, Date date) {
		return null;
		
	}

	@Override
	public List<DoctorsTimeOff> getDoctorTimeOff(String doctorUsername) {
		return null;
		
	}

	

	

}
