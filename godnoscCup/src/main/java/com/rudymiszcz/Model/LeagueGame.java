package com.rudymiszcz.Model;

import com.rudymiszcz.DatabaseManager.DatabaseInitScripts;
import com.rudymiszcz.base.IBaseModel;
import com.rudymiszcz.utils.CursorExec;

import android.database.Cursor;

public class LeagueGame implements IBaseModel {

	private int id;
	private int teamOneId;
	private int teamTwoId;
	private int teamOneGoals;
	private int teamTwoGoals;
	private int tournamentId;
	
	public static final String tableName = DatabaseInitScripts.leagueGameTableName;
	
	public LeagueGame(int id, int teamOneId, int teamTwoId, int teamOneGoals, int teamTwoGoals, int tournamentId) {
		super();
		this.id = id;
		this.teamOneId = teamOneId;
		this.teamTwoId = teamTwoId;
		this.teamOneGoals = teamOneGoals;
		this.teamTwoGoals = teamTwoGoals;
		this.tournamentId = tournamentId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTeamOneId() {
		return teamOneId;
	}

	public void setTeamOneId(int teamOneId) {
		this.teamOneId = teamOneId;
	}

	public int getTeamTwoId() {
		return teamTwoId;
	}

	public void setTeamTwoId(int teamTwoId) {
		this.teamTwoId = teamTwoId;
	}

	public int getTeamOneGoals() {
		return teamOneGoals;
	}

	public void setTeamOneGoals(int teamOneGoals) {
		this.teamOneGoals = teamOneGoals;
	}

	public int getTeamTwoGoals() {
		return teamTwoGoals;
	}

	public void setTeamTwoGoals(int teamTwoGoals) {
		this.teamTwoGoals = teamTwoGoals;
	}

	public int getTournamentId() {
		return tournamentId;
	}

	public void setTournamentId(int tournamentId) {
		this.tournamentId = tournamentId;
	}
	
	@Override
	public void cursorToModel(Cursor cursor) {
		
		this.id = CursorExec.getInt(cursor, "ID");
		this.teamOneId = CursorExec.getInt(cursor, "TEAM_ONE");
		this.teamTwoId = CursorExec.getInt(cursor, "TEAM_TWO");
		this.tournamentId = CursorExec.getInt(cursor, "CUP_PHASE_ID");
		this.teamOneGoals = CursorExec.getInt(cursor, "TEAM_ONE_GOALS");
		this.teamTwoGoals = CursorExec.getInt(cursor, "TEAM_TWO_GOALS");
	}
}
