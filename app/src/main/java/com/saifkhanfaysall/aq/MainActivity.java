package com.saif.android;

import android.content.Intent;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.saifkhanfaysall.aq.data.CRPC;
import com.saifkhanfaysall.aq.data.CivilCourts;
import com.saifkhanfaysall.aq.data.Constitution;
import com.saifkhanfaysall.aq.data.PC;

public class MainActivity extends Activity {

    public static final String ACT = "act";

    Constitution cons;
    Button consBtn;

    CRPC crpc;
    Button crpcBtn;

    PC pc;
    Button pcBtn;

    CivilCourts civilCourts;
    Button cpc;

    ActListeners actListeners;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cpc = findViewById(R.id.cpc);
        consBtn = findViewById(R.id.cons_btn);
        crpcBtn = findViewById(R.id.crpc_btn);
        pcBtn = findViewById(R.id.pc_btn);

        actListeners = new ActListeners();
        cpc.setOnClickListener(actListeners);
        consBtn.setOnClickListener(actListeners);
        crpcBtn.setOnClickListener(actListeners);
        pcBtn.setOnClickListener(actListeners);
    }



    private class ActListeners implements View.OnClickListener {
        Intent intent = new Intent(MainActivity.this, Question.class);
        
        @Override
        public void onClick(View v) {
            if (v.getId() == R.id.cpc){
                civilCourts = new CivilCourts();
                intent.putExtra(ACT, civilCourts);
            }

            if (v.getId() == R.id.cons_btn){
                cons = new Constitution();
                intent.putExtra(ACT, cons);
            }

            if (v.getId() == R.id.crpc_btn){
                crpc = new CRPC();
                intent.putExtra(ACT, crpc);
            }

            if (v.getId() == R.id.pc_btn){
                pc= new PC();
                intent.putExtra(ACT, pc);
            }

            startActivity(intent);
        }
    }


}
