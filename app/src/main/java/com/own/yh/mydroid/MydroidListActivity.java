package com.own.yh.mydroid;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MydroidListActivity extends SingleFragmentActivity{

    @Override
    public Fragment createFragment() {
        return MydroidListFragment.newInstance();
    }

}
