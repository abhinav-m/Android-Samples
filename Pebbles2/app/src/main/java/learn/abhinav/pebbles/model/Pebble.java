package learn.abhinav.pebbles.model;

/**
 * Created by abhinav on 10/6/15.
 */
public class Pebble {
    private String arr[][]= new String[12][4];
    private String ans;

    public Pebble()
    {
        arr[0][0] = "1";
        arr[0][1] ="2";
        arr[0][2] ="+" ;
        arr[0][3] = "3";

        arr[1][0] = "2";
        arr[1][1] ="3";
        arr[1][2] ="x" ;
        arr[1][3] = "6";

        arr[2][0] = "8";
        arr[2][1] ="2";
        arr[2][2] ="/" ;
        arr[2][3] = "4";

//Medium


        arr[3][0] = "-1";
        arr[3][1] ="3";
        arr[3][2] ="+" ;
        arr[3][3] = "2";

        arr[4][0] = "-2";
        arr[4][1] ="3";
        arr[4][2] ="-" ;
        arr[4][3] = "-5";

        arr[5][0] = "-2";
        arr[5][1] ="-2";
        arr[5][2] ="/" ;
        arr[5][3] = "1";
//Hard
        arr[6][0] = "!3";
        arr[6][1] ="3";
        arr[6][2] ="/" ;
        arr[6][3] = "2";

        arr[7][0] = "!4";
        arr[7][1] ="!3";
        arr[7][2] ="/" ;
        arr[7][3] = "4";

        arr[8][0] = "-4";
        arr[8][1] ="!3";
        arr[8][2] ="+" ;
        arr[8][3] = "2";



    }
    public String returnPeb(int r,int c)
    {


           return arr[r][c];
        
    }


}
