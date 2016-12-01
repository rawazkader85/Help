package ca.uottawa.help;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class helpActivity extends AppCompatActivity {

    public void signUpJump(View view){
        EditText eText = (EditText)findViewById(R.id.layoutOfHelp);
        eText.setText(eText.getText()+"•Signing up to a Recipeek account.");
    }

    public void loggingInJump(View view){
        EditText eText = (EditText)findViewById(R.id.layoutOfHelp);
        eText.setText(eText.getText()+"•Logging into your Recipeek account.");
    }

    public void searchJump(View view){
        EditText eText = (EditText)findViewById(R.id.layoutOfHelp);
        eText.setText(eText.getText()+"•Searching for a recipe.");
    }

    public void favourtieJump(View view){
        EditText eText = (EditText)findViewById(R.id.layoutOfHelp);
        eText.setText(eText.getText()+"•Favouriting a recipe.");
    }

    public void createRecipeJump(View view){
        EditText eText = (EditText)findViewById(R.id.layoutOfHelp);
        eText.setText(eText.getText()+"•Making a recipe and uploading it online.");
    }



    protected void focusOnSignUpHelp(){

    }



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);
        ActionBar ab = getSupportActionBar();
        ab.setTitle("Help");
    }
}
