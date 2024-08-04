package com.medlife.api.daoimpl;

import java.sql.Date;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.medlife.api.dao.ReceptionistDao;
import com.medlife.api.entity.DoctorsTimeOff;
/**
 * @author Abhay
 *
 */
@Repository
public class ReceptionistDaoImpl implements ReceptionistDao {
	@Autowired
	private SessionFactory sf;

	private static Logger log = LogManager.getLogger(ReceptionistDaoImpl.class);

	@Override
	public DoctorsTimeOff checkDoctorTimeOff(String doctorName, Date date) {
		Session session = sf.getCurrentSession();
		try {

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
