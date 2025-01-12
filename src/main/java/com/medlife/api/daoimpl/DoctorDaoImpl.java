package com.medlife.api.daoimpl;

import java.sql.Date;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.medlife.api.dao.DoctorDao;
import com.medlife.api.entity.DoctorsTimeOff;
import com.medlife.api.service.ReceptionistService;
/**
 * @author Abhay
 *
 */
@Repository
public class DoctorDaoImpl implements DoctorDao {

	private static Logger log = LogManager.getLogger(DoctorDaoImpl.class);

	@Autowired
	private SessionFactory sessionFactory;

	@Autowired
	private ReceptionistService receptionistService;

	@Override
	public int setTimeOff(DoctorsTimeOff doctorsTimeOff) {
		return 0;
	}

	public List<DoctorsTimeOff> getDoctorTimeOff(String doctorUsername, Date date) {

		return null;

	}

	@Override
	public List<DoctorsTimeOff> getDoctorTimeOff(String doctorUsername) {
		return null;
	}

}
