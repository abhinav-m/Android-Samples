package learn.abhinav.wtf.model;

/**
 * Created by abhinav on 13/6/15.
 */
public class QuestionsH
{

    String mQues[][] =new String[10][4];


    public QuestionsH()
    {
        //Hard
        mQues[0][0]="-2+3+4";
        mQues[0][1]="<";
        mQues[0][2]="-3+2+4";
        mQues[0][3]="t";

        mQues[1][0]="-2x2";
        mQues[1][1]=">";
        mQues[1][2]="-5";
        mQues[1][3]="t";

        mQues[2][0]="-2-3-4";
        mQues[2][1]="<";
        mQues[2][2]="-3x2";
        mQues[2][3]="t";

        mQues[3][0]="1-2";
        mQues[3][1]="<";
        mQues[3][2]="-3x1";
        mQues[3][3]="f";

        mQues[4][0]="4-3+1";
        mQues[4][1]="=";
        mQues[4][2]="6/3";
        mQues[4][3]="t";

        mQues[5][0]="-1-3";
        mQues[5][1]="<";
        mQues[5][2]="3x2";
        mQues[5][3]="t";

        mQues[6][0]="-2-3-1";
        mQues[6][1]="<";
        mQues[6][2]="4-6";
        mQues[6][3]="t";

        mQues[7][0]="4x-2";
        mQues[7][1]=">";
        mQues[7][2]="3x-3";
        mQues[7][3]="t";

        mQues[8][0]="(3x-2)-1";
        mQues[8][1]=">";
        mQues[8][2]="(-1+2)x3";
        mQues[8][3]="f";

        mQues[9][0]="-3+(2x2)";
        mQues[9][1]="=";
        mQues[9][2]="-(2x-2)-3";
        mQues[9][3]="t";




    }
    public String returnQues(int r , int c) {
        return mQues[r][c];

    }


}
