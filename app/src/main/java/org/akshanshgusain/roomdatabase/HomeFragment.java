package org.akshanshgusain.roomdatabase;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment implements View.OnClickListener {
    private Button addUserButton, readUsersButton, deleteUserButton;

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_home, container, false);
        addUserButton=view.findViewById(R.id.button);
        readUsersButton=view.findViewById(R.id.button2);
        deleteUserButton=view.findViewById(R.id.button3);
        addUserButton.setOnClickListener(this);
        readUsersButton.setOnClickListener(this);
        deleteUserButton.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
                     switch(v.getId()){
                         case R.id.button: MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container,new AddUserFragment()).
                                  addToBackStack(null).commit();
                                  break;
                         case R.id.button2: MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container,new ReadUserFragment()).
                                addToBackStack(null).commit();
                                break;
                         case R.id.button3: MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container,new DeleteUserFragment()).
                                 addToBackStack(null).commit();
                             break;
                                }
    }

}
