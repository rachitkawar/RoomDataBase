package org.akshanshgusain.roomdatabase;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class DeleteUserFragment extends Fragment {
      private Button mdeleteButtonl;
      private EditText mId;

    public DeleteUserFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_delete_user, container, false);
         mdeleteButtonl=(Button)view.findViewById(R.id.button);
         mId=(EditText)view.findViewById(R.id.editText);
         mdeleteButtonl.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 int id=Integer.parseInt(mId.getText().toString());
                 User tempUser=new User();
                 tempUser.setId(id);
                  MainActivity.myAppDataBase.MyDoa().deleteUser(tempUser);

                  mId.setText("");
             }
         });
        return  view;
    }

}
