package com.rudymiszcz.Model;

import com.rudymiszcz.DatabaseManager.DatabaseInitScripts;
import com.rudymiszcz.base.IBaseModel;
import com.rudymiszcz.utils.CursorExec;

import android.database.Cursor;

public class CupPair implements IBaseModel {

	private int id;
	private int teamOneId;
	private int teamTwoId;
	private int cupPhaseId;
	private int teamOneGoals;
	private int teamTwoGoals;
	
	public static final String tableName = DatabaseInitScripts.cupPairTableName;
	
	public CupPair(int id, int teamOneId, int teamTwoId, int cupPhaseId, int teamOneGoals, int teamTwoGoals) {
		super();
		this.id = id;
		this.teamOneId = teamOneId;
		this.teamTwoId = teamTwoId;
		this.cupPhaseId = cupPhaseId;
		this.teamOneGoals = teamOneGoals;
		this.teamTwoGoals = teamTwoGoals;
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

	public int getCupPhaseId() {
		return cupPhaseId;
	}

	public void setCupPhaseId(int cupPhaseId) {
		this.cupPhaseId = cupPhaseId;
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
	
	@Override
	public void cursorToModel(Cursor cursor) {
		
		this.id = CursorExec.getInt(cursor, "ID");
		this.teamOneId = CursorExec.getInt(cursor, "TEAM_ONE");
		this.teamTwoId = CursorExec.getInt(cursor, "TEAM_TWO");
		this.cupPhaseId = CursorExec.getInt(cursor, "CUP_PHASE_ID");
		this.teamOneGoals = CursorExec.getInt(cursor, "TEAM_ONE_GOALS");
		this.teamTwoGoals = CursorExec.getInt(cursor, "TEAM_TWO_GOALS");
	}
}
