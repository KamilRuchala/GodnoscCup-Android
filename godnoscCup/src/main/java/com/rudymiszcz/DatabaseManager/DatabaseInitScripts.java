package com.rudymiszcz.DatabaseManager;

public class DatabaseInitScripts {

	public static final String database_version = "v1.0";
	
	public static final String tournamentTableName = "TOURNAMENT";
	public static final String rulesTableName = "RULE";
	public static final String typeTableName = "TYPE";
	public static final String teamTournamentRelTableName = "TEAM_TOURNAMENT_REL";
	public static final String cupPhaseTableName = "CUP_PHASE";
	public static final String teamTableName = "TEAM";
	public static final String playerTableName = "PLAYER";
	public static final String leagueGameTableName = "LEAGUE_GAME";
	public static final String playerStatsTableName = "PLAYER_STATS";
	public static final String cupPairTableName = "CUP_PAIR";
	public static final String leagueTableName = "LEAGUE";
	public static final String countryTableName = "COUNTRY";
	
	public static final String createTournamentTable = "CREATE TABLE TOURNAMENT("
			+ "ID INT PRIMARY KEY NOT NULL,"
			+ "NAME TEXT NOT NULL,"
			+ "TYPE_ID INT NOT NULL,"
			+ "IS_STARTED INT NOT NULL,"
			+ "IS_FINISHED INT NOT NULL,"
			+ "CUP_PHASE_ID INT,"
			+ "LEAGUE_GAMES_NMB INT"
			+ ");";
	
	public static final String createRulesTable = "CREATE TABLE " + tournamentTableName + "("
			+ "ID INT PRIMARY_KEY NOT NULL,"
			+ "NAME TEXT NOT NULL,"
			+ "BETTER_TEAM_SQL TEXT NOT NULL,"
			+ "BETTER_SCORER_SQL TEXT NOT NULL"
			+ ");";
	
	public static final String createTypeTable = "CREATE TABLE " + typeTableName + "("
			+ "ID INT PRIMARY_KEY NOT NULL,"
			+ "NAME TEXT NOT NULL"
			+ ");";
	
	public static final String createTeamTournamentRelationTable = "CREATE TABLE " + teamTournamentRelTableName + "("
			+ "ID INT PRIMARY_KEY NOT NULL,"
			+ "TEAM_ID INT NOT NULL,"
			+ "TOURNAMENT_ID INT NOT NULL,"
			+ "CUP_PAIR_ID INT,"
			+ "IS_ELIMINATED INT,"
			+ "POINTS INT,"
			+ "INT GOALS_PLUS,"
			+ "INT GOALS_MINUS"
			+ ");";
	
	public static final String createCupPairTable = "CREATE TABLE " + cupPairTableName + "("
			+ "ID INT PRIMARY_KEY NOT NULL,"
			+ "TEAM_ONE INT NOT NULL,"
			+ "TEAM_TWO INT NOT NULL,"
			+ "CUP_PHASE_ID INT NOT NULL,"
			+ "TEAM_ONE_GOALS INT NOT NULL,"
			+ "TEAM_TWO_GOALS NOT NULL"
			+ ");";
	
	public static final String createCupPhaseTable = "CREATE TABLE " + cupPhaseTableName + "("
			+ "ID INT PRIMARY_KEY NOT NULL,"
			+ "LEVEL INT NOT NULL,"
			+ "IS_FINAL INT NOT NULL,"
			+ "FINAL_GAMES_NMB INT NOT NULL,"
			+ "OTHER_GAMES_NMB INT NOT NULL"
			+ ");";
	
	public static final String createTeamTable = "CREATE TABLE " + teamTableName + "("
			+ "ID INT PRIMARY_KEY NOT NULL,"
			+ "NAME TEXT NOT NULL,"
			+ "LEAGUE_ID INT,"
			+ "COUNTRY_ID INT,"
			+ "LOGO_IMAGE_URL"
			+ ");";
	
	public static final String createPlayerTable = "CREATE TABLE " + playerTableName + "("
			+ "ID INT PRIMARY_KEY NOT NULL,"
			+ "FIRST_NAME TEXT NOT NULL,"
			+ "SURNAME TEXT NOT NULL,"
			+ "TEAM_ID INT NOT NULL,"
			+ "COUNTRY_ID ID NOT NULL,"
			+ "FACE_IMAGE_URL TEXT"
			+ ");";
	
	public static final String createLeagueGameTable = "CREATE TABLE " + leagueGameTableName + "("
			+ "ID INT PRIMARY_KEY NOT NULL,"
			+ "TEAM_ONE_ID INT NOT NULL,"
			+ "TEAM_ONE_TWO INT NOT NULL,"
			+ "TEAM_ONE_GOALS INT NOT NULL,"
			+ "TEAM_TWO_GOALS INT NOT NULL,"
			+ "TOURNAMENT_ID INT NOT NULL"
			+ ");";
	
	public static final String createPlayerStatsTable = "CREATE TABLE " + playerStatsTableName + "("
			+ "ID INT PRIMARY_KEY NOT NULL,"
			+ "PLAYER_ID INT NOT NULL,"
			+ "GOALS INT NOT NULL,"
			+ "ASSISTS INT NOT NULL,"
			+ "YELLOW_CARDS INT NOT NULL,"
			+ "RED_CARDS INT NOT NULL,"
			+ "TOURNAMENT_ID INT NOT NULL,"
			+ "LEAGUE_GAME_ID INT,"
			+ "CUP_PAIR_ID"
			+ ");";
	
	public static final String createLeagueTable = "CREATE TABLE " + leagueTableName + "("
			+ "ID INT PRIMARY_KEY NOT NULL,"
			+ "NAME TEXT NOT NULL"
			+ ");";
	
	public static final String createCountryTable = "CREATE TABLE " + countryTableName + "("
			+ "ID INT PRIMARY_KEY NOT NULL,"
			+ "NAME TEXT NOT NULL,"
			+ "FLAG_URL TEXT"
			+ ");";
}
