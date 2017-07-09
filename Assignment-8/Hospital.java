package com.info.hospital;

public class Hospital implements Comparable<Hospital> {
	String hospitalName;
    Doctor doc;
    Address hospitalAddress;
     Hospital(){
    	 
     }
	public Hospital(String hospitalName, Doctor doc, Address hospitalAddress) {
		this.hospitalName = hospitalName;
		this.doc = doc;
		this.hospitalAddress = hospitalAddress;
	}
	public String getHospitalName() {
		return hospitalName;
	}
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}
	public Doctor getDoc() {
		return doc;
	}
	public void setDoc(Doctor doc) {
		this.doc = doc;
	}
	public Address getHospitalAddress() {
		return hospitalAddress;
	}
	public void setHospitalAddress(Address hospitalAddress) {
		this.hospitalAddress = hospitalAddress;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((hospitalAddress == null) ? 0 : hospitalAddress.hashCode());
		result = prime * result + ((hospitalName == null) ? 0 : hospitalName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Hospital other = (Hospital) obj;
		if (hospitalAddress == null) {
			if (other.hospitalAddress != null)
				return false;
		} else if (!hospitalAddress.equals(other.hospitalAddress))
			return false;
		if (hospitalName == null) {
			if (other.hospitalName != null)
				return false;
		} else if (!hospitalName.equals(other.hospitalName))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Hospital [hospitalName=" + hospitalName + ", doc=" + doc + ", hospitalAddress=" + hospitalAddress + "]";
	}
	@Override
	public int compareTo(Hospital o) {
		
		return this.hospitalName.compareToIgnoreCase(o.hospitalName);
	}	
    
}
