package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static android.R.attr.bottom;
import static android.R.attr.button;
import static com.londonappbrewery.destini.R.string.T1_Ans1;
import static com.londonappbrewery.destini.R.string.T1_Ans2;
import static com.londonappbrewery.destini.R.string.T1_Story;
import static com.londonappbrewery.destini.R.string.T2_Ans1;
import static com.londonappbrewery.destini.R.string.T2_Ans2;
import static com.londonappbrewery.destini.R.string.T2_Story;
import static com.londonappbrewery.destini.R.string.T3_Ans1;
import static com.londonappbrewery.destini.R.string.T3_Ans2;
import static com.londonappbrewery.destini.R.string.T3_Story;
import static com.londonappbrewery.destini.R.string.T4_End;
import static com.londonappbrewery.destini.R.string.T5_End;
import static com.londonappbrewery.destini.R.string.T6_End;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView storyTextView;
    Button buttonTop;
    Button buttonBottom;
    int mStoryIndex = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        storyTextView = (TextView) findViewById(R.id.storyTextView);
        buttonTop = (Button) findViewById(R.id.buttonTop);
        buttonBottom = (Button) findViewById(R.id.buttonBottom);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:

         buttonTop.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
             Log.d("Top", "Button top pressed");
                 if (mStoryIndex==1 || mStoryIndex==2) {
                     mStoryIndex=3;
                     storyTextView.setText(T3_Story);
                     buttonTop.setText(T3_Ans1);
                     buttonBottom.setText(T3_Ans2);

                 } else if (mStoryIndex==3){
                     mStoryIndex=6;
                     storyTextView.setText(T6_End);
                     buttonTop.setVisibility(View.GONE);
                     buttonBottom.setVisibility(view.GONE);
                 }


             }
         });

        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        buttonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Bottom", "Button bottom pressed");
                if (mStoryIndex==1){
                    mStoryIndex=2;
                    storyTextView.setText(T2_Story);
                    buttonTop.setText(T2_Ans1);
                    buttonBottom.setText(T2_Ans2);
                }else if (mStoryIndex==2){
                    mStoryIndex=4;
                    storyTextView.setText(T4_End);
                    buttonTop.setVisibility(view.GONE);
                    buttonBottom.setVisibility(View.GONE);

                } else if (mStoryIndex==3){
                    mStoryIndex=5;
                    storyTextView.setText(T5_End);
                    buttonTop.setVisibility(view.GONE);
                    buttonBottom.setVisibility(view.GONE);
                }
            }
        });

    }

}
