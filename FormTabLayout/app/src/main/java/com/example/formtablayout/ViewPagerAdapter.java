package com.example.formtablayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {
        public ViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
                super(fm, behavior);
        }

        @NonNull

        @Override
        public Fragment getItem(int position) {
                switch (position){
                        case 0:
                                return new YourBody_Fragment();
                        case 1:
                                return new EatFood_Fragment();
                        case 2:
                                return new DrinkWater_Fragment();
                        case 3:
                                return new Sleep_Fragment();
                        default:
                                return new YourBody_Fragment();
                }
        }

        @Override
        public int getCount() {
                return 4;
        }

        @Override
        public CharSequence getPageTitle(int position) {
                String title = "";
                switch (position) {
                        case 0:
                                title = "Your Body";
                                break;
                        case 1:
                                title = "Eat Food";
                                break;
                        case 2:
                                title = "Drink Water";
                                break;
                        case 3:
                                title = "Sleep";
                                break;
                }
                return title;
        }
}




