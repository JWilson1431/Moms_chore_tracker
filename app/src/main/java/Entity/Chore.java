package Entity;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "chores")
public class Chore {

    @PrimaryKey(autoGenerate = true)
    private int choreId;

    private String choreName;
    private int spinsPerChore;

    //constructor

    public Chore(int choreId, String choreName, int spinsPerChore) {
        this.choreId = choreId;
        this.choreName = choreName;
        this.spinsPerChore = spinsPerChore;
    }

    //getters and setters

    public int getChoreId() {
        return choreId;
    }

    public void setChoreId(int choreId) {
        this.choreId = choreId;
    }

    public String getChoreName() {
        return choreName;
    }

    public void setChoreName(String choreName) {
        this.choreName = choreName;
    }

    public int getSpinsPerChore() {
        return spinsPerChore;
    }

    public void setSpinsPerChore(int spinsPerChore) {
        this.spinsPerChore = spinsPerChore;
    }
}
