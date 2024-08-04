package com.medlife.api.dao;

import java.util.List;

import com.medlife.api.entity.TransactionDetails;
/**
 * @author Abhay
 *
 */
public interface TransactionDao {
	public int generateSalaryForUser(TransactionDetails transactionDetails);

	public TransactionDetails getTransactionDetails(String transactionId);
	
	public TransactionDetails getTransactionDetails(String username,int month);

	public List<TransactionDetails> getTransactionDetails(String username, int from, int to);
	
	

}
