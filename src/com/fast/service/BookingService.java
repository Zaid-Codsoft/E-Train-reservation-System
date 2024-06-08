package com.fast.service;

import java.util.List;

import com.fast.beans.HistoryBean;
import com.fast.beans.TrainException;

public interface BookingService {

	public List<HistoryBean> getAllBookingsByCustomerId(String customerEmailId) throws TrainException;

	public HistoryBean createHistory(HistoryBean bookingDetails) throws TrainException;

}
