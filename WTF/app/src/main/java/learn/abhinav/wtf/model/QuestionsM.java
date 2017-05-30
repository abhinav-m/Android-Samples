package learn.abhinav.wtf.model;

/**
 * Created by abhinav on 13/6/15.
 */
public class QuestionsM
{

    String mQues[][] =new String[10][4];


   public QuestionsM()
    {
        //Medium
        mQues[0][0]="-2";
        mQues[0][1]="<";
        mQues[0][2]="4";
        mQues[0][3]="t";

        mQues[1][0]="-2";
        mQues[1][1]=">";
        mQues[1][2]="-5";
        mQues[1][3]="t";

        mQues[2][0]="-9";
        mQues[2][1]="<";
        mQues[2][2]="-6";
        mQues[2][3]="t";

        mQues[3][0]="1-2";
        mQues[3][1]="<";
        mQues[3][2]="-3";
        mQues[3][3]="f";

        mQues[4][0]="4-2";
        mQues[4][1]="=";
        mQues[4][2]="2";
        mQues[4][3]="t";

        mQues[5][0]="5-9";
        mQues[5][1]="<";
        mQues[5][2]="6";
        mQues[5][3]="t";

        mQues[6][0]="-3";
        mQues[6][1]="<";
        mQues[6][2]="4-6";
        mQues[6][3]="t";

        mQues[7][0]="-8";
        mQues[7][1]=">";
        mQues[7][2]="-9";
        mQues[7][3]="t";

        mQues[8][0]="-7";
        mQues[8][1]=">";
        mQues[8][2]="3";
        mQues[8][3]="f";

        mQues[9][0]="-3+4";
        mQues[9][1]="=";
        mQues[9][2]="-4+3";
        mQues[9][3]="f";




    }
    public String returnQues(int r , int c) {
        return mQues[r][c];

    }


}
