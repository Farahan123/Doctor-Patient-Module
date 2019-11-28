package com.healthcare.dao;

import java.sql.SQLException;
import java.util.List;

import com.healthcare.model.Appointment;
import com.healthcare.model.Doctor;
import com.healthcare.model.Patient;

public interface PasDao {

	// Patient

	public int addPatients(Patient patient) throws SQLException;

	public List<Patient> getAllPatient() throws SQLException;
	
	public Patient getPatient(int patientId);

	// Doctor

	public int addDoctors(Doctor doctor) throws SQLException;

	public List<Doctor> getAllDoctor() throws SQLException;
	
	public Doctor getDoctor(int doctorId);
	
	//Appointment
	
	public int createAppointment(Appointment appointment) throws SQLException;
	
	public List<Appointment> getAppointments(int doctorId) throws SQLException;

}
