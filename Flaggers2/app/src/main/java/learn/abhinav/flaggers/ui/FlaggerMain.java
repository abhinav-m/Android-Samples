package learn.abhinav.flaggers.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import learn.abhinav.flaggers.R;

public class FlaggerMain extends Activity {

    private Button mstartButton  ;
    private EditText mName;
    String name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flagger_main);
        mstartButton = (Button) findViewById(R.id.startButton);
        mName = (EditText) findViewById(R.id.editNameText);
         name = mName.getText().toString();
        mstartButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                startGame(name);

            }
        });
    }

        public void startGame(String name)
    {
        Intent intent = new Intent(this, FlagActivity.class);
                intent.putExtra(getString(R.string.key_name),name);
        startActivity(intent);
    }



}


