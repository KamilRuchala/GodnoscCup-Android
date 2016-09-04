package com.rudymiszcz.Model;

import com.rudymiszcz.DatabaseManager.DatabaseInitScripts;
import com.rudymiszcz.base.IBaseModel;
import com.rudymiszcz.utils.CursorExec;

import android.database.Cursor;

public class TeamTournament implements IBaseModel{

	private int id;
	private int teamId;
	private int cupPhaseId;
	private boolean isEliminated;
	private int points;
	private int goalsPlus;
	private int goalsMinus;
	
	public static final String tableName = DatabaseInitScripts.teamTournamentRelTableName;
	
	public TeamTournament(int id, int teamId, int cupPhaseId, boolean isEliminated, int points, int goalsPlus,
			int goalsMinus) {
		super();
		this.id = id;
		this.teamId = teamId;
		this.cupPhaseId = cupPhaseId;
		this.isEliminated = isEliminated;
		this.points = points;
		this.goalsPlus = goalsPlus;
		this.goalsMinus = goalsMinus;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTeamId() {
		return teamId;
	}

	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}

	public int getCupPhaseId() {
		return cupPhaseId;
	}

	public void setCupPhaseId(int cupPhaseId) {
		this.cupPhaseId = cupPhaseId;
	}

	public boolean isEliminated() {
		return isEliminated;
	}

	public void setEliminated(boolean isEliminated) {
		this.isEliminated = isEliminated;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	public int getGoalsPlus() {
		return goalsPlus;
	}

	public void setGoalsPlus(int goalsPlus) {
		this.goalsPlus = goalsPlus;
	}

	public int getGoalsMinus() {
		return goalsMinus;
	}

	public void setGoalsMinus(int goalsMinus) {
		this.goalsMinus = goalsMinus;
	}
	
	@Override
	public void cursorToModel(Cursor cursor) {
		
		this.id = CursorExec.getInt(cursor, "ID");
		this.teamId = CursorExec.getInt(cursor, "TEAM_ID");
		this.cupPhaseId = CursorExec.getInt(cursor, "CUP_PHASE_ID");
		this.goalsPlus = CursorExec.getInt(cursor, "GOALS_PLUS");
		this.goalsMinus = CursorExec.getInt(cursor, "GOALS_MINUS");
		this.points = CursorExec.getInt(cursor, "POINTS");
		this.isEliminated = CursorExec.getBoolean(cursor, "IS_ELIMINATED");
	}
}
