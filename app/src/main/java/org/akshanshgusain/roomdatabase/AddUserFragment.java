package org.akshanshgusain.roomdatabase;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class AddUserFragment extends Fragment implements View.OnClickListener{
    private Button mSaveButton;
    private EditText mUserId,mName,mEmail;

    public AddUserFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_add_user, container, false);
        mSaveButton=(Button)view.findViewById(R.id.button);
        mUserId=(EditText)view.findViewById(R.id.editText2);
        mName=(EditText)view.findViewById(R.id.editText);
        mEmail=(EditText)view.findViewById(R.id.editText3);
        mSaveButton.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        int id=Integer.parseInt(mUserId.getText().toString());
        String name=mName.getText().toString();
        String email=mEmail.getText().toString();
        //Create an object of User class
        User user=new User();
        user.setId(id);
        user.setName(name);
        user.setEmail(email);
        MainActivity.myAppDataBase.MyDoa().addUser(user);
        Toast.makeText(this.getActivity(), "User ADDED!", Toast.LENGTH_SHORT).show();
        mUserId.setText("");mName.setText("");mEmail.setText("");

    }
}
