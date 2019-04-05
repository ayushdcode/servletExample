package com.ayush;

public class Emp {
	private int eid;
private String name;
public Emp(int eid, String name,double sal) {
	super();
	this.eid = eid;
	this.name = name;
	this.sal=sal;
}
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getSal() {
	return sal;
}
public void setSal(double sal) {
	this.sal = sal;
}
private double sal;
}
