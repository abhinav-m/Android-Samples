package learn.abhinav.flaggers.model;

/**
 * Created by abhinav on 8/6/15.
 */
public class Flags {

    private String mName;
    private int mFlag;

    Flags(String name, int flag) {
        mName=name;
        mFlag=flag;
    }
    public int getFlag() {
        return mFlag;
    }

    public String getName() {
        return mName;
    }
/*
    public void setName(String name) {
        mName = name;
    }

    public int getFlag() {
        return mFlag;
    }

    public void setFlag(int flag) {
        mFlag = flag;
    }
}
*/

}
