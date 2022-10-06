package com.infinite.jsfwithjdbc;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;



@ManagedBean
@SessionScoped
public class EmployDAO  implements Serializable{
	public List<Employ> showEmployDAO(){
		List<Employ> employList=new ArrayList<Employ>();
	    employList.add(new Employ(1,"krishnakant","java","Dvreloper",4521));
		   employList.add(new Employ(2,"krishiuyhnakant","jfrava","Dvrerffloper",45321));
		return employList;
		
			
		
	}

}
