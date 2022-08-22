package com.arisglobal.rowmapper;


import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

import com.arisglobal.entity.User;

public class UserRowMapper implements RowMapper<User>{
    public User mapRow(ResultSet rs, int i) throws SQLException {
        User u=new User();
        u.setId(rs.getInt("id"));
        u.setUser_name(rs.getString("user_name"));
        u.setRole_id(rs.getInt("role_id"));
        u.setEmail(rs.getString("email"));
        u.setMobile_number(rs.getLong("mobile_number"));
        u.setAddress(rs.getString("address"));
      
        
        return u;
    }    
}
