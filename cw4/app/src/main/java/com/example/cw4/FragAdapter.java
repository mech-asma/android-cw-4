package com.example.cw4;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.cw4.Fragments.Fragment1;
import com.example.cw4.Fragments.Fragment2;
import com.example.cw4.Fragments.Fragment3;

public class FragAdapter extends FragmentPagerAdapter {
    public FragAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new Fragment1();
            case 1:
                return new Fragment2();
            case 2:
                return new Fragment3();

        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
