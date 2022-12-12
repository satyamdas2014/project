package project1java;

import java.sql.ResultSet;

public interface inter {
	public void connectdb();
	public boolean verifylogin(String email , String password);
    public void update(String name, String city, String email, String mobile);
     public ResultSet allcontent();
}
