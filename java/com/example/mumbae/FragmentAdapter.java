package com.example.mumbae;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class FragmentAdapter extends FragmentStatePagerAdapter {

    String[] tabTiles = {"PLACES","EATERIES","STREET FOOD","STREET SHOPPING","SHOPPING MALLS","EMERGENCY CONTACTS"};

    public FragmentAdapter(@NonNull FragmentManager fragment) {
        super(fragment);
    }


    @NonNull
    @Override
    public Fragment getItem(int position) {
        if (position==0){
            return new PlacesFragment();
        } else if (position==1){
            return new EateriesFragment();
        } else if (position==2){
            return new FoodFragment();
        } else if (position==3){
            return new ShoppingFragment();
        } else if (position==4){
            return new MallsFragment();
        } else {
            return new EmergencyFragment();
        }
    }

    @Override
    public int getCount() {
        return 6;
    }


    @Nullable
    public CharSequence getPageTitle(int position) {
        return tabTiles[position];
    }

}
