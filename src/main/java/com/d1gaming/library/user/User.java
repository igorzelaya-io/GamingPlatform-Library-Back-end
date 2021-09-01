 package com.d1gaming.library.user;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.d1gaming.library.role.Role;
import com.d1gaming.library.team.Team;
import com.d1gaming.library.team.TeamInviteRequest;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
public class User implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@JsonProperty
	private String userId;
	
	@JsonProperty
	private String userRealName;
	
	@JsonProperty
	private String userName;
	
	@JsonProperty
	private String userPassword;
	
	@JsonProperty
	private String userEmail;
		
	@JsonProperty
	private UserStatus userStatusCode;
	
	@JsonProperty
	private List<Team> userTeams;
	
	@JsonProperty
	private Map<String,Object> userBilling;

	@JsonProperty
	private String userCountry;
	
	@JsonProperty
	private int userTokens;
	
	@JsonProperty
	private double userCash;
	
	@JsonProperty
	private Map<String, Object> userBirthDate;
	
	@JsonProperty
	private List<TeamInviteRequest> userTeamRequests;
	
	@JsonProperty
	private transient boolean hasImage;
	
	@JsonProperty
	private List<Role> userRoles = new ArrayList<>();
	
	@JsonProperty
	private List<UserTournament> userTournaments;
	
	@JsonProperty
	private List<UserChallenge> userChallenges;
	
	@JsonProperty
	private int userCodTotalWs;
	
	@JsonProperty
	private int userCodTotalLs;
	
	@JsonProperty
	private int userFifaTotalLs;
	
	@JsonProperty
	private int userFifaTotalWs;
	
	public User(){
		super();
	}
	
	public User(String userId, String userRealName, String userName ,String userPassword, String userEmail, UserStatus statusCode, List<Team> userTeam, 
			Map<String,Object> userBilling, String userCountry, int userTokens, double userCash, Map<String,Object> userBirthDate) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userRealName = userRealName;
		this.userPassword = userPassword;
		this.userEmail = userEmail;
		this.userCountry = userCountry;
		this.userStatusCode = statusCode;
		this.userCash = userCash;
		this.userTeams = userTeam;
		this.userBilling = userBilling;
		this.userBirthDate = userBirthDate;
		this.userTokens = userTokens;
	}
	
	public User(String userRealName, String userName, String userPassword, String userEmail, UserStatus userStatus, 
			    String userCountry, Map<String, Object> userBirthDate) {
		super();
		this.userRealName = userRealName;
		this.userName = userName;
		this.userPassword = userPassword;
		this.userEmail = userEmail;
		this.userStatusCode = userStatus;
		this.userCountry = userCountry;
		this.userBirthDate = userBirthDate;
	}
	
	public User(String userRealName, String userName, String userPassword, String userEmail, UserStatus userStatus, 
			    List<Team> userTeams, List<TeamInviteRequest> userTeamInvites,	
			    String userCountry, Map<String, Object> userBirthDate, double userCash, int userTokens, int userTotalWs, int userTotalLs,
			    int userFifaTotalWs, int userFifaTotalLs, List<UserTournament> userTournaments, List<UserChallenge> userChallenges) {
		this.userRealName = userRealName; 
		this.userName = userName;
		this.userPassword = userPassword;
		this.userEmail = userEmail;
		this.userStatusCode = userStatus;
		this.userCountry = userCountry;
		this.userBirthDate = userBirthDate;
		this.userCash = userCash;
		this.userTokens = userTokens;
		this.userTeams = userTeams;
		this.userTeamRequests = userTeamInvites;
		this.userCodTotalWs = userTotalWs;
		this.userCodTotalLs = userTotalLs;
		this.userFifaTotalWs = userFifaTotalWs;
		this.userFifaTotalLs = userFifaTotalLs;
		this.userTournaments = userTournaments;
		this.userChallenges = userChallenges;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
		
	public String getUserName() {
		return this.userName;
	}
	
	public void setUserRealName(String userRealName) {
		this.userRealName = userRealName;
	}
	
	public String getUserRealName() {
		return this.userRealName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	
	public Map<String,Object> getUserBilling() {
		return this.userBilling;
	}
	
	public void setUserBilling(Map<String,Object> map) {
		this.userBilling = map;
	}

	public String getUserCountry() {
		return userCountry;
	}

	public void setUserCountry(String userCountry) {
		this.userCountry = userCountry;
	}

	public int getUserTokens() {
		return userTokens;
	}

	public void setUserTokens(int userTokens) {
		this.userTokens = userTokens;
	}

	public double getUserCash() {
		return userCash;
	}

	public void setUserCash(double userCash) {
		this.userCash = userCash;
	}

	public Map<String, Object> getUserBirthDate() {
		return userBirthDate;
	}

	public void setUserBirthDate(Map<String, Object> userBirthDate) {
		this.userBirthDate = userBirthDate;
	}
	
	public void setUserRoles(List<Role> userRoles) {
		this.userRoles = userRoles;
	}
	
	public List<Role> getUserRoles(){
		return this.userRoles;
	}

	public List<Team> getUserTeams() {
		return userTeams;
	}

	public void setUserTeams(List<Team> userTeams) {
		this.userTeams = userTeams;
	}

	public List<TeamInviteRequest> getUserTeamRequests() {
		return userTeamRequests;
	}

	public void setUserTeamRequests(List<TeamInviteRequest> userTeamRequests) {
		this.userTeamRequests = userTeamRequests;
	}

	public UserStatus getUserStatusCode() {
		return userStatusCode;
	}

	public void setUserStatusCode(UserStatus userStatusCode) {
		this.userStatusCode = userStatusCode;
	}

	public int getUserCodTotalWs() {
		return userCodTotalWs;
	}

	public void setUserCodTotalWs(int userCodTotalWs) {
		this.userCodTotalWs = userCodTotalWs;
	}

	public int getUserCodTotalLs() {
		return userCodTotalLs;
	}

	public void setUserCodTotalLs(int userCodTotalLs) {
		this.userCodTotalLs = userCodTotalLs;
	}

	public int getUserFifaTotalLs() {
		return userFifaTotalLs;
	}

	public void setUserFifaTotalLs(int userFifaTotalLs) {
		this.userFifaTotalLs = userFifaTotalLs;
	}

	public int getUserFifaTotalWs() {
		return userFifaTotalWs;
	}

	public void setUserFifaTotalWs(int userFifaTotalWs) {
		this.userFifaTotalWs = userFifaTotalWs;
	}

	public List<UserTournament> getUserTournaments() {
		return userTournaments;
	}

	public void setUserTournaments(List<UserTournament> userTournaments) {
		this.userTournaments = userTournaments;
	}

	public List<UserChallenge> getUserChallenges() {
		return userChallenges;
	}

	public void setUserChallenges(List<UserChallenge> userChallenges) {
		this.userChallenges = userChallenges;
	}

	public boolean isHasImage() {
		return hasImage;
	}

	public void setHasImage(boolean hasImage) {
		this.hasImage = hasImage;
	}
}