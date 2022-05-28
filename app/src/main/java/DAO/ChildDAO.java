package DAO;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import Entity.Child;

import java.util.List;

@Dao
public interface ChildDAO {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insert(Child child);

    @Update
    void update(Child child);

    @Delete
    void delete(Child child);

    @Query("SELECT * FROM children ORDER BY childId ASC")
    List<Child> getAllChildren();


}
