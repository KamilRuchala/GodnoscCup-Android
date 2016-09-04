package com.rudymiszcz.Model;

import com.rudymiszcz.DatabaseManager.DatabaseInitScripts;
import com.rudymiszcz.base.IBaseModel;
import com.rudymiszcz.utils.CursorExec;

import android.database.Cursor;

public class PlayerStats implements IBaseModel {

	private int id;
	private int playerId;
	private int goals;
	private int assists;
	private int yellowCards;
	private int redCards;
	private int tournamentId;
	private int cupPairId;
	private int leagueGameId;
	
	public static final String tableName = DatabaseInitScripts.playerStatsTableName;
	
	public PlayerStats(int id, int playerId, int goals, int assists, int yellowCards, int redCards, int tournamentId,
			int cupPairId, int leagueGameId) {
		super();
		this.id = id;
		this.playerId = playerId;
		this.goals = goals;
		this.assists = assists;
		this.yellowCards = yellowCards;
		this.redCards = redCards;
		this.tournamentId = tournamentId;
		this.cupPairId = cupPairId;
		this.leagueGameId = leagueGameId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public int getGoals() {
		return goals;
	}

	public void setGoals(int goals) {
		this.goals = goals;
	}

	public int getAssists() {
		return assists;
	}

	public void setAssists(int assists) {
		this.assists = assists;
	}

	public int getYellowCards() {
		return yellowCards;
	}

	public void setYellowCards(int yellowCards) {
		this.yellowCards = yellowCards;
	}

	public int getRedCards() {
		return redCards;
	}

	public void setRedCards(int redCards) {
		this.redCards = redCards;
	}

	public int getTournamentId() {
		return tournamentId;
	}

	public void setTournamentId(int tournamentId) {
		this.tournamentId = tournamentId;
	}

	public int getCupPairId() {
		return cupPairId;
	}

	public void setCupPairId(int cupPairId) {
		this.cupPairId = cupPairId;
	}

	public int getLeagueGameId() {
		return leagueGameId;
	}

	public void setLeagueGameId(int leagueGameId) {
		this.leagueGameId = leagueGameId;
	}
	
	@Override
	public void cursorToModel(Cursor cursor) {
		
		this.id = CursorExec.getInt(cursor, "ID");
		this.playerId = CursorExec.getInt(cursor, "PLAYER_ID");
		this.goals = CursorExec.getInt(cursor, "GOALS");
		this.assists = CursorExec.getInt(cursor, "ASSISTS");
		this.yellowCards = CursorExec.getInt(cursor, "YELLOW_CARDS");
		this.redCards = CursorExec.getInt(cursor, "RED_CARDS");
		this.tournamentId = CursorExec.getInt(cursor, "TOURNAMENT_ID");
		this.leagueGameId = CursorExec.getInt(cursor, "LEAGUE_GAME_ID");
		this.cupPairId = CursorExec.getInt(cursor, "CUP_PAIR_ID");
	}
}
