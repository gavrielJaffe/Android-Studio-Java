package com.codinginflow.additionexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText mEditText1;
    private EditText mEditText2;
    private TextView mTextViewResult;
    private Button mButtonAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
//find the resource from the xml and put it into variables

        mEditText1 = findViewById(R.id.edittext_number_1);
        mEditText2 = findViewById(R.id.edittext_number_2);
        mTextViewResult = findViewById(R.id.textview_result);
        mButtonAdd = findViewById(R.id.button_add);
        
  // tall the button whet to do when we click on it .
  
        mButtonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mEditText1.getText().toString().length() == 0) {
                    mEditText1.setText("0");
                }

                if (mEditText2.getText().toString().length() == 0) {
                    mEditText2.setText("0");
                }

//   int num1 = Integer.parseInt(mEditText1.getText().toString());   = {get the the Text from them ,  we will convert them into String and then cast them into int }

                int num1 = Integer.parseInt(mEditText1.getText().toString());
                int num2 = Integer.parseInt(mEditText2.getText().toString());

                int sum = num1 + num2;

                mTextViewResult.setText(String.valueOf(sum));
            }
        });
    }
}
