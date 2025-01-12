package com.medlife.api.serviceimpl;

import java.sql.Date;
import java.time.LocalTime;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medlife.api.dao.AppointmentDao;
import com.medlife.api.dao.DoctorDao;
import com.medlife.api.entity.Appointment;
import com.medlife.api.service.AppointmentService;

/**
 * @author Abhay
 *
 */
@Service()
public class AppointmentServiceImp implements AppointmentService {

	@Autowired
	private AppointmentDao appointmentDao;

	@Autowired
	private DoctorDao dao;

	@Override
	public int doctorAvailibilityChecker(String doctorId, Date date, String startTime, String endTime) {

		
		return 0;

		}
	
	@Override
	public int scheduleAppointment(Appointment appointment) {
		
		return 0;
		
	}

	@Override
	public Appointment updateAppointment(Appointment appointment) {
		
		return null;
	}

	@Override
	public Appointment getAppointmentById(String appointmentId) {
		return null;
	}

	@Override
	public List<Appointment> getAppointmentsByPatientsIds(List<String> patientsId) {
		return null;

	}

	@Override
	public List<Appointment> getAppointmentsByDoctorIdAndAppointmentDate(String doctorId, Date appointmentDate) {
		return null;

	}

	@Override
	public List<Appointment> getAppointmentsByDoctorIdAndAppointmentDate(String doctorId, Date appointmentDate,
			String appointmentTime) {
		return null;

	}

	@Override
	public List<Appointment> getAppointmentsByDate(Date date) {
		return null;
	}

	@Override
	public Long getCountByAppointmentDate(Date appointmentDate) {
		return null;

	}

	@Override
	public List<Appointment> getAppointmentsByBillingDate(Date billingDate) {
		return null;
	}

	@Override
	public Long getAppointmentsTotalCount() {
		return null;

	}

	@Override
	public Long getCountByAppointmentTakenDate(Date appointmentTakenDate) {
		return 0l;
	}

	@Override
	public Long getCountByTreatmentStatusAndBillingDate(String treatmentStatus, Date billingDate) {
		return null;

	}

	@Override
	public List<Appointment> getAllAppointments() {
		return null;

	}

	@Override
	public List<Appointment> getTop5AppointmentsByDate(Date date) {
		return null;

	}

	@Override
	public Appointment appointmentAvailibityChecker() {
		return null;

	}

}
