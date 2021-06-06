package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.github.jinatonic.confetti.CommonConfetti;
import com.plattysoft.leonids.ParticleSystem;

public class GameActivity extends AppCompatActivity implements dialog.dialogListener {

    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,reset,single;
    TextView txt_player1,txt_player2;
    String arr[] = {"X", "O", "X", "O", "X", "O"};
    String player1_name = "",player2_name = "";
    int location = 0,count =0;
    int player_1=0,player_2=0;
    Handler handler = new Handler();

    @Override
    public void applyText(String player1, String player2) {
        txt_player1.setText(player1+" (X) : ");
        txt_player2.setText(player2+" (O) : ");
        player1_name = txt_player1.getText().toString();
        player2_name = txt_player2.getText().toString();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
            btn1 = findViewById(R.id.btn_1);
            btn2 = findViewById(R.id.btn_2);
            btn3 = findViewById(R.id.btn_3);
            btn4 = findViewById(R.id.btn_4);
            btn5 = findViewById(R.id.btn_5);
            btn6 = findViewById(R.id.btn_6);
            btn7 = findViewById(R.id.btn_7);
            btn8 = findViewById(R.id.btn_8);
            btn9 = findViewById(R.id.btn_9);
            reset = findViewById(R.id.b_reset);
            txt_player1 = findViewById(R.id.player_1);
            txt_player2 = findViewById(R.id.player_2);

            dialog d = new dialog();
            d.show(getSupportFragmentManager(),"dialog box");

            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String check = btn1.getText().toString();
                    if(check == "")
                    {
                        btn1.setText(arr[location]);
                        location++;
                        count++;
                        check();
                        if(location == 6)
                            location = 0;
                    }
                }
            });
            btn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String check = btn2.getText().toString();
                    if(check == "") {
                        btn2.setText(arr[location]);
                        location++;
                        count++;
                        check();
                        if (location == 6)
                            location = 0;
                    }
                }
            });
            btn3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String check = btn3.getText().toString();
                    if(check == "") {
                        btn3.setText(arr[location]);
                        location++;
                        count++;
                        check();
                        if (location == 6)
                            location = 0;
                    }
                }
            });
            btn4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String check = btn4.getText().toString();
                    if(check == "") {
                        btn4.setText(arr[location]);
                        location++;
                        count++;
                        check();
                        if (location == 6)
                            location = 0;
                    }
                }
            });
            btn5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String check = btn5.getText().toString();
                    if(check == "") {
                        btn5.setText(arr[location]);
                        location++;
                        count++;
                        check();
                        if (location == 6)
                            location = 0;
                    }
                }
            });
            btn6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String check = btn6.getText().toString();
                    if(check == "") {
                        btn6.setText(arr[location]);
                        location++;
                        count++;
                        check();
                        if (location == 6)
                            location = 0;
                    }
                }
            });
            btn7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String check = btn7.getText().toString();
                    if(check == "") {
                        btn7.setText(arr[location]);
                        location++;
                        count++;
                        check();
                        if (location == 6)
                            location = 0;
                    }
                }
            });
            btn8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String check = btn8.getText().toString();
                    if(check == "") {
                        btn8.setText(arr[location]);
                        location++;
                        count++;
                        check();
                        if (location == 6)
                            location = 0;
                    }
                }
            });
            btn9.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String check = btn9.getText().toString();
                    if(check == "") {
                        btn9.setText(arr[location]);
                        location++;
                        count++;
                        check();
                        if (location == 6)
                            location = 0;
                    }
                }
            });

            reset.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    txt_player1.setText(player1_name);
                    txt_player2.setText(player2_name);
//                Intent intent = new Intent(MainActivity.this,MainActivity.class);
//                startActivity(intent);
                    player_1 = 0;
                    player_2 = 0;
                    reset();
                }
            });
        }

    private void reset() {
            location = 0;
            count = 0;

            btn1.setEnabled(true);
            btn2.setEnabled(true);
            btn3.setEnabled(true);
            btn4.setEnabled(true);
            btn5.setEnabled(true);
            btn6.setEnabled(true);
            btn7.setEnabled(true);
            btn8.setEnabled(true);
            btn9.setEnabled(true);

            btn1.setText("");
            btn2.setText("");
            btn3.setText("");
            btn4.setText("");
            btn5.setText("");
            btn6.setText("");
            btn7.setText("");
            btn8.setText("");
            btn9.setText("");
        }
        private void check() {
            String pattern1 = btn1.getText().toString() +btn2.getText().toString() + btn3.getText().toString();
            String pattern2 = btn4.getText().toString() +btn5.getText().toString() + btn6.getText().toString();
            String pattern3 = btn7.getText().toString() +btn8.getText().toString() + btn9.getText().toString();
            String pattern4 = btn1.getText().toString() +btn4.getText().toString() + btn7.getText().toString();
            String pattern5 = btn1.getText().toString() +btn5.getText().toString() + btn9.getText().toString();
            String pattern6 = btn3.getText().toString() +btn5.getText().toString() + btn7.getText().toString();
            String pattern7 = btn3.getText().toString() +btn6.getText().toString() + btn9.getText().toString();
            String pattern8 = btn2.getText().toString() +btn5.getText().toString() + btn8.getText().toString();
            if(pattern1.equals("XXX") || pattern1.equals("OOO"))
            {
                pause();
                if(pattern1.contains("X")){
                    txt_player1.setText(player1_name+ ++player_1);
                    Toast.makeText(GameActivity.this,player1_name+" WIN ",Toast.LENGTH_SHORT).show();
                }
                else{
                    txt_player2.setText(player2_name+ ++player_2);
                    Toast.makeText(GameActivity.this,player2_name+" WIN ",Toast.LENGTH_SHORT).show();
                }
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        reset();
                    }
                },2000);
            }
            else if(pattern2.equals("XXX") || pattern2.equals("OOO"))
            {
                pause();
                if(pattern2.contains("X")){
                    txt_player1.setText(player1_name+ ++player_1);
                    Toast.makeText(GameActivity.this,player1_name+" WIN ",Toast.LENGTH_SHORT).show();
                }
                else{
                    txt_player2.setText(player2_name+ ++player_2);
                    Toast.makeText(GameActivity.this,player2_name+" WIN ",Toast.LENGTH_SHORT).show();
                }
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        reset();
                    }
                },2000);

            }
            else if(pattern3.equals("XXX") || pattern3.equals("OOO"))
            {
                pause();
                if(pattern3.contains("X")){
                    txt_player1.setText(player1_name+ ++player_1);
                    Toast.makeText(GameActivity.this,player1_name+" WIN ",Toast.LENGTH_SHORT).show();
                }
                else{
                    txt_player2.setText(player2_name+ ++player_2);
                    Toast.makeText(GameActivity.this,player2_name+" WIN ",Toast.LENGTH_SHORT).show();
                }
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        reset();
                    }
                },2000);

            }
            else if(pattern4.equals("XXX") || pattern4.equals("OOO"))
            {
                pause();
                if(pattern4.contains("X")){
                    txt_player1.setText(player1_name+ ++player_1);
                    Toast.makeText(GameActivity.this,player1_name+" WIN ",Toast.LENGTH_SHORT).show();
                }
                else{
                    txt_player2.setText(player2_name+ ++player_2);
                    Toast.makeText(GameActivity.this,player2_name+" WIN ",Toast.LENGTH_SHORT).show();
                }
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        reset();
                    }
                },2000);
            }
            else if(pattern5.equals("XXX") || pattern5.equals("OOO"))
            {
                pause();
                if(pattern5.contains("X")){
                    txt_player1.setText(player1_name+ ++player_1);
                    Toast.makeText(GameActivity.this,player1_name+" WIN ",Toast.LENGTH_SHORT).show();
                }
                else{
                    txt_player2.setText(player2_name+ ++player_2);
                    Toast.makeText(GameActivity.this,player2_name+" WIN ",Toast.LENGTH_SHORT).show();
                }
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        reset();
                    }
                },2000);

            }
            else if(pattern6.equals("XXX") || pattern6.equals("OOO"))
            {
                pause();
                if(pattern6.contains("X")){
                    txt_player1.setText(player1_name+ ++player_1);
                    Toast.makeText(GameActivity.this,player1_name+" WIN ",Toast.LENGTH_SHORT).show();
                }
                else{
                    txt_player2.setText(player2_name+ ++player_2);
                    Toast.makeText(GameActivity.this,player2_name+" WIN ",Toast.LENGTH_SHORT).show();
                }
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        reset();
                    }
                },2000);

            }
            else if(pattern7.equals("XXX") || pattern7.equals("OOO"))
            {
                pause();
                if(pattern7.contains("X")){
                    txt_player1.setText(player1_name+ ++player_1);
                    Toast.makeText(GameActivity.this,player1_name+" WIN ",Toast.LENGTH_SHORT).show();
                }
                else{
                    txt_player2.setText(player2_name+ ++player_2);
                    Toast.makeText(GameActivity.this,player2_name+" WIN ",Toast.LENGTH_SHORT).show();
                }
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        reset();
                    }
                },2000);

            }
            else if(pattern8.equals("XXX") || pattern8.equals("OOO"))
            {
                pause();
                if(pattern8.contains("X")){
                    txt_player1.setText(player1_name+ ++player_1);
                    Toast.makeText(GameActivity.this,player1_name+" WIN ",Toast.LENGTH_SHORT).show();
                }
                else{
                    txt_player2.setText(player2_name+ ++player_2);
                    Toast.makeText(GameActivity.this,player2_name+" WIN ",Toast.LENGTH_SHORT).show();
                }
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        reset();
                    }
                },2000);
            }
            else {
                //pause();
                if (count == 9) {
                    Toast.makeText(GameActivity.this, "Match draw...!!!", Toast.LENGTH_SHORT).show();
                    count = 0;
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            reset();
                        }
                    },2000);
                }
            }
        }

        private void pause(){

            CommonConfetti.rainingConfetti((ViewGroup) findViewById(R.id.parent).getRootView(), new int[] {Color.RED,Color.GREEN,Color.GRAY})
                    .infinite().setEmissionDuration(2000);
        btn1.setEnabled(false);
        btn2.setEnabled(false);
        btn3.setEnabled(false);
        btn4.setEnabled(false);
        btn5.setEnabled(false);
        btn6.setEnabled(false);
        btn7.setEnabled(false);
        btn8.setEnabled(false);
        btn9.setEnabled(false);
        }
}