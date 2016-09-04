package com.rudymiszcz.Model;

import com.rudymiszcz.DatabaseManager.DatabaseInitScripts;
import com.rudymiszcz.base.IBaseModel;
import com.rudymiszcz.utils.CursorExec;

import android.database.Cursor;

public class CupPhase implements IBaseModel {

	private int id;
	private int level;
	private boolean isFinal;
	private int finalGamesCount;
	private int otherGamesCount;
	
	public static final String tableName = DatabaseInitScripts.cupPhaseTableName;
	
	public CupPhase(int id, int level, boolean isFinal, int finalGamesCount, int otherGamesCount) {
		super();
		this.id = id;
		this.level = level;
		this.isFinal = isFinal;
		this.finalGamesCount = finalGamesCount;
		this.otherGamesCount = otherGamesCount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public boolean isFinal() {
		return isFinal;
	}

	public void setFinal(boolean isFinal) {
		this.isFinal = isFinal;
	}

	public int getFinalGamesCount() {
		return finalGamesCount;
	}

	public void setFinalGamesCount(int finalGamesCount) {
		this.finalGamesCount = finalGamesCount;
	}

	public int getOtherGamesCount() {
		return this.otherGamesCount;
	}

	public void setOtherGamesCount(int otherGamesCount) {
		this.otherGamesCount = otherGamesCount;
	}
	
	@Override
	public void cursorToModel(Cursor cursor) {
		
		this.id = CursorExec.getInt(cursor, "ID");
		this.isFinal = CursorExec.getBoolean(cursor, "IS_FINAL");
		this.level = CursorExec.getInt(cursor, "LEVEL");
		this.finalGamesCount = CursorExec.getInt(cursor, "FINAL_GAMES_NMB");
		this.otherGamesCount = CursorExec.getInt(cursor, "OTHER_GAMES_NMB");
	}
}
