package tw.pu.edu.tw.s1071465.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

public class activity3 extends AppCompatActivity implements GestureDetector.OnGestureListener,View.OnTouchListener{
    int PictureNo=0;
    int TotalPictures =3;
    ImageView img;
    GestureDetector gd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity3);

        gd=new GestureDetector(this,this); //手勢
        img=(ImageView)findViewById(R.id.img);
        img.setOnTouchListener(this);
        int PictureNo,totalPicture;
        PictureNo=0;
        totalPicture =3;

        getSupportActionBar().hide(); //隱藏標題
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_FULLSCREEN); //隱藏狀態
    }
    public void Go(View v)
    {
        Intent it = new Intent(activity3.this, activity4.class);
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
                img.setImageResource(R.drawable.b1);
                break;
            }
            case 1:{
                img.setImageResource(R.drawable.b2);
                break;
            }
            case 2:{
                img.setImageResource(R.drawable.b3);
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
