package data;

import java.util.List;

public class LeagueDto {
	List<LeagueEntryDto> entries;
	String name, participantId,queue,tier;
	
	public LeagueDto(List<LeagueEntryDto> entries, String name, String participantId, String queue, String tier){
		this.name = name;
		this.participantId = participantId;
		this.queue = queue;
		this.tier = tier;
		this.entries = entries;
	}

	public List<LeagueEntryDto> getEntries() {
		return entries;
	}

	public void setEntries(List<LeagueEntryDto> entries) {
		this.entries = entries;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getParticipantId() {
		return participantId;
	}

	public void setParticipantId(String participantId) {
		this.participantId = participantId;
	}

	public String getQueue() {
		return queue;
	}

	public void setQueue(String queue) {
		this.queue = queue;
	}

	public String getTier() {
		return tier;
	}

	public void setTier(String tier) {
		this.tier = tier;
	}
}
