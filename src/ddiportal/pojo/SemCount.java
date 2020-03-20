package ddiportal.pojo;

public class SemCount {

	private String enrollment;
	private int sem;
	private int year;
	
	public SemCount() {
		// TODO Auto-generated constructor stub
	}

	public String getEnrollment() {
		return enrollment;
	}

	public void setEnrollment(String enrollment) {
		this.enrollment = enrollment;
	}

	public int getSem() {
		return sem;
	}

	public void setSem(int sem) {
		this.sem = sem;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((enrollment == null) ? 0 : enrollment.hashCode());
		result = prime * result + sem;
		result = prime * result + year;
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
		SemCount other = (SemCount) obj;
		if (enrollment == null) {
			if (other.enrollment != null)
				return false;
		} else if (!enrollment.equals(other.enrollment))
			return false;
		if (sem != other.sem)
			return false;
		if (year != other.year)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "SemCount [enrollment=" + enrollment + ", sem=" + sem + ", year=" + year + "]";
	}

	/**
	 * @param enrollment
	 * @param sem
	 * @param year
	 */
	public SemCount(String enrollment, int sem, int year) {
		super();
		this.enrollment = enrollment;
		this.sem = sem;
		this.year = year;
	}
	

}
