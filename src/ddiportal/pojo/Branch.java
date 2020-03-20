package ddiportal.pojo;

public class Branch {

	private String bid;
	private String bname;
	
	
	
	/**
	 * @param bid
	 * @param bname
	 */
	public Branch(String bid, String bname) {
		super();
		this.bid = bid;
		this.bname = bname;
	}

	@Override
	public String toString() {
		return "Branch [bid=" + bid + ", bname=" + bname + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bid == null) ? 0 : bid.hashCode());
		result = prime * result + ((bname == null) ? 0 : bname.hashCode());
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
		Branch other = (Branch) obj;
		if (bid == null) {
			if (other.bid != null)
				return false;
		} else if (!bid.equals(other.bid))
			return false;
		if (bname == null) {
			if (other.bname != null)
				return false;
		} else if (!bname.equals(other.bname))
			return false;
		return true;
	}

	public String getBid() {
		return bid;
	}

	public void setBid(String bid) {
		this.bid = bid;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public Branch() {
		// TODO Auto-generated constructor stub
	}

}
