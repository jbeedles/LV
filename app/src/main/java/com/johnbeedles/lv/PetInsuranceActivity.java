/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.johnbeedles.lv;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;

public class PetInsuranceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.pet_main);

        // Find the View that shows the numbers category
        LinearLayout car = (LinearLayout) findViewById(R.id.carInsurance);

        // Set a click listener on that View
        car.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link CarInsuranceActivity}
                Intent carsIntent = new Intent(PetInsuranceActivity.this, PetInsuranceActivity.class);

                // Start the new activity
                startActivity(carsIntent);
            }
        });

        // Find the View that shows the family category
        LinearLayout home = (LinearLayout) findViewById(R.id.homeInsurance);

        // Set a click listener on that View
        home.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the family category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link HomeInsuranceActivity}
                Intent homeIntent = new Intent(PetInsuranceActivity.this, HomeInsuranceActivity.class);

                // Start the new activity
                startActivity(homeIntent);
            }
        });

        // Find the View that shows the colors category
        LinearLayout pet = (LinearLayout) findViewById(R.id.petInsurance);

        // Set a click listener on that View
        pet.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the colors category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link PetInsuranceActivity}
                Intent petIntent = new Intent(PetInsuranceActivity.this, PetInsuranceActivity.class);

                // Start the new activity
                startActivity(petIntent);
            }
        });

        // Find the View that shows the phrases category
        LinearLayout member = (LinearLayout) findViewById(R.id.members_header);

        // Set a click listener on that View
        member.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the phrases category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link MemberOffersActivity}
                Intent memberIntent = new Intent(PetInsuranceActivity.this, MemberOffersActivity.class);

                // Start the new activity
                startActivity(memberIntent);
            }
        });
    }
}
