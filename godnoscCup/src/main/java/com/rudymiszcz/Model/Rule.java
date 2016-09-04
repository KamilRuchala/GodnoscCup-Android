package com.rudymiszcz.Model;

import com.rudymiszcz.DatabaseManager.DatabaseInitScripts;
import com.rudymiszcz.base.IBaseModel;
import com.rudymiszcz.utils.CursorExec;

import android.database.Cursor;

public class Rule implements IBaseModel {

	private int id;
	private String name;
	private String betterTeamSql;
	private String betterScorerSql;
	
	public static final String tableName = DatabaseInitScripts.rulesTableName;
	
	public Rule(int id, String name, String betterTeamSql, String betterScorerSql) {
		super();
		this.id = id;
		this.name = name;
		this.betterTeamSql = betterTeamSql;
		this.betterScorerSql = betterScorerSql;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBetterTeamSql() {
		return betterTeamSql;
	}

	public void setBetterTeamSql(String betterTeamSql) {
		this.betterTeamSql = betterTeamSql;
	}

	public String getBetterScorerSql() {
		return betterScorerSql;
	}

	public void setBetterScorerSql(String betterScorerSql) {
		this.betterScorerSql = betterScorerSql;
	}
	
	@Override
	public void cursorToModel(Cursor cursor) {
		
		this.id = CursorExec.getInt(cursor, "ID");
		this.name = CursorExec.getString(cursor, "NAME");
		this.betterScorerSql = CursorExec.getString(cursor, "BETTER_SCORER_SQL");
		this.betterTeamSql = CursorExec.getString(cursor, "BETTER_TEAM_SQL");
	}
}
