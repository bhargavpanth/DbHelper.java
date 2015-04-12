// write your package name here
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DbHelper extends SQLiteOpenHelper{
	public static String DB_NAME= "name_of_your_db";
	public static int DB_VERSION=1;
	public static String createTable = "CREATE TABLE db_name(attributes);";
	public static String updateQuery = "UPDATE query"
	public DbHelper(Context context) {
		super(context, DB_NAME, null, DB_VERSION);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		db.execSQL(createTable);
		//If you have any other tables to be created, execute the query here
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int arg1, int arg2) {
		// TODO Auto-generated method stub
		try{
			db.execSQL(updateQuery);
		}catch(SQLiteException e){
			Log.d("Tag", e.toString());
		}
	}

}