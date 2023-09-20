package com.example.fonclaraics26011machineproblem2;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class DatabaseConnect extends SQLiteOpenHelper {

    private Context context;
    private static final String DATABASE_NAME = "ExpenseTracker.db";
    private static final int DATABASE_VERSION = 1;
    private static final String TABLE_NAME = "expenses";
    private static final String COLUMN_ID = "_id";
    private static final String COLUMN_TITLE = "exp_title";
    private static final String COLUMN_CATEGORY = "exp_category";
    private static final String COLUMN_AMOUNT = "exp_amount";

    public DatabaseConnect(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String query =
                "CREATE TABLE " + TABLE_NAME + " (" +
                        COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                        COLUMN_TITLE + " TEXT, " +
                        COLUMN_CATEGORY + " TEXT, " +
                        COLUMN_AMOUNT + " DOUBLE);";
        db.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }

    void addBook(String title, String category, double amount) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();

        cv.put(COLUMN_TITLE, title);
        cv.put(COLUMN_CATEGORY, category);
        cv.put(COLUMN_AMOUNT, amount);
       long result = db.insert(TABLE_NAME, null, cv);
       if (result==-1) {
           Toast.makeText(context, "Failed", Toast.LENGTH_LONG).show();
       } else {
           Toast.makeText(context, "Success", Toast.LENGTH_LONG).show();
       }
    }
}
