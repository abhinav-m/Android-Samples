package learn.abhinav.pebbles.ui;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import learn.abhinav.pebbles.R;
import learn.abhinav.pebbles.model.Pebble;

public class PebblesActivity extends Activity {
    private Button mTl, mBl, mTr, mBr;
    private TextView t[] = new TextView[4];
    Pebble mPebble = new Pebble();
    int mCurPeb = 0;
    String mAns;
    long start;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pebbles);








        mTl = (Button) findViewById(R.id.plusTLButton);
        mTr = (Button) findViewById(R.id.mulTRButton);
        mBl = (Button) findViewById(R.id.subBLbutton);
        mBr = (Button) findViewById(R.id.divBRButton);

        t[0] = (TextView) findViewById(R.id.tLtextView);
        t[1] = (TextView) findViewById(R.id.tRtextView);
        t[2] = (TextView) findViewById(R.id.ansTextView);
        t[2].setText("Ans");
        t[3] = (TextView) findViewById(R.id.bRtextView);

        for (int i = 0; i < 4; i++) {
            if (i == 2) {
                mAns = mPebble.returnPeb(mCurPeb, i);
            } else {

                t[i].setText(mPebble.returnPeb(mCurPeb, i));

            }


            mTl.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (mAns.equalsIgnoreCase("+")) {
                        mCurPeb++;
                        if(mCurPeb==9)
                        {
                            long elapsedTimeMillis = System.currentTimeMillis()-start;
                            float elapsedTimeSec = elapsedTimeMillis/1000F;
                             String score ="You took"+elapsedTimeSec+" seconds to complete the game!";
                            Toast.makeText(PebblesActivity.this,score,Toast.LENGTH_LONG).show();
                            finish();
                        }
                        for (int i = 0; i < 4; i++) {
                            if (i == 2) {
                                mAns = mPebble.returnPeb(mCurPeb, i);
                            } else {

                                t[i].setText(mPebble.returnPeb(mCurPeb, i));

                            }
                        }

                    }
                }
            });

            mTr.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (mAns.equalsIgnoreCase("x")) {
                        mCurPeb++;
                        if(mCurPeb==9)
                        {
                            long elapsedTimeMillis = System.currentTimeMillis()-start;
                            float elapsedTimeSec = elapsedTimeMillis/1000F;
                            String score ="You took"+elapsedTimeSec+" seconds to complete the game!";
                            Toast.makeText(PebblesActivity.this,score,Toast.LENGTH_LONG).show();
                            finish();
                        }
                        for (int i = 0; i < 4; i++) {
                            if (i == 2) {
                                mAns = mPebble.returnPeb(mCurPeb, i);
                            } else {

                                t[i].setText(mPebble.returnPeb(mCurPeb, i));

                            }
                        }

                    }
                }
            });

            mBl.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (mAns.equalsIgnoreCase("-")) {
                        mCurPeb++;
                        if(mCurPeb==9)
                        {
                            long elapsedTimeMillis = System.currentTimeMillis()-start;
                            float elapsedTimeSec = elapsedTimeMillis/1000F;
                            String score ="You took"+elapsedTimeSec+" seconds to complete the game!";
                            Toast.makeText(PebblesActivity.this,score,Toast.LENGTH_LONG).show();
                            finish();
                        }
                        for (int i = 0; i < 4; i++) {
                            if (i == 2) {
                                mAns = mPebble.returnPeb(mCurPeb, i);
                            } else {

                                t[i].setText(mPebble.returnPeb(mCurPeb, i));

                            }
                        }

                    }
                }
            });


            mBr.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (mAns.equalsIgnoreCase("/")) {
                        mCurPeb++;
                        if(mCurPeb==9)
                        {
                            long elapsedTimeMillis = System.currentTimeMillis()-start;
                            float elapsedTimeSec = elapsedTimeMillis/1000F;
                            String score ="You took"+elapsedTimeSec+" seconds to complete the game!";
                            Toast.makeText(PebblesActivity.this,score,Toast.LENGTH_LONG).show();
                            finish();
                        }
                        for (int i = 0; i < 4; i++) {
                            if (i == 2) {
                                mAns = mPebble.returnPeb(mCurPeb, i);
                            } else {

                                t[i].setText(mPebble.returnPeb(mCurPeb, i));

                            }
                        }

                    }
                }
            });

        }
        start = System.currentTimeMillis();
    }
}