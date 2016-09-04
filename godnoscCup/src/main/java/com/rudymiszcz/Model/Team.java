package com.rudymiszcz.Model;

import com.rudymiszcz.DatabaseManager.DatabaseInitScripts;
import com.rudymiszcz.base.IBaseModel;
import com.rudymiszcz.utils.CursorExec;

import android.database.Cursor;

public class Team implements IBaseModel {

	private int id;
	private String name;
	private int leagueId;
	private int countryId;
	private String logoUrl;
	
	public static final String tableName = DatabaseInitScripts.teamTableName;
	
	public Team(int id, String name, int leagueId, int countryId, String logoUrl) {
		super();
		this.id = id;
		this.name = name;
		this.leagueId = leagueId;
		this.countryId = countryId;
		this.logoUrl = logoUrl;
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

	public int getLeagueId() {
		return leagueId;
	}

	public void setLeagueId(int leagueId) {
		this.leagueId = leagueId;
	}

	public int getCountryId() {
		return countryId;
	}

	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}

	public String getLogoUrl() {
		return this.logoUrl;
	}

	public void setLogoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
	}
		
	@Override
	public void cursorToModel(Cursor cursor) {
		
		this.id = CursorExec.getInt(cursor, "ID");
		this.name = CursorExec.getString(cursor, "NAME");
		this.logoUrl = CursorExec.getString(cursor, "LOGO_URL");
		this.leagueId = CursorExec.getInt(cursor, "LEAGUE_ID");
		this.countryId = CursorExec.getInt(cursor, "COUNTRY_ID");
	}
}
