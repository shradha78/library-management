package com.example.library;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class StateSelectionActivity extends AppCompatActivity {
    private EditText name;
    private TextView statement;
    private RadioGroup selection;
    private RadioButton state;
    private RadioButton state1;
    private RadioButton state2;
    private Button enterButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regions);
        name=(EditText)findViewById(R.id.enteryourname_ID);
        selection=(RadioGroup)findViewById(R.id.States_Id);
        statement=(TextView)findViewById(R.id.StateSelect_id);
        enterButton=(Button)findViewById(R.id.enterbutton_id);
        state1=(RadioButton)findViewById(R.id.LkoKanpur_Id);
        state2=(RadioButton)findViewById(R.id.VaranasiAllahabad_id);

        name.setActivated(true);
        name.setPressed(true);

        enterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                  if(!name.getText().toString().equals("")) {

                    String message=name.getText().toString();
                    statement.setText(String.format("%s%s%s%s%s", getString(R.string.welcome)," ", message,",",getString(R.string.Select)));
                    statement.setVisibility(View.VISIBLE);
                    selection.setVisibility(View.VISIBLE);
                    name.setError(null);

                    selection.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup group, int checkedId) {
                            state = (RadioButton) findViewById(checkedId);
                            Intent intent = new Intent(StateSelectionActivity.this, ListOfLibrariesActivity.class);
                            switch (state.getId()) {
                                case R.id.LkoKanpur_Id:
                                    if (state.isChecked()) {
                                        intent.putExtra("1", "lko");
                                        state1.setChecked(false);
                                    }
                                    break;
                                case R.id.VaranasiAllahabad_id:
                                    if (state.isChecked()) {
                                        intent.putExtra("1", "varanasi");
                                        state2.setChecked(false);
                                    }

                                    break;
                            }

                            startActivity(intent);

                        }
                    });

                }
                  else if(name.getText().toString().equals("")){
                      name.setError("This field cannot be blank");
                      statement.setVisibility(View.INVISIBLE);
                      selection.setVisibility(View.INVISIBLE);
                  }
            }
        });
        


        if(name.getText().toString().equals("")){
            name.setError("This field cannot be blank");
        }



    }
}
