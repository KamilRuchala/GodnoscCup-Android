package com.rudymiszcz.Model;

import com.rudymiszcz.DatabaseManager.DatabaseInitScripts;
import com.rudymiszcz.base.IBaseModel;
import com.rudymiszcz.utils.CursorExec;

import android.database.Cursor;

public class Country implements IBaseModel {

	private int id;
	private String name;
	private String flag_url;
	
	public static final String tableName = DatabaseInitScripts.countryTableName;
	
	public Country(int id, String name, String flag_url) {
		super();
		this.id = id;
		this.name = name;
		this.flag_url = flag_url;
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

	public String getFlag_url() {
		return flag_url;
	}

	public void setFlag_url(String flag_url) {
		this.flag_url = flag_url;
	}

	@Override
	public void cursorToModel(Cursor cursor) {
		
		this.id = CursorExec.getInt(cursor, "ID");
		this.name = CursorExec.getString(cursor, "NAME");
		this.flag_url = CursorExec.getString(cursor, "FLAG_URL");
	}
	
}
