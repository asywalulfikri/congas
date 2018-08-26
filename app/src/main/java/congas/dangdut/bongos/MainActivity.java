package congas.dangdut.bongos;

import android.content.Intent;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.facebook.ads.AdSize;

public class MainActivity extends AppCompatActivity {

    private int ss1,ss2,ss3,ss4,ss5,ss6,ss7,ss8,ss9,ss10,ss11;
    SoundPool sp;
    private ImageView congakiri,congatengah,congakanan,congaleft,congacenter,congaright;
    private ImageView symballeft,symbalright,cowbell,crash,tamborin;


    private com.facebook.ads.AdView adView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sp = new SoundPool(5, AudioManager.STREAM_MUSIC, 0);



        // congas bongos tambuo  206661536572824_206664393239205
       //  congas bongos minang 	1705254486192002_1705255896191861
        adView = new com.facebook.ads.AdView(this, "1705254486192002_1705255896191861", AdSize.BANNER_HEIGHT_50);
        LinearLayout adContainer = findViewById(R.id.banner_container);
        adContainer.addView(adView);
        adView.loadAd();

        insertSong();

        congatengah = findViewById(R.id.conga_tengah);
        congakanan = findViewById(R.id.conga_kanan);

        congaleft = findViewById(R.id.conga_left);
        congacenter = findViewById(R.id.conga_center);
        congaright = findViewById(R.id.conga_right);

        symballeft = findViewById(R.id.symbal_left);
        symbalright = findViewById(R.id.symbal_right);

        cowbell = findViewById(R.id.cowbell);
        tamborin = findViewById(R.id.tamborin);
        crash = findViewById(R.id.crash);


        symballeft.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {

                if (motionEvent == null || motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    final Animation myAnim = AnimationUtils.loadAnimation(MainActivity.this, R.anim.button);
                    symballeft.startAnimation(myAnim);
                    sp.play(ss7, 1, 1, 0, 0, 0);

                }
                return true;
            }
        });

        symbalright.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {

                if (motionEvent == null || motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    final Animation myAnim = AnimationUtils.loadAnimation(MainActivity.this, R.anim.button);
                    symbalright.startAnimation(myAnim);
                    sp.play(ss8, 1, 1, 0, 0, 0);

                }
                return true;
            }
        });

        congatengah.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {

                if (motionEvent == null || motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    final Animation myAnim = AnimationUtils.loadAnimation(MainActivity.this, R.anim.button);
                    congatengah.startAnimation(myAnim);
                    sp.play(ss2, 1, 1, 0, 0, 0);

                }
                return true;
            }
        });

        congakanan.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {

                if (motionEvent == null || motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    final Animation myAnim = AnimationUtils.loadAnimation(MainActivity.this, R.anim.button);
                    congakanan.startAnimation(myAnim);
                    sp.play(ss3, 1, 1, 0, 0, 0);

                }
                return true;
            }
        });

        congaleft.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {

                if (motionEvent == null || motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    final Animation myAnim = AnimationUtils.loadAnimation(MainActivity.this, R.anim.button);
                    congaleft.startAnimation(myAnim);
                    sp.play(ss4, 1, 1, 0, 0, 0);

                }
                return true;
            }
        });

        congacenter.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {

                if (motionEvent == null || motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    final Animation myAnim = AnimationUtils.loadAnimation(MainActivity.this, R.anim.button);
                    congacenter.startAnimation(myAnim);
                    sp.play(ss5, 1, 1, 0, 0, 0);

                }
                return true;
            }
        });

        congaright.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {

                if (motionEvent == null || motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    final Animation myAnim = AnimationUtils.loadAnimation(MainActivity.this, R.anim.button);
                    congaright.startAnimation(myAnim);
                    sp.play(ss6, 1, 1, 0, 0, 0);

                }
                return true;
            }
        });


        cowbell.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {

                if (motionEvent == null || motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    final Animation myAnim = AnimationUtils.loadAnimation(MainActivity.this, R.anim.button);
                    cowbell.startAnimation(myAnim);
                    sp.play(ss9, 1, 1, 0, 0, 0);

                }
                return true;
            }
        });

        tamborin.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {

                if (motionEvent == null || motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    final Animation myAnim = AnimationUtils.loadAnimation(MainActivity.this, R.anim.button);
                    tamborin.startAnimation(myAnim);
                    sp.play(ss10, 1, 1, 0, 0, 0);

                }
                return true;
            }
        });

        crash.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {

                if (motionEvent == null || motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    final Animation myAnim = AnimationUtils.loadAnimation(MainActivity.this, R.anim.button);
                    crash.startAnimation(myAnim);
                    sp.play(ss11, 1, 1, 0, 0, 0);

                }
                return true;
            }
        });




    }


    public void insertSong(){
        ss2 = sp.load(this, R.raw.conga_tengah, 1);
        ss3 = sp.load(this, R.raw.conga_kanan, 1);
        ss4 = sp.load(this, R.raw.conga_left, 2);
        ss5 = sp.load(this, R.raw.conga_center, 1);
        ss6 = sp.load(this,R.raw.conga_right,1);

        ss7 = sp.load(this,R.raw.timbale_left,1);
        ss8 = sp.load(this,R.raw.timbale_right,1);

        ss9 = sp.load(this,R.raw.cowbell,1);
        ss10 = sp.load(this,R.raw.tambourine,1);
        ss11 = sp.load(this,R.raw.crash_right,1);
    }



  public void onBackPressed() {
        super.onBackPressed();
        sp.release();
        Intent intent = new Intent();
        setResult(RESULT_OK,intent);
        finish();
    }

    public void onResume(){
        super.onResume();

        insertSong();

    }

}
