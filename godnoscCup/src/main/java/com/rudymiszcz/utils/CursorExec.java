package com.rudymiszcz.utils;

import android.database.Cursor;

public class CursorExec {

	public static String getString(Cursor cursor, String columnName){
		
		int columnIndex = cursor.getColumnIndex(columnName);
		return cursor.getString(columnIndex);
	}
	
	public static int getInt(Cursor cursor, String columnName){
		
		int columnIndex = cursor.getColumnIndex(columnName);
		return cursor.getInt(columnIndex);
	}
	
	public static double getDouble(Cursor cursor, String columnName){
		
		int columnIndex = cursor.getColumnIndex(columnName);
		return cursor.getDouble(columnIndex);
	}
	
	public static boolean getBoolean(Cursor cursor, String columnName){
		
		int columnIndex = cursor.getColumnIndex(columnName);
		return (cursor.getInt(columnIndex) == 1);
	}
}
