package tw.pu.edu.tw.s1071465.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;

import java.util.Arrays;
import java.util.Collections;

public class activity4 extends AppCompatActivity {
    ImageView iv_11,iv_12,iv_13,iv_14,iv_21,iv_22,iv_23,iv_24;

    Integer[] cardsArray = {101, 102, 103, 104, 201, 202, 203, 204};

    int image101,image102,image103,image104,image201,image202,image203,image204;

    int clickedFirst,clickedSecond;
    int firstCard,secondCard;
    int cardNumber = 1;
    int turn = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity4);
        getSupportActionBar().hide(); //隱藏標題
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_FULLSCREEN); //隱藏狀態
        iv_11 = (ImageView) findViewById(R.id.iv_11);
        iv_12 = (ImageView) findViewById(R.id.iv_12);
        iv_13 = (ImageView) findViewById(R.id.iv_13);
        iv_14 = (ImageView) findViewById(R.id.iv_14);

        iv_21 = (ImageView) findViewById(R.id.iv_21);
        iv_22 = (ImageView) findViewById(R.id.iv_22);
        iv_23 = (ImageView) findViewById(R.id.iv_23);
        iv_24 = (ImageView) findViewById(R.id.iv_24);

        iv_11.setTag("0");
        iv_12.setTag("1");
        iv_13.setTag("2");
        iv_14.setTag("3");
        iv_21.setTag("4");
        iv_22.setTag("5");
        iv_23.setTag("6");
        iv_24.setTag("7");

        frontOfCardResources();
        Collections.shuffle(Arrays.asList(cardsArray));

        iv_11.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv_11, theCard);
            }
        });

        iv_12.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv_12, theCard);
            }
        });

        iv_13.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv_13, theCard);
            }
        });

        iv_14.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv_14, theCard);
            }
        });

        iv_21.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv_21, theCard);
            }
        });

        iv_22.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv_22, theCard);
            }
        });

        iv_23.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv_23, theCard);
            }
        });

        iv_24.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv_24, theCard);
            }
        });

    }

    private  void doStuff(ImageView iv,int card){
        if(cardsArray[card] == 101){
            iv.setImageResource(image101);
        }
        else if(cardsArray[card] == 102){
            iv.setImageResource(image102);
        }
        else if(cardsArray[card] == 103){
            iv.setImageResource(image103);
        }
        else if(cardsArray[card] == 104){
            iv.setImageResource(image104);
        }
        else if(cardsArray[card] == 201){
            iv.setImageResource(image201);
        }
        else if(cardsArray[card] == 202){
            iv.setImageResource(image202);
        }
        else if(cardsArray[card] == 203){
            iv.setImageResource(image203);
        }
        else if(cardsArray[card] == 204){
            iv.setImageResource(image204);
        }

        if(cardNumber == 1) {
            firstCard = cardsArray[card];
            if (firstCard > 200) {
                firstCard = firstCard - 100;
            }
            cardNumber = 2;
            clickedFirst = card;

            iv.setEnabled(false);
        }
        else if(cardNumber == 2){
            secondCard = cardsArray[card];
            if(secondCard > 200){
                secondCard = secondCard - 100;
            }
            cardNumber = 1;
            clickedSecond = card;

            iv_11.setEnabled(false);
            iv_12.setEnabled(false);
            iv_13.setEnabled(false);
            iv_14.setEnabled(false);
            iv_21.setEnabled(false);
            iv_22.setEnabled(false);
            iv_23.setEnabled(false);
            iv_24.setEnabled(false);

            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run(){
                    calculate();
                }
            }, 1000);
        }
    }

    private void calculate(){
        if(firstCard == secondCard) {
            if(clickedFirst == 0){
                iv_11.setVisibility(View.INVISIBLE);
            }
            else if(clickedFirst == 1){
                iv_12.setVisibility(View.INVISIBLE);
            }
            else if(clickedFirst == 2){
                iv_13.setVisibility(View.INVISIBLE);
            }
            else if(clickedFirst == 3){
                iv_14.setVisibility(View.INVISIBLE);
            }
            else if(clickedFirst == 4){
                iv_21.setVisibility(View.INVISIBLE);
            }
            else if(clickedFirst == 5){
                iv_22.setVisibility(View.INVISIBLE);
            }
            else if(clickedFirst == 6){
                iv_23.setVisibility(View.INVISIBLE);
            }
            else if(clickedFirst == 7){
                iv_24.setVisibility(View.INVISIBLE);
            }

            if(clickedSecond == 0){
                iv_11.setVisibility(View.INVISIBLE);
            }
            else if(clickedSecond == 1){
                iv_12.setVisibility(View.INVISIBLE);
            }
            else if(clickedSecond == 2){
                iv_13.setVisibility(View.INVISIBLE);
            }
            else if(clickedSecond == 3){
                iv_14.setVisibility(View.INVISIBLE);
            }
            else if(clickedSecond == 4){
                iv_21.setVisibility(View.INVISIBLE);
            }
            else if(clickedSecond == 5){
                iv_22.setVisibility(View.INVISIBLE);
            }
            else if(clickedSecond == 6){
                iv_23.setVisibility(View.INVISIBLE);
            }
            else if(clickedSecond == 7){
                iv_24.setVisibility(View.INVISIBLE);
            }
        }
        else{
            iv_11.setImageResource(R.drawable.back);
            iv_12.setImageResource(R.drawable.back);
            iv_13.setImageResource(R.drawable.back);
            iv_14.setImageResource(R.drawable.back);
            iv_21.setImageResource(R.drawable.back);
            iv_22.setImageResource(R.drawable.back);
            iv_23.setImageResource(R.drawable.back);
            iv_24.setImageResource(R.drawable.back);
        }
        iv_11.setEnabled(true);
        iv_12.setEnabled(true);
        iv_13.setEnabled(true);
        iv_14.setEnabled(true);
        iv_21.setEnabled(true);
        iv_22.setEnabled(true);
        iv_23.setEnabled(true);
        iv_24.setEnabled(true);

        chackEnd();
    }

    private void chackEnd(){
        if(iv_11.getVisibility() == View.INVISIBLE &&
                iv_12.getVisibility() == View.INVISIBLE &&
                iv_13.getVisibility() == View.INVISIBLE &&
                iv_14.getVisibility() == View.INVISIBLE &&
                iv_21.getVisibility() == View.INVISIBLE &&
                iv_21.getVisibility() == View.INVISIBLE &&
                iv_23.getVisibility() == View.INVISIBLE &&
                iv_24.getVisibility() == View.INVISIBLE ){


            AlertDialog.Builder dialog = new AlertDialog.Builder(activity4.this);
            dialog.setTitle("恭喜你過關了喔＼( ^▽^ )／");
            dialog.setMessage("要不要再玩一次呢(≧▽≦)");
            dialog.setNegativeButton("結束",new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface arg0, int arg1) {
                    Intent it = new Intent(activity4.this, MainActivity.class);
                    startActivity(it);
                    finish();
                }
            });
            dialog.setPositiveButton("再玩一次",new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface arg0, int arg1) {
                    Intent it = new Intent(activity4.this, activity4.class);
                    startActivity(it);
                    finish();
                }

            });
            dialog.show();
        }
    }

    private void frontOfCardResources() {
        image101 = R.drawable.ic101;
        image102 = R.drawable.ic102;
        image103 = R.drawable.ic103;
        image104 = R.drawable.ic104;
        image201 = R.drawable.ic201;
        image202 = R.drawable.ic202;
        image203 = R.drawable.ic203;
        image204 = R.drawable.ic204;
    }
}