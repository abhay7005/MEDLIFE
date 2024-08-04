package com.medlife.api.serviceimpl;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medlife.api.dao.ReceptionistDao;
import com.medlife.api.entity.DoctorsTimeOff;
import com.medlife.api.service.ReceptionistService;

/**
 * @author Abhay
 *
 */
@Service
public class ReceptionistServiceImpl implements ReceptionistService {

	@Autowired
	private ReceptionistDao dao;
	
	@Override
	public DoctorsTimeOff checkDoctorTimeOff(String doctorName, Date date) {
		return null;
		
		
	}

}
