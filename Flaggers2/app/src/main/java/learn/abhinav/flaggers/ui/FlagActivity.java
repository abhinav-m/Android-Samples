package learn.abhinav.flaggers.ui;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import learn.abhinav.flaggers.R;
import learn.abhinav.flaggers.model.Flags;
import learn.abhinav.flaggers.model.Page;

public class FlagActivity extends Activity {
private EditText mEditText;
    private Button mSubmitAnswer;
    private int mCurFlag=0;
    private ImageView mFlagView;
    private String mAnswer;
    Flags mFlag;
    int mTry;
    int mScore=0;
    int mPage=0;
    Page p = new Page();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flag);

         mFlag = p.loadPage(mPage);

        Drawable drawable = getResources().getDrawable(mFlag.getFlag());


        mFlagView =(ImageView)findViewById(R.id.imageFlagView);


        mEditText = (EditText) findViewById(R.id.editCountryName);


        mSubmitAnswer=(Button) findViewById(R.id.submitButton);
        mFlagView.setImageDrawable(drawable);

        mSubmitAnswer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mAnswer= mEditText.getText().toString().toLowerCase().trim();
                Log.d(FlagActivity.class.getSimpleName(), "mAnswer="+mAnswer);
                Log.d(FlagActivity.class.getSimpleName(),"mFlagName="+mFlag.getName());
                if(mFlag.getName().trim().equalsIgnoreCase(mAnswer))
                {
                    mScore++;
                  Toast.makeText(FlagActivity.this,"Correct Answer!",Toast.LENGTH_SHORT).show();
                    mEditText.setText(" ");
                    mPage++;
                    mFlag =p.loadPage(mPage);
                    Drawable drawable = getResources().getDrawable(mFlag.getFlag());
                    mFlagView.setImageDrawable(drawable);
                    if(mScore==19)
                    {

                        String name= getIntent().getStringExtra(getString(R.string.key_name));
                        String toast= "Congratulations, %1$s ! You are a true flagger! (MUST BE DHRUV DAWG)";
                         toast =String.format(toast, name);
                        Toast.makeText(FlagActivity.this,toast,Toast.LENGTH_LONG).show();
                        long t1=2000;
                        try {
                            Thread.sleep(t1);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        finish();
                    }




                }
                else
                {
                    Toast.makeText(FlagActivity.this,"Wrong Answer!",Toast.LENGTH_LONG).show();

                }



            }
        });


        
    }


}