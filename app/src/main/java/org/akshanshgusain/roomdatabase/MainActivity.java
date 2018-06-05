package org.akshanshgusain.roomdatabase;

import android.arch.persistence.room.Room;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
/*Room DB need 3 main components 1.An Entity 2.A DOA 3. A Database class that extends room database
* This projrct will 1 table called users and users will have 3 columns id, name and email.
* 1. create an entity class -REpresents a table in room database
*
*
*
*
* */

public class MainActivity extends AppCompatActivity {
    public static FragmentManager fragmentManager;
    public static MyAppDataBase myAppDataBase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragmentManager=getSupportFragmentManager();

        //Initilizing the database object
        //The room databse queries must run on seperate thread!!!!!!!!!!  <--------------For demo purpose only we use  " allowMainThreadQueries"
        myAppDataBase= Room.databaseBuilder(MainActivity.this,MyAppDataBase.class,"userdb").allowMainThreadQueries().build();

        if(findViewById(R.id.fragment_container )!=null){
              if(savedInstanceState !=null){
                  return;
              }
              fragmentManager.beginTransaction().add(R.id.fragment_container,new HomeFragment()).commit();
        }
    }
}
