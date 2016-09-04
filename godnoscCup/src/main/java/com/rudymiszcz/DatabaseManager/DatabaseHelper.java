package com.rudymiszcz.DatabaseManager;

import java.io.File;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {

	private static final String DbName = "GodnoscData";
	public static final int database_version = 1;
	
	public DatabaseHelper(Context context) {
		
        super(context, DbName, null, database_version);
    }
	
	@Override
    public void onCreate(SQLiteDatabase db) {
 
        // creating required tables
        db.execSQL(DatabaseInitScripts.createTournamentTable);
        db.execSQL(DatabaseInitScripts.createRulesTable);
        db.execSQL(DatabaseInitScripts.createTypeTable);
        db.execSQL(DatabaseInitScripts.createCupPhaseTable);
        db.execSQL(DatabaseInitScripts.createTeamTournamentRelationTable);
        db.execSQL(DatabaseInitScripts.createPlayerStatsTable);
        db.execSQL(DatabaseInitScripts.createCupPairTable);
        db.execSQL(DatabaseInitScripts.createLeagueGameTable);
        db.execSQL(DatabaseInitScripts.createTeamTable);
        db.execSQL(DatabaseInitScripts.createPlayerTable);
        db.execSQL(DatabaseInitScripts.createCountryTable);
        db.execSQL(DatabaseInitScripts.createLeagueTable);
    }
 
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // on upgrade drop older tables
        db.execSQL("DROP TABLE IF EXISTS " + DatabaseInitScripts.tournamentTableName);
        db.execSQL("DROP TABLE IF EXISTS " + DatabaseInitScripts.rulesTableName);
        db.execSQL("DROP TABLE IF EXISTS " + DatabaseInitScripts.typeTableName);
        db.execSQL("DROP TABLE IF EXISTS " + DatabaseInitScripts.cupPhaseTableName);
        db.execSQL("DROP TABLE IF EXISTS " + DatabaseInitScripts.teamTournamentRelTableName);
        db.execSQL("DROP TABLE IF EXISTS " + DatabaseInitScripts.playerStatsTableName);
        db.execSQL("DROP TABLE IF EXISTS " + DatabaseInitScripts.cupPairTableName);
        db.execSQL("DROP TABLE IF EXISTS " + DatabaseInitScripts.leagueGameTableName);
        db.execSQL("DROP TABLE IF EXISTS " + DatabaseInitScripts.teamTableName);
        db.execSQL("DROP TABLE IF EXISTS " + DatabaseInitScripts.playerTableName);
        db.execSQL("DROP TABLE IF EXISTS " + DatabaseInitScripts.countryTableName);
        db.execSQL("DROP TABLE IF EXISTS " + DatabaseInitScripts.leagueTableName);
 
        // create new tables
        onCreate(db);
    }
    
    public static boolean checkDatabaseExist(Context context, String dbName) {
    	
        File dbFile = context.getDatabasePath(dbName);
        return dbFile.exists();
    }
}
