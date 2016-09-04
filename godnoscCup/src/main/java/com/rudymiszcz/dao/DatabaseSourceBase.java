package com.rudymiszcz.dao;

import com.rudymiszcz.DatabaseManager.DatabaseHelper;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

public class DatabaseSourceBase {

	protected SQLiteDatabase database;
    private DatabaseHelper dbHelper;
    
    public DatabaseSourceBase(Context context) {
    	
    	dbHelper = new DatabaseHelper(context);
    }
    
    public void open() throws SQLException {
    	
        database = dbHelper.getWritableDatabase();
	}
	
	public void close() {
		
	    dbHelper.close();
	}
	
}
