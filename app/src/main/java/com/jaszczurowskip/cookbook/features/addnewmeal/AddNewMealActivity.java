package com.jaszczurowskip.cookbook.features.addnewmeal;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;

import com.jaszczurowskip.cookbook.R;
import com.jaszczurowskip.cookbook.utils.BaseActivity;

public class AddNewMealActivity extends BaseActivity {
    private static final String ADD_NEW_MEAL_FRAG = "ADD_NEW_MEAL_FRAG";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new_meal);
        FragmentManager manager = getSupportFragmentManager();
        AddNewMealFragment fragment = (AddNewMealFragment) manager.findFragmentByTag(ADD_NEW_MEAL_FRAG);
        if (fragment == null) {
            fragment = AddNewMealFragment.newInstance();
        }
        addFragmentToActivity(manager, fragment, R.id.root_activity_add_meal, ADD_NEW_MEAL_FRAG);
    }
}
