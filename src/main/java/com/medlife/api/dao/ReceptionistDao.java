package com.medlife.api.dao;

import java.sql.Date;

import com.medlife.api.entity.DoctorsTimeOff;
/**
 * @author Abhay
 *
 */
public interface ReceptionistDao {
	public DoctorsTimeOff checkDoctorTimeOff(String doctorName, Date date);
}
