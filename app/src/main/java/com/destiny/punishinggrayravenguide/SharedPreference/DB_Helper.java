package com.destiny.punishinggrayravenguide.SharedPreference;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
public class DB_Helper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "pgrdb.db";
    private static final int DATABASE_VERSION = 1;
    //ADS
    public static final String TABLE_NAME_ADS = "ads";
    public static final String COLUMN_COUNT = "count";
    //Account
    public static final String TABLE_NAME_ACCOUNT = "account";
    public static final String COLUMN_USERNAME = "username";
    public static final String COLUMN_PASSWORD = "password";
    public static final String COLUMN_NAME = "name";
    public static final String COLUMN_TOKEN = "token";
    public static final String COLUMN_LEVEL = "level";
    public static final String COLUMN_PROFILE = "profile";
    public static final String COLUMN_ID_KELAS = "id_kelas";
    public static final String COLUMN_ID = "ID";

    //Eskul
    public static final String TABLE_NAME_ESKUL = "eskul";
    public static final String COLUMN_ESKUL = "column_eskul";

    public DB_Helper(Context context){super(
            context,DATABASE_NAME,null,DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE "+TABLE_NAME_ADS+" (" +
                COLUMN_COUNT+" TEXT NOT NULL);"
        );
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME_ADS);
        this.onCreate(db);
    }
    //Save
    public void SaveCountADS(String count){
        SQLiteDatabase db =this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(COLUMN_COUNT, count);
        db.insert(TABLE_NAME_ADS,null,values);
        db.close();
    }

    //CHECKER
    public Cursor checkADS(){
        SQLiteDatabase db = this.getWritableDatabase();
        String query ="SELECT * FROM "+TABLE_NAME_ADS;
        Cursor cursor = db.rawQuery(query,null);
        return cursor;
    }
    //delete
    public void ResetADS(){
        SQLiteDatabase db = this.getWritableDatabase();
        db.execSQL("DELETE FROM "+TABLE_NAME_ADS+"");
    }
}
