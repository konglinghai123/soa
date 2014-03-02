package opensoa.drools.dto;

import java.util.ArrayList;
import java.util.List;

import org.jboss.cache.pojo.annotation.Replicable;

@Replicable
public class Party {
	private String partyId;
	private String partyTypeId;
	private String partyName;
	private List<PartyContact> partyContacts;
	
	public final static String REGULAR="REGULAR";
	public final static String GOLD="GOLD";
	public final static String SILVER="SILVER";
	
	public Party() {
		partyContacts = new ArrayList<PartyContact>();
	}
	public void addPartyContact(Object obj) {
		partyContacts.add((PartyContact) obj);
	}
	
	public List getPartyContacts(){
		return partyContacts;
	}
	
	public String getPartyId() {
		return partyId;
	}
	public void setPartyId(String partyId) {

		this.partyId = partyId;
	}
	public String getPartyTypeId() {
		return partyTypeId;
	}
	public void setPartyTypeId(String partyTypeId) {
		this.partyTypeId = partyTypeId;
	}
	public String getPartyName() {
		return partyName;
	}
	public void setPartyName(String partyName) {
		this.partyName = partyName;
	}
	
}
