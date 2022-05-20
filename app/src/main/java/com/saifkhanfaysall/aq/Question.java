package com.saifkhanfaysall.aq;

import android.graphics.Color;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.saifkhanfaysall.aq.data.Act;
import com.saifkhanfaysall.aq.data.CRPC;
import com.saifkhanfaysall.aq.data.CivilCourts;
import com.saifkhanfaysall.aq.data.Constitution;
import com.saifkhanfaysall.aq.data.PC;

import java.util.Random;

public class Question extends Activity {

    private Button o1, o2, o3, o4, next;
    private TextView titleView, countView;
    private int counter = 0;
    private String correct = "";
    private Button correctBtn;

    /*
    * This boolean is set from OptLis when a wrong button is pressed.
    * It indicates that quize is now in wrong state. In This state
    * Options buttons doesn't react. Because in OptLis this boolean is
    * checked and if it's true set by else portion of OptLis.onClick()
    * the listener returns and no button click works.
    *
    * This boolean is set to it's defalut value when setQ() is called
    */
    private boolean inWrongState = false;
    private Random random;


    private Act act;
    private String title[];
    private String opt1[];
    private String opt2[];
    private String opt3[];
    private String opt4[];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);

        choose();

        random = new Random();

        titleView = findViewById(R.id.title);
        countView = findViewById(R.id.count);
        o1 = findViewById(R.id.o1);
        o2 = findViewById(R.id.o2);
        o3 = findViewById(R.id.o3);
        o4 = findViewById(R.id.o4);
        next = findViewById(R.id.next);

        o1.setBackgroundColor(Color.BLUE);
        o2.setBackgroundColor(Color.BLUE);
        o3.setBackgroundColor(Color.BLUE);
        o4.setBackgroundColor(Color.BLUE);

        OptLis ol = new OptLis();
        o1.setOnClickListener(ol);
        o2.setOnClickListener(ol);
        o3.setOnClickListener(ol);
        o4.setOnClickListener(ol);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inWrongState = false;
                setQ();
            }
        });
        setQ();
    }



    private void setQ() {
        if (counter == opt1.length-1) finish();

        o1.setBackgroundColor(Color.BLUE);
        o2.setBackgroundColor(Color.BLUE);
        o3.setBackgroundColor(Color.BLUE);
        o4.setBackgroundColor(Color.BLUE);

        titleView.setText(title[counter]);
        countView.setText(""+counter+" "+ opt1.length);
        correct = opt1[counter];
        
        int ran = random.nextInt(4);
        switch (ran){
            case 0 :
                o1.setText(correct);
                correctBtn = o1;
                o2.setText(opt2[counter]);
                o3.setText(opt3[counter]);
                o4.setText(opt4[counter]);
                break;
            case 1 :
                o1.setText(opt2[counter]);
                o2.setText(correct);
                correctBtn = o2;
                o3.setText(opt3[counter]);
                o4.setText(opt4[counter]);
                break;
            case 2 :
                o1.setText(opt3[counter]);
                o2.setText(opt2[counter]);
                o3.setText(correct);
                correctBtn = o3;
                o4.setText(opt4[counter]);
                break;
            case 3 :
                o1.setText(opt4[counter]);
                o2.setText(opt2[counter]);
                o3.setText(opt3[counter]);
                o4.setText(correct);
                correctBtn = o4;
        }

        Log.d("tag", ""+ran);
        Log.d("tag", title[counter]);
        Log.d("tag", opt1[counter]);
        Log.d("tag", opt2[counter]);
        Log.d("tag", opt3[counter]);
        Log.d("tag", opt4[counter]);

        counter++;
    }

    
    private void choose(){
        Act act = (Act) getIntent().getSerializableExtra(MainActivity.ACT);
        act.randomizeQ(act.getTitle(), act.getOpt1());
        title = act.getRanTitle();
        opt1 = act.getRanOpt1();
        opt2 = act.getOpt2();
        opt3 = act.getOpt3();
        opt4 = act.getOpt4();
    }

    private class OptLis implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            if (inWrongState) return;
            if (v.getId() == R.id.o1){
                if (o1.getText().equals(correct)){
                    setQ();
                }
                else {
                    correctBtn.setBackgroundColor(Color.RED);
                    inWrongState = true;
                }
            }

            if (v.getId() == R.id.o2){
                if (o2.getText().equals(correct)){
                    setQ();
                }
                else {
                    correctBtn.setBackgroundColor(Color.RED);
                    inWrongState = true;
                }
            }

            if (v.getId() == R.id.o3){
                if (o3.getText().equals(correct)){
                    setQ();
                }
                else {
                    correctBtn.setBackgroundColor(Color.RED);
                    inWrongState = true;
                }
            }

            if (v.getId() == R.id.o4){
                if (o4.getText().equals(correct)){
                    setQ();
                }
                else {
                    correctBtn.setBackgroundColor(Color.RED);
                    inWrongState = true;
                }
            }
        }
    }

}
