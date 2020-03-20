package ddiportal.pojo;

public class Result {

	private String enrollment;
	private String sub1;
	private String sub2;
	private String sub3;
	private String sub4;
	private String sub5;
	private String sub6;
	private String sub7;
	private String sub8;
	private String sub9;
	private String sub10;
	private String sub11;
	private double cgpa;
	private double sgpa;
	private int sem;
	public Result() {
		// TODO Auto-generated constructor stub
	}
	public String getEnrollment() {
		return enrollment;
	}
	public void setEnrollment(String enrollment) {
		this.enrollment = enrollment;
	}
	public String getSub1() {
		return sub1;
	}
	public void setSub1(String sub1) {
		this.sub1 = sub1;
	}
	public String getSub2() {
		return sub2;
	}
	public void setSub2(String sub2) {
		this.sub2 = sub2;
	}
	public String getSub3() {
		return sub3;
	}
	public void setSub3(String sub3) {
		this.sub3 = sub3;
	}
	public String getSub4() {
		return sub4;
	}
	public void setSub4(String sub4) {
		this.sub4 = sub4;
	}
	public String getSub5() {
		return sub5;
	}
	public void setSub5(String sub5) {
		this.sub5 = sub5;
	}
	public String getSub6() {
		return sub6;
	}
	public void setSub6(String sub6) {
		this.sub6 = sub6;
	}
	public String getSub7() {
		return sub7;
	}
	public void setSub7(String sub7) {
		this.sub7 = sub7;
	}
	public String getSub8() {
		return sub8;
	}
	public void setSub8(String sub8) {
		this.sub8 = sub8;
	}
	public String getSub9() {
		return sub9;
	}
	public void setSub9(String sub9) {
		this.sub9 = sub9;
	}
	public String getSub10() {
		return sub10;
	}
	public void setSub10(String sub10) {
		this.sub10 = sub10;
	}
	public String getSub11() {
		return sub11;
	}
	public void setSub11(String sub11) {
		this.sub11 = sub11;
	}
	public double getCgpa() {
		return cgpa;
	}
	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}
	public double getSgpa() {
		return sgpa;
	}
	public void setSgpa(double sgpa) {
		this.sgpa = sgpa;
	}
	public int getSem() {
		return sem;
	}
	/**
	 * @param enrollment
	 * @param sub1
	 * @param sub2
	 * @param sub3
	 * @param sub4
	 * @param sub5
	 * @param sub6
	 * @param sub7
	 * @param sub8
	 * @param sub9
	 * @param sub10
	 * @param sub11
	 * @param cgpa
	 * @param sgpa
	 * @param sem
	 */
	public Result(String enrollment, String sub1, String sub2, String sub3, String sub4, String sub5, String sub6,
			String sub7, String sub8, String sub9, String sub10, String sub11, double cgpa, double sgpa, int sem) {
		super();
		this.enrollment = enrollment;
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
		this.sub4 = sub4;
		this.sub5 = sub5;
		this.sub6 = sub6;
		this.sub7 = sub7;
		this.sub8 = sub8;
		this.sub9 = sub9;
		this.sub10 = sub10;
		this.sub11 = sub11;
		this.cgpa = cgpa;
		this.sgpa = sgpa;
		this.sem = sem;
	}
	@Override
	public String toString() {
		return "Result [enrollment=" + enrollment + ", sub1=" + sub1 + ", sub2=" + sub2 + ", sub3=" + sub3 + ", sub4="
				+ sub4 + ", sub5=" + sub5 + ", sub6=" + sub6 + ", sub7=" + sub7 + ", sub8=" + sub8 + ", sub9=" + sub9
				+ ", sub10=" + sub10 + ", sub11=" + sub11 + ", cgpa=" + cgpa + ", sgpa=" + sgpa + ", sem=" + sem + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(cgpa);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((enrollment == null) ? 0 : enrollment.hashCode());
		result = prime * result + sem;
		temp = Double.doubleToLongBits(sgpa);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((sub1 == null) ? 0 : sub1.hashCode());
		result = prime * result + ((sub10 == null) ? 0 : sub10.hashCode());
		result = prime * result + ((sub11 == null) ? 0 : sub11.hashCode());
		result = prime * result + ((sub2 == null) ? 0 : sub2.hashCode());
		result = prime * result + ((sub3 == null) ? 0 : sub3.hashCode());
		result = prime * result + ((sub4 == null) ? 0 : sub4.hashCode());
		result = prime * result + ((sub5 == null) ? 0 : sub5.hashCode());
		result = prime * result + ((sub6 == null) ? 0 : sub6.hashCode());
		result = prime * result + ((sub7 == null) ? 0 : sub7.hashCode());
		result = prime * result + ((sub8 == null) ? 0 : sub8.hashCode());
		result = prime * result + ((sub9 == null) ? 0 : sub9.hashCode());
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
		Result other = (Result) obj;
		if (Double.doubleToLongBits(cgpa) != Double.doubleToLongBits(other.cgpa))
			return false;
		if (enrollment == null) {
			if (other.enrollment != null)
				return false;
		} else if (!enrollment.equals(other.enrollment))
			return false;
		if (sem != other.sem)
			return false;
		if (Double.doubleToLongBits(sgpa) != Double.doubleToLongBits(other.sgpa))
			return false;
		if (sub1 == null) {
			if (other.sub1 != null)
				return false;
		} else if (!sub1.equals(other.sub1))
			return false;
		if (sub10 == null) {
			if (other.sub10 != null)
				return false;
		} else if (!sub10.equals(other.sub10))
			return false;
		if (sub11 == null) {
			if (other.sub11 != null)
				return false;
		} else if (!sub11.equals(other.sub11))
			return false;
		if (sub2 == null) {
			if (other.sub2 != null)
				return false;
		} else if (!sub2.equals(other.sub2))
			return false;
		if (sub3 == null) {
			if (other.sub3 != null)
				return false;
		} else if (!sub3.equals(other.sub3))
			return false;
		if (sub4 == null) {
			if (other.sub4 != null)
				return false;
		} else if (!sub4.equals(other.sub4))
			return false;
		if (sub5 == null) {
			if (other.sub5 != null)
				return false;
		} else if (!sub5.equals(other.sub5))
			return false;
		if (sub6 == null) {
			if (other.sub6 != null)
				return false;
		} else if (!sub6.equals(other.sub6))
			return false;
		if (sub7 == null) {
			if (other.sub7 != null)
				return false;
		} else if (!sub7.equals(other.sub7))
			return false;
		if (sub8 == null) {
			if (other.sub8 != null)
				return false;
		} else if (!sub8.equals(other.sub8))
			return false;
		if (sub9 == null) {
			if (other.sub9 != null)
				return false;
		} else if (!sub9.equals(other.sub9))
			return false;
		return true;
	}
	public void setSem(int sem) {
		this.sem = sem;
	}
	

}
