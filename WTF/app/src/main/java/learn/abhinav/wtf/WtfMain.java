package learn.abhinav.wtf;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.CountDownTimer;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class WtfMain extends Activity {
    TextView mCount;
    TextView mWTF;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wtf_main);
        Button b1;
        b1=(Button)findViewById(R.id.buttonStart);
        mCount = (TextView)findViewById(R.id.startCount);
        mWTF = (TextView)findViewById(R.id.fullFormWTF);
        mCount.setText("WTF");
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mWTF.setVisibility(View.INVISIBLE);
                CountDownTimer t1=   new CountDownTimer(5100, 1000) {//CountDownTimer(edittext1.getText()+edittext2.getText()) also parse it to long

                    public void onTick(long millisUntilFinished) {
                        mCount.setText("" + millisUntilFinished / 1000);

                        //here you can have your logic to set text to edittext
                    }

                    public void onFinish() {
                        mCount.setText("Starting...");
                        Intent intent = new Intent(WtfMain.this,WTFGame.class);
                        startActivity(intent);

                    }
                }
                        .start();


            }
        });
    }
protected void onResume()
{
    super.onResume();
    mCount.setText("WTF");
}
}
