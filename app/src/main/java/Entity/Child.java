package Entity;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "children")
public class Child {
    @PrimaryKey(autoGenerate = true)
    public int childId;

    public String Name;
    public int age;

    //Constructor
    public Child(int childId, String name, int age) {
        this.childId = childId;
        Name = name;
        this.age = age;
    }

    //getters and setters

    public int getChildId() {
        return childId;
    }

    public void setChildId(int childId) {
        this.childId = childId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
