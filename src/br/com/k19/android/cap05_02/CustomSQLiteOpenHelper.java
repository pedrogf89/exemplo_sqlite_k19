package br.com.k19.android.cap05_02;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class CustomSQLiteOpenHelper extends SQLiteOpenHelper {

	public static final String TABLE_NOTES = "notes";
	public static final String COLUMN_ID = "_id";
	public static final String COUMN_NOTES = "note";

	private static final String DATABASE_NAME = "notes.db";
	private static final int DATABASE_VERSION = 1;

	// Database creation sql statement

	private static final String DATABASE_CREATE = "create table " + TABLE_NOTES
			+ "(" + COLUMN_ID + " integer primary key autoincrement, "
			+ COUMN_NOTES + " text not null);";

	public CustomSQLiteOpenHelper(Context context) {
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		db.execSQL(DATABASE_CREATE);

	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub
		db.execSQL("DROP TABLE IF EXIXTS " + TABLE_NOTES);
		onCreate(db);

	}

}
