package com.rudymiszcz.Model;

import com.rudymiszcz.DatabaseManager.DatabaseInitScripts;
import com.rudymiszcz.base.IBaseModel;
import com.rudymiszcz.utils.CursorExec;

import android.database.Cursor;

public class Player implements IBaseModel {

	private int id;
	private String firstName;
	private String surname;
	private int teamId;
	private int countryId;
	private int faceImageUrl;
	
	public static final String tableName = DatabaseInitScripts.playerTableName;
	
	public Player(int id, String firstName, String surname, int teamId, int countryId, int faceImageUrl) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.surname = surname;
		this.teamId = teamId;
		this.countryId = countryId;
		this.faceImageUrl = faceImageUrl;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSurname() {
		return this.surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getTeamId() {
		return teamId;
	}

	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}

	public int getLeagueId() {
		return countryId;
	}

	public void setLeagueId(int leagueId) {
		this.countryId = leagueId;
	}

	public int getFaceImageUrl() {
		return faceImageUrl;
	}

	public void setFaceImageUrl(int faceImageUrl) {
		this.faceImageUrl = faceImageUrl;
	}	
	
	@Override
	public void cursorToModel(Cursor cursor) {
		
		this.id = CursorExec.getInt(cursor, "ID");
		this.firstName = CursorExec.getString(cursor, "FIRST_NAME");
		this.surname = CursorExec.getString(cursor, "SURNAME");
		this.faceImageUrl = CursorExec.getInt(cursor, "FACE_IMAGE_URL");
		this.countryId = CursorExec.getInt(cursor, "COUNTRY_ID");
		this.teamId = CursorExec.getInt(cursor, "TEAM_ID");
	}
}
