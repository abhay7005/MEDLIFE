package com.medlife.api.service;

import org.springframework.transaction.annotation.Transactional;

import com.medlife.api.model.EmailDetails;
import com.medlife.api.model.ResetPasswordDetail;
/**
 * @author Abhay
 *
 */
@Transactional
public interface EmailPasswordService {

	boolean sendMail(EmailDetails details);

	String sendOtp(String UserId);

	String resetPasswordByOtp(ResetPasswordDetail detail);

	String resetPasswordByQA(ResetPasswordDetail detail);

}
