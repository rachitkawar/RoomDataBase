package org.akshanshgusain.roomdatabase;
/*
* This interface is the Data Object Access
*  Defines all the operations methods inside this interface  (Selection, Insertion, deletion, updation ))*/

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

@Dao //<-------------- annotaton
public interface MyDao {

    @Insert
    public void addUser(User user);

    @Query("select * from User")
    public List<User> getUsers();

    @Delete
    public void deleteUser(User user);



}
