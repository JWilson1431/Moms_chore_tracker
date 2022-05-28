package DAO;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import Entity.Chore;

@Dao
public interface ChoreDAO {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insert(Chore chore);

    @Update
    void update(Chore chore);

    @Delete
    void delete(Chore chore);

    @Query("SELECT * FROM chores ORDER BY choreId ASC")
    List<Chore> getAllChores();
}
