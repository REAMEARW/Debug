package tw.pu.edu.tw.s1071465.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

public class activity2 extends AppCompatActivity implements GestureDetector.OnGestureListener,View.OnTouchListener {
    int PictureNo=0;
    int TotalPictures =6;
    ImageView img;
    GestureDetector gd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_activity2);
        gd=new GestureDetector(this,this); //手勢
        img=(ImageView)findViewById(R.id.img);
        img.setOnTouchListener(this);
        int PictureNo,totalPicture;
        PictureNo=0;
        totalPicture =6;
        getSupportActionBar().hide(); //隱藏標題
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_FULLSCREEN); //隱藏狀態
    }
    public void next(View v) {
        Intent it = new Intent(activity2.this, activity3.class);
        startActivity(it);
        finish();
    }

    @Override
    public boolean onDown(MotionEvent e) {
        return false;
    }

    @Override
    public void onShowPress(MotionEvent e) {

    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        return false;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        return false;
    }

    @Override
    public void onLongPress(MotionEvent e) {

    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        if (e1.getX()>e2.getX()){  //向左滑動
            PictureNo++;

        }
        else{     //向右滑動
            PictureNo--;

        }
        ShowPicture();

        return false;
    }
    public void  ShowPicture (){

        switch(PictureNo){
            case 0:{
                img.setImageResource(R.drawable.a0);
                break;
            }
            case 1:{
                img.setImageResource(R.drawable.a1);
                break;
            }
            case 2:{
                img.setImageResource(R.drawable.a2);
                break;
            }
            case 3:{
                img.setImageResource(R.drawable.a3);
                break;
            }
            case 4:{
                img.setImageResource(R.drawable.a4);
                break;
            }
            case 5:{
                img.setImageResource(R.drawable.a5);
                break;
            }
        }
    }
    @Override
    public boolean onTouch(View v, MotionEvent event) {
        gd.onTouchEvent(event);
        return true;
    }
}
