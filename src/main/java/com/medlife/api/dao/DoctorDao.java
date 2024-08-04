package com.medlife.api.dao;

import java.sql.Date;
import java.util.List;

import com.medlife.api.entity.DoctorsTimeOff;
/**
 * @author Abhay
 *
 */
public interface DoctorDao {

	public List<DoctorsTimeOff> getDoctorTimeOff(String doctorUsername);
	public List<DoctorsTimeOff> getDoctorTimeOff(String doctorUsername, Date Date);
	public int setTimeOff (DoctorsTimeOff doctorsTimeOff);
	/**
	 * @author Abhay
	 *
	 */
}
