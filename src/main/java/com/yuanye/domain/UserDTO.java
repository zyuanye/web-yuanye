package com.yuanye.domain;

/**
 * Created by QDHL on 2017/12/22.
 */
public class UserDTO {

    private static final long serialVersionUID = 3096154202413606831L;
    private String username;
    private String password;
    private String userphoneno;
    private Integer id;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

	public String getUserphoneno() {
		return userphoneno;
	}

	public void setUserphoneno(String userphoneno) {
		this.userphoneno = userphoneno;
	}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}
