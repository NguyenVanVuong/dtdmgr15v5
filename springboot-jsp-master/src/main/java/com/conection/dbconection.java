package com.conection;

public class dbconection {
	public String name="root";
	public String pass="dtdmnhom3";
	
	 String sql = String.format(
		        "jdbc:mysql://google/%s?cloudSqlInstance=%s&"
		            + "socketFactory=com.google.cloud.sql.mysql.SocketFactory", "dtdmnhom3","baitapnhom3-sql:asia-northeast1:dtdmnhom3");
	public String getURL()
	{
		return url;
	}
	public String getName()
	{
		return name;
	}
	public String getPass()
	{
		return pass;
	}

}
