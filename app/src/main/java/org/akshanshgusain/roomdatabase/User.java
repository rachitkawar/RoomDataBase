package org.akshanshgusain.roomdatabase;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity   //<---- This means that this class is a table in room database
// If you want to use different name for the table you need to pass it as a property of @Entity
//@Entity(tableName="Users_1_newName")
public class User   {   //<--------- the table name is same as the entity class name
     //Every entity must cointains Atleast one Primary key
    //By default room uses variables nameS(id, name, email) as column names

    @PrimaryKey  //<---- this annotation makes  is the primary key
      private int id;

    @ColumnInfo(name="user_name")  //<----- this annotion is used for assignin custom names to the columns
      private String name;

      private String email;
      //to access the above fields you need to define getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
