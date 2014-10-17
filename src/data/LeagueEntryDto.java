package data;

public class LeagueEntryDto {
	String division, playerOrTeamId,playerOrTeamName;
	boolean isFreshBlood,isHotStreak,isInactive,isVeteran;
	int leaguePoints,wins;
	MiniSeriesDto miniSeries;
	public LeagueEntryDto(String division, boolean isFreshBlood, boolean isHotStreak, boolean isInactive, boolean isVeteran, int leaguePoints, MiniSeriesDto miniSeries, String playerOrTeamId){
		this.division = division;
		this.isFreshBlood = isFreshBlood;
		this.isHotStreak = isHotStreak;
		this.isInactive = isInactive;
		this.isVeteran = isVeteran;
		this.leaguePoints = leaguePoints;
		this.miniSeries = miniSeries;
		this.playerOrTeamId = playerOrTeamId;
	}
	public String getDivision() {
		return division;
	}
	public void setDivision(String division) {
		this.division = division;
	}
	public String getPlayerOrTeamId() {
		return playerOrTeamId;
	}
	public void setPlayerOrTeamId(String playerOrTeamId) {
		this.playerOrTeamId = playerOrTeamId;
	}
	public String getPlayerOrTeamName() {
		return playerOrTeamName;
	}
	public void setPlayerOrTeamName(String playerOrTeamName) {
		this.playerOrTeamName = playerOrTeamName;
	}
	public boolean isFreshBlood() {
		return isFreshBlood;
	}
	public void setFreshBlood(boolean isFreshBlood) {
		this.isFreshBlood = isFreshBlood;
	}
	public boolean isHotStreak() {
		return isHotStreak;
	}
	public void setHotStreak(boolean isHotStreak) {
		this.isHotStreak = isHotStreak;
	}
	public boolean isInactive() {
		return isInactive;
	}
	public void setInactive(boolean isInactive) {
		this.isInactive = isInactive;
	}
	public boolean isVeteran() {
		return isVeteran;
	}
	public void setVeteran(boolean isVeteran) {
		this.isVeteran = isVeteran;
	}
	public int getLeaguePoints() {
		return leaguePoints;
	}
	public void setLeaguePoints(int leaguePoints) {
		this.leaguePoints = leaguePoints;
	}
	public int getWins() {
		return wins;
	}
	public void setWins(int wins) {
		this.wins = wins;
	}
	public MiniSeriesDto getMiniSeries() {
		return miniSeries;
	}
	public void setMiniSeries(MiniSeriesDto miniSeries) {
		this.miniSeries = miniSeries;
	}
}
