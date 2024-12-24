package com.example.demo.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Machine_API")
public class Machine {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int mid;
	private String mname;
	private String mdisc;
		

	public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public String getMdisc() {
		return mdisc;
	}

	public void setMdisc(String mdisc) {
		this.mdisc = mdisc;
	}

	
	@Override
	public String toString() {
		return "Machine [mid=" + mid + ", mname=" + mname + ", mdisc=" + mdisc + "]";
	}
	
	

}
