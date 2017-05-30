package learn.abhinav.flaggers.model;

/**
 * Created by abhinav on 9/6/15.
 *
 */

import learn.abhinav.flaggers.R;

public class Page {

    private Flags[] mFlags = new Flags[20];





    public Page()
    {

    mFlags[3] = new Flags("america", R.mipmap.america);
    mFlags[0] = new Flags("Australia", R.mipmap.australia);
    mFlags[2] = new Flags("Austria", R.mipmap.austria);
    mFlags[1] = new Flags("Bangladesh", R.mipmap.bangladesh);
    mFlags[7] = new Flags("Canada", R.mipmap.canada);
    mFlags[5] = new Flags("Chile", R.mipmap.chile);
    mFlags[6] = new Flags("China", R.mipmap.china);

        mFlags[8] = new Flags("Colombia", R.mipmap.colombia);
        mFlags[4] = new Flags("Denmark", R.mipmap.denmark);
        mFlags[9] = new Flags("France", R.mipmap.france);
        mFlags[12] = new Flags("Germany", R.mipmap.germany);
        mFlags[15] = new Flags("Greece", R.mipmap.greece);
        mFlags[19] = new Flags("Ireland", R.mipmap.ireland);
        mFlags[13] = new Flags("Italy", R.mipmap.italy);
        mFlags[14] = new Flags("Malaysia", R.mipmap.malaysia);
        mFlags[18] = new Flags("Pakistan", R.mipmap.pakistan);
        mFlags[16] = new Flags("Singapore", R.mipmap.singapore);
        mFlags[17] = new Flags("Sweden", R.mipmap.sweden);
        mFlags[11] = new Flags("Turkey", R.mipmap.turkey);
        mFlags[10] = new Flags("Afghanistan", R.mipmap.afghanistan);



    }

    public Flags loadPage(int pNo)
    {
     return mFlags[pNo];
    }





}
