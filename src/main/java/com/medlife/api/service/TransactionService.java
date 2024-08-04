package com.medlife.api.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.medlife.api.entity.TransactionDetails;
/**
 * @author Abhay
 *
 */
@Transactional
public interface TransactionService {

	public int generateSalaryForUser(TransactionDetails transactionDetails);

	public List<String> generateSalaryreportForUser(String username, int from, int to);

}
