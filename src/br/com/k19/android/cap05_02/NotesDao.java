package br.com.k19.android.cap05_02;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

public class NotesDao {

	private SQLiteDatabase database;
	private String[] columns = { CustomSQLiteOpenHelper.COLUMN_ID,
			CustomSQLiteOpenHelper.COLUMN_NOTES };
	private CustomSQLiteOpenHelper sqliteOpenHelper;
	
	public NotesDao(Context context){
		sqliteOpenHelper = new CustomSQLiteOpenHelper(context);
	}
	public void open() throws SQLException{
		database = sqliteOpenHelper.getWritableDatabase();
	}
	public void close(){
		sqliteOpenHelper.close();
	}
}
