package ddiportal.pojo;

public class Login {

	
	private String enrollment;
	private String password;
	
	public Login() {
	
		// TODO Auto-generated constructor stub
	}

	public String getEnrollment() {
		return enrollment;
	}

	public void setEnrollment(String enrollment) {
		this.enrollment = enrollment;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((enrollment == null) ? 0 : enrollment.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
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
		Login other = (Login) obj;
		if (enrollment == null) {
			if (other.enrollment != null)
				return false;
		} else if (!enrollment.equals(other.enrollment))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Login [enrollment=" + enrollment + ", password=" + password + "]";
	}

	/**
	 * @param enrollment
	 * @param password
	 */
	public Login(String enrollment, String password) {
		super();
		this.enrollment = enrollment;
		this.password = password;
	}

	

}
