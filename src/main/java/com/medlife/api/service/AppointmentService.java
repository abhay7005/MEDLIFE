package com.medlife.api.service;

import java.sql.Date;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.medlife.api.entity.Appointment;

/**
 * @author Abhay
 *
 */


@Transactional
public interface AppointmentService {
	int doctorAvailibilityChecker(String doctorId, Date date, String timeFrom, String timeTo);

	int scheduleAppointment(Appointment appointment);

	Appointment updateAppointment(Appointment appointment);

	Appointment getAppointmentById(String patientId);

	List<Appointment> getAppointmentsByPatientsIds(List<String> patientsId);

	List<Appointment> getAppointmentsByDoctorIdAndAppointmentDate(String doctorId, Date appointmentDate);

	List<Appointment> getAppointmentsByDoctorIdAndAppointmentDate(String doctorId, Date appointmentDate,
			String appointmentTime);

	List<Appointment> getAppointmentsByDate(Date date);

	Long getCountByAppointmentDate(Date appointmentDate);

	List<Appointment> getAppointmentsByBillingDate(Date billingDate);

	Long getAppointmentsTotalCount();

	Long getCountByAppointmentTakenDate(Date appointmentTakenDate);

	Long getCountByTreatmentStatusAndBillingDate(String treatmentStatus, Date billingDate);

	List<Appointment> getAllAppointments();

	List<Appointment> getTop5AppointmentsByDate(Date date);

	Appointment appointmentAvailibityChecker();

}
