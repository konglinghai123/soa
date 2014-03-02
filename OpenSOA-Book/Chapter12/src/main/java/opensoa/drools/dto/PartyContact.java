package opensoa.drools.dto;


import org.jboss.cache.pojo.annotation.Replicable;

@Replicable
public class PartyContact {
	private String fname;
	private String lname;
	private String email;
	private String partyContactId;
	
	public String getPartyContactId() {
		return partyContactId;
	}
	public void setPartyContactId(String partyContactId) {
		this.partyContactId = partyContactId;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
