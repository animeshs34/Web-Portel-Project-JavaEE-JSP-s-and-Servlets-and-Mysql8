package ddiportal.pojo;

public class Student {
	
	private String enrollment;
	private String name;
	private int branchId;
	private String father;
	private String mother;
	private String caste;
	private  Long mobile;
	private String address;
	public String getEnrollment() {
		return enrollment;
	}
	public void setEnrollment(String enrollment) {
		this.enrollment = enrollment;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBranchId() {
		return branchId;
	}
	public void setBranchId(int branchId) {
		this.branchId = branchId;
	}
	public String getFather() {
		return father;
	}
	public void setFather(String father) {
		this.father = father;
	}
	public String getMother() {
		return mother;
	}
	public void setMother(String mother) {
		this.mother = mother;
	}
	public String getCaste() {
		return caste;
	}
	public void setCaste(String caste) {
		this.caste = caste;
	}
	public Long getMobile() {
		return mobile;
	}
	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + branchId;
		result = prime * result + ((caste == null) ? 0 : caste.hashCode());
		result = prime * result + ((enrollment == null) ? 0 : enrollment.hashCode());
		result = prime * result + ((father == null) ? 0 : father.hashCode());
		result = prime * result + ((mobile == null) ? 0 : mobile.hashCode());
		result = prime * result + ((mother == null) ? 0 : mother.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Student other = (Student) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (branchId != other.branchId)
			return false;
		if (caste == null) {
			if (other.caste != null)
				return false;
		} else if (!caste.equals(other.caste))
			return false;
		if (enrollment == null) {
			if (other.enrollment != null)
				return false;
		} else if (!enrollment.equals(other.enrollment))
			return false;
		if (father == null) {
			if (other.father != null)
				return false;
		} else if (!father.equals(other.father))
			return false;
		if (mobile == null) {
			if (other.mobile != null)
				return false;
		} else if (!mobile.equals(other.mobile))
			return false;
		if (mother == null) {
			if (other.mother != null)
				return false;
		} else if (!mother.equals(other.mother))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	/**
	 * @param enrollment
	 * @param name
	 * @param branchId
	 * @param father
	 * @param mother
	 * @param caste
	 * @param mobile
	 * @param address
	 */
	public Student(String enrollment, String name, int branchId, String father, String mother, String caste,
			Long mobile, String address) {
		super();
		this.enrollment = enrollment;
		this.name = name;
		this.branchId = branchId;
		this.father = father;
		this.mother = mother;
		this.caste = caste;
		this.mobile = mobile;
		this.address = address;
	}
	/**
	 * 
	 */
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [enrollment=" + enrollment + ", name=" + name + ", branchId=" + branchId + ", father=" + father
				+ ", mother=" + mother + ", caste=" + caste + ", mobile=" + mobile + ", address=" + address + "]";
	}
	
	
	
	

}
