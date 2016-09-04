package com.rudymiszcz.Model;

import com.rudymiszcz.DatabaseManager.DatabaseInitScripts;
import com.rudymiszcz.base.IBaseModel;
import com.rudymiszcz.utils.CursorExec;

import android.database.Cursor;

public class Tournament implements IBaseModel{

	private int id;
	private int rulesId;
	private int typeId;
	private boolean isStarted;
	private boolean isFinished;
	private int cupPhaseId;
	private int leagueGamesNmb;
	
	public static final String tableName = DatabaseInitScripts.tournamentTableName;
	
	public Tournament(int id, int rulesId, int typeId, boolean isStarted, boolean isFinished, int cupPhaseId,
			int leagueGamesNmb) {
		super();
		this.id = id;
		this.rulesId = rulesId;
		this.typeId = typeId;
		this.isStarted = isStarted;
		this.isFinished = isFinished;
		this.cupPhaseId = cupPhaseId;
		this.leagueGamesNmb = leagueGamesNmb;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRulesId() {
		return rulesId;
	}

	public void setRulesId(int rulesId) {
		this.rulesId = rulesId;
	}

	public int getTypeId() {
		return typeId;
	}

	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}

	public boolean isStarted() {
		return isStarted;
	}

	public void setStarted(boolean isStarted) {
		this.isStarted = isStarted;
	}

	public boolean isFinished() {
		return isFinished;
	}

	public void setFinished(boolean isFinished) {
		this.isFinished = isFinished;
	}

	public int getCupPhaseId() {
		return cupPhaseId;
	}

	public void setCupPhaseId(int cupPhaseId) {
		this.cupPhaseId = cupPhaseId;
	}

	public int getLeagueGamesNmb() {
		return leagueGamesNmb;
	}

	public void setLeagueGamesNmb(int leagueGamesNmb) {
		this.leagueGamesNmb = leagueGamesNmb;
	}
	
	@Override
	public void cursorToModel(Cursor cursor) {
		
		this.id = CursorExec.getInt(cursor, "ID");
		this.isStarted = CursorExec.getBoolean(cursor, "IS_STARTED");
		this.isFinished = CursorExec.getBoolean(cursor, "IS_FINISHED");
		this.rulesId = CursorExec.getInt(cursor, "RULES_ID");
		this.typeId = CursorExec.getInt(cursor, "TYPE_ID");
		this.cupPhaseId = CursorExec.getInt(cursor, "CUP_PHASE_ID");
		this.leagueGamesNmb = CursorExec.getInt(cursor, "LEAGUE_GAMES_NMB");
	}
}
