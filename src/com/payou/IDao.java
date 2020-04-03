package com.payou;

public interface IDao <T>{
	
	boolean create(T o);
	T read (T o);
	boolean update(T o);
	boolean delete(T o);
	

}
