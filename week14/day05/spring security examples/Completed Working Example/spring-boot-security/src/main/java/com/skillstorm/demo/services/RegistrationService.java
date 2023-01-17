package com.skillstorm.demo.services;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.skillstorm.demo.dto.UserDto;

@Service
public class RegistrationService {
	
	@Autowired
	private PasswordEncoder encoder; // BCrypt

	@Autowired
	// This allows us to query the database
	private JdbcTemplate jdbcTemplate;
	
	public void register(String username, String password) {
		// Registers a given user
		String userSql = "insert into users values (?, ?, true)";
		String authzSql = "insert into authorities values (?, 'ROLE_USER')";
		
		// Takes the sql, the parameters to insert, and the types of those parameters
		jdbcTemplate.update(userSql, new String[] {username, encoder.encode(password)}, 
				new int[] {Types.VARCHAR, Types.VARCHAR});
		jdbcTemplate.update(authzSql, new String[] {username}, new int[] {Types.VARCHAR});
	}
	
	// Allow admins to get all user details
	@PreAuthorize("hasAnyRole('ADMIN')")
	public List<UserDto> findAll() {
		String sql = "SELECT * FROM users";
		return jdbcTemplate.query(sql, new UserRowMapper());
	}
}

class UserRowMapper implements RowMapper<UserDto> {

	@Override
	public UserDto mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		return new UserDto(rs.getString("username"), rs.getString("password"));
	}
	
}