package com.gl.main;

import com.gl.dep.AdminDepartment;
import com.gl.dep.HrDepartment;
import com.gl.dep.TechDepartment;

/**
 * Functionality: Driver class designed to display the Task updates assigned to respective department.
 *                Holiday status is updated from super department using hierarchical inheritance 
 *               
 * @author       : Aswin Raj Kumar J, Lahari bhaskar
 * 
 * @since        : 18/6/2023
 */

public class Main {
	public static void main(String[] args) {
	    
		// objects creation for AdminDepartment, HrDepartment and TechDepartment
		AdminDepartment admin = new AdminDepartment();
		HrDepartment hr = new HrDepartment();
		TechDepartment tech = new TechDepartment();
	    
	    // AdminDepartment functionalities
	    System.out.println("Welcome to"+admin.departmentName());
	    System.out.println(admin.getTodaysWork());
	    System.out.println(admin.getWorkDeadline());
	    //Calling Super class SuperDepartment method by it's derived class AdminDepartment object 
	    System.out.println(admin.isTodayAHoliday()); 
	    System.out.println();
	    
	    // HrDepartment functionalities
	    System.out.println("Welcome to"+hr.departmentName());
	    System.out.println(hr.doActivity());
	    System.out.println(hr.getTodaysWork());
	    System.out.println(hr.getWorkDeadline());
	    
	    //Calling Super class SuperDepartment method by it's derived class HrDepartment object
	    System.out.println(hr.isTodayAHoliday());
	    System.out.println();
	    
	    //Displaying TechDepartment functionalities
	    System.out.println("Welcome to"+tech.departmentName());
	    System.out.println(tech.getTodaysWork());
	    System.out.println(tech.getWorkDeadline());
	    System.out.println(tech.getTechStackInformation());
	    
	    //Calling Super class SuperDepartment method by it's derived class TechDepartment object
	    System.out.println(tech.isTodayAHoliday());

	}



}
