package org.akshanshgusain.roomdatabase;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;
//   This class must be a abstract class and must extends RoomDatabase
//This class represents the Database

@Database(entities = {User.class}, version =1 )//<----------- iMportant Attributes
public abstract class MyAppDataBase extends RoomDatabase {
    //There must be a method that returns a object of DOA
      public abstract MyDao MyDoa();

}
