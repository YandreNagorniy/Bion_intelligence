package com.example.bionintelligence.presentation.main;

import android.databinding.DataBindingUtil;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.bionintelligence.R;
import com.example.bionintelligence.databinding.ActivityMainBinding;
import com.example.bionintelligence.presentation.calculator.CalculatorFragment;
import com.example.bionintelligence.presentation.contacts.ContactsFragment;
import com.example.bionintelligence.presentation.info.InfoFragment;
import com.example.bionintelligence.presentation.settings.SettingsFragment;

public class MainActivity extends AppCompatActivity implements MainView {
    private ActivityMainBinding binding;
    private CalculatorFragment calculatorFragment;
    private SettingsFragment settingsFragment;
    private ContactsFragment contactsFragment;
    private InfoFragment infoFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        calculatorFragment = new CalculatorFragment();
        settingsFragment = new SettingsFragment();
        contactsFragment = new ContactsFragment();
        infoFragment = new InfoFragment();
        addFragment();

        binding.bottomNavigationView
                .setOnNavigationItemSelectedListener(menuItem -> {
                    switch (menuItem.getItemId()) {
                        case R.id.action_calculator:
                            showFragment(calculatorFragment);
                            break;
                        case R.id.action_settings:
                            showFragment(settingsFragment);
                            break;
                        case R.id.action_product:
                            showFragment(infoFragment);
                            break;
                        case R.id.action_contacts:
                            showFragment(contactsFragment);
                            break;
                    }
                    return false;
                });
    }

    private void addFragment() {
        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.container, infoFragment).hide(infoFragment)
                .add(R.id.container, contactsFragment).hide(contactsFragment)
                .add(R.id.container, settingsFragment).hide(settingsFragment)
                .add(R.id.container, calculatorFragment)
                .commit();
    }

    private void showFragment(Fragment fragment) {
        for (Fragment f : getSupportFragmentManager().getFragments()) {
            getSupportFragmentManager().beginTransaction().hide(f).commit();
        }
        for (Fragment f : getSupportFragmentManager().getFragments()) {
            if (f == fragment) {
                getSupportFragmentManager().beginTransaction().show(f).commit();
            }
        }
    }
}
