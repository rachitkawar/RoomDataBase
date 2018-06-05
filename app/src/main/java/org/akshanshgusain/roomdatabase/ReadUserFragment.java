package org.akshanshgusain.roomdatabase;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class ReadUserFragment extends Fragment {
     private TextView  mResult;

    public ReadUserFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_read_user, container, false);
        mResult=(TextView)view.findViewById(R.id.textView);

        List<User> users=MainActivity.myAppDataBase.MyDoa().getUsers();
           String info="";
             for(User temp:users){
                    int id=temp.getId();
                    String name=temp.getName();
                    String email=temp.getName();
                    info=info+"\n\n"+"ID: "+id+"\n NAME: "+name+"\n EMAIL: "+email;
             }
            mResult.setText(info);
        return view;
    }

}
