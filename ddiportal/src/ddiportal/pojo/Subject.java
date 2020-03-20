package ddiportal.pojo;

public class Subject {

	private String subjectid;
	private String sname;
	private int sem;
	private int branch;
	
	/**
	 * @param subjectid
	 * @param sname
	 * @param sem
	 * @param branch
	 */
	public Subject(String subjectid, String sname, int sem, int branch) {
		super();
		this.subjectid = subjectid;
		this.sname = sname;
		this.sem = sem;
		this.branch = branch;
	}

	@Override
	public String toString() {
		return "Subject [subjectid=" + subjectid + ", sname=" + sname + ", sem=" + sem + ", branch=" + branch + "]";
	}

	public String getSubjectid() {
		return subjectid;
	}

	public void setSubjectid(String subjectid) {
		this.subjectid = subjectid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getSem() {
		return sem;
	}

	public void setSem(int sem) {
		this.sem = sem;
	}

	public int getBranch() {
		return branch;
	}

	public void setBranch(int branch) {
		this.branch = branch;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + branch;
		result = prime * result + sem;
		result = prime * result + ((sname == null) ? 0 : sname.hashCode());
		result = prime * result + ((subjectid == null) ? 0 : subjectid.hashCode());
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
		Subject other = (Subject) obj;
		if (branch != other.branch)
			return false;
		if (sem != other.sem)
			return false;
		if (sname == null) {
			if (other.sname != null)
				return false;
		} else if (!sname.equals(other.sname))
			return false;
		if (subjectid == null) {
			if (other.subjectid != null)
				return false;
		} else if (!subjectid.equals(other.subjectid))
			return false;
		return true;
	}

	public Subject() {
		// TODO Auto-generated constructor stub
	}

}
