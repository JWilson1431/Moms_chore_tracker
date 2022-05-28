package Database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import DAO.ChildDAO;
import Entity.Child;

@Database(entities = {Child.class}, version=5, exportSchema = false)
public abstract class ChoreTrackerDatabaseBuilder extends RoomDatabase {
    public abstract ChildDAO childDAO();

    private static volatile ChoreTrackerDatabaseBuilder INSTANCE;

    static ChoreTrackerDatabaseBuilder getDatabase(final Context context){
        if(INSTANCE==null){
            synchronized (ChoreTrackerDatabaseBuilder.class) {
                if(INSTANCE==null){
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),ChoreTrackerDatabaseBuilder.class, "myChoreTrackerDatabase.db")
                            .fallbackToDestructiveMigration()
                            .build();
                }
            }
        }
        return INSTANCE;
    }
}
