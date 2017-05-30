package learn.abhinav.wtf;

import android.app.Activity;
import android.graphics.Color;
import android.os.CountDownTimer;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;



import learn.abhinav.wtf.model.QuestionsE;
import learn.abhinav.wtf.model.QuestionsH;
import learn.abhinav.wtf.model.QuestionsM;

public class WTFGame extends Activity {

    Button mTF[] = new Button[2];
    TextView mOp[] = new TextView[3];
    QuestionsE mE = new QuestionsE();
    QuestionsH mH = new QuestionsH();
    QuestionsM mM = new QuestionsM();
    TextView mCount;
    TextView lives;
    int mCur = 1;
    String mAns;
    int mScore = 0;
    int dif = 0;
    int mWrongAns=3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wtfgame);
        mTF[0] = (Button) findViewById(R.id.trueButton);
        mTF[1] = (Button) findViewById(R.id.falseButton);
        mOp[0] = (TextView) findViewById(R.id.number1TextView);
        mOp[1] = (TextView) findViewById(R.id.operatorTextView);
        mOp[2] = (TextView) findViewById(R.id.number2textView);
        mCount = (TextView) findViewById(R.id.countDown);
        lives = (TextView)  findViewById(R.id.livesTextView);
        lives.setText("Lives left = "+mWrongAns);

        loadQues(0);
    final CountDownTimer t1=   new CountDownTimer(60000, 1000) {//CountDownTimer(edittext1.getText()+edittext2.getText()) also parse it to long

            public void onTick(long millisUntilFinished) {
                mCount.setText("" + millisUntilFinished / 1000);
                if (millisUntilFinished<=10000)
                {
                    mCount.setTextSize(100F);
                    mCount.setTextColor(Color.RED);

                }

                //here you can have your logic to set text to edittext
            }

            public void onFinish() {
                mCount.setText("0");
                Toast.makeText(WTFGame.this,"You were able to solve "+mScore+" WTFs",Toast.LENGTH_LONG).show();
                finish();
            }
        }
                .start();
      


                mTF[0].setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        if (mAns.equalsIgnoreCase("t")) {

                            mCur++;
                            if (mCur == 10) {
                                dif++;
                                mCur = 0;
                                loadQues(0);
                            } else {

                                loadQues(mCur);
                                mScore++;
                            }


                        } else
                        {
                            if(mWrongAns==0) {

                                Toast.makeText(WTFGame.this,"You were able to solve "+mScore+" WTFs",Toast.LENGTH_LONG).show();
                                t1.cancel();
                                finish();
                            }
                            else {
                                mWrongAns--;
                                Toast.makeText(WTFGame.this, "-1 Life", Toast.LENGTH_SHORT).show();
                                lives.setText("Lives left = " + mWrongAns);
                            }
                        }

                    }
                });

                mTF[1].setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        if (mAns.equalsIgnoreCase("f"))

                        {

                            mCur++;
                            if (mCur == 10) {
                                dif++;
                                mCur = 0;
                                loadQues(0);
                            } else {

                                loadQues(mCur);
                                mScore++;
                            }
                        } else {
                            if(mWrongAns==0) {

                                Toast.makeText(WTFGame.this,"You were able to solve "+mScore+" WTFs",Toast.LENGTH_LONG).show();
                                t1.cancel();
                                finish();
                            }
                            else {
                                mWrongAns--;
                                Toast.makeText(WTFGame.this, "-1 Life", Toast.LENGTH_SHORT).show();
                                lives.setText("Lives left = " + mWrongAns);
                            }
                        }

                    }
                });


            }

            public void loadQues(int mCur) {
                if (dif == 0) {
                    for (int i = 0; i < 3; i++) {
                        mOp[i].setText(mE.returnQues(mCur, i));
                    }
                    mAns = mE.returnQues(mCur, 3);
                } else if (dif == 1) {
                    for (int i = 0; i < 3; i++) {
                        mOp[i].setText(mM.returnQues(mCur, i));
                    }
                    mAns = mM.returnQues(mCur, 3);
                } else if (dif == 2) {
                    for (int i = 0; i < 3; i++) {
                        mOp[i].setText(mH.returnQues(mCur, i));
                    }
                    mAns = mH.returnQues(mCur, 3);
                }

            }



        }
