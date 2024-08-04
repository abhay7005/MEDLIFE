package com.medlife.api.service;

import java.sql.Date;

import org.springframework.transaction.annotation.Transactional;

import com.medlife.api.entity.DoctorsTimeOff;
/**
 * @author Abhay
 *
 */
@Transactional
public interface ReceptionistService {
	
	public DoctorsTimeOff checkDoctorTimeOff(String doctorName,Date date);

}
