package co.jw.sol.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.jw.sol.dao.SpDAO;

@Service
public class SpService {

	@Autowired
	private SpDAO dao;

	public String sp() {
		String str=dao.spdao();
		return str;
	}
}
