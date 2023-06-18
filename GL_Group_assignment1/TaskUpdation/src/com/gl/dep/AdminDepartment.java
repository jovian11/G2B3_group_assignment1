package com.gl.dep;

/**
 * Functionality: Admin department class will update department name, Today's Work, Deadline
 * 
 * @author      : Aswin Raj Kumar J, Lahari bhaskar
 * 
 * @since       :17-12-2022
 */

public class AdminDepartment extends SuperDepartment {
	
	// method to return department name
	@Override
	public String departmentName() {
		return " Admin Department";
	}
	
    // method to update about today's work
	@Override
	public String getTodaysWork() {
		return "Complete your documents Submission";
	}
	
    // method to update about work deadline
	@Override
	public String getWorkDeadline() {
		return "Complete by EOD";
	}


}
