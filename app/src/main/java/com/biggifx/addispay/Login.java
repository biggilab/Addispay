package com.biggifx.addispay;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class Login extends ActionBarActivity {

    Button btn_login;
    Button btn_register;
    Button btn_res_pass;
    EditText username_input;
    EditText password_input;

    private TextView loginerrormsg;
    private static String KEY_SUCCESS = "success";
    private static String KEY_UID = "uid";
    private static String KEY_USERNAME = "uname";
    private static String KEY_FIRSTNAME = "fname";
    private static String KEY_LASTNAME = "lname";
    private static String KEY_EMAIL = "email";
    private static String KEY_CREATED_AT = "created_at";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        username_input= (EditText) findViewById(R.id.username);
        password_input = (EditText) findViewById(R.id.password_input);
        loginerrormsg = (TextView) findViewById(R.id.loginErrorMsg);
        btn_login = (Button) findViewById(R.id.login);

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((!username_input.getText().toString().equals("")) && (!password_input.getText().toString().equals("")))
                {
//                    NetAsync(v);

                }
                else if((username_input.getText().toString().equals("")))
                {
                    Toast.makeText(getApplicationContext(),"Email or username Empty!", Toast.LENGTH_SHORT).show();
                }
                else if((password_input.getText().toString().equals("")))
                {
                    Toast.makeText(getApplicationContext(),"Password Empty!", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(getApplicationContext(),
                            "Email and Password field are empty", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_login, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}


