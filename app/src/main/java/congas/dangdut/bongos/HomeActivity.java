package congas.dangdut.bongos;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;
import com.facebook.ads.InterstitialAdListener;

/**
 * Created by 8villages on 11/7/2017.
 */

public class HomeActivity extends AppCompatActivity {

    private Button btn1;
    private boolean interstitialCanceled = false;
    private boolean exit = true;
    private com.facebook.ads.InterstitialAd interstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        interstitialAd = new com.facebook.ads.InterstitialAd(this, "1705254486192002_1853070418077074");

        AdView adView = new com.facebook.ads.AdView(this, "1705254486192002_1705255896191861", AdSize.BANNER_HEIGHT_50);
        LinearLayout adContainer = findViewById(R.id.banner_container);
        adContainer.addView(adView);
        adView.loadAd();


        interstitialAd.setAdListener(new InterstitialAdListener() {
            @Override
            public void onInterstitialDisplayed(Ad ad) {
                // Interstitial displayed callback
            }

            @Override
            public void onInterstitialDismissed(Ad ad) {
                // Interstitial dismissed callback
            }

            @Override
            public void onError(Ad ad, AdError adError) {
                // Ad error callback

            }

            @Override
            public void onAdLoaded(Ad ad) {
                // Show the ad when it's done loading.
                interstitialAd.show();
            }

            @Override
            public void onAdClicked(Ad ad) {
                // Ad clicked callback
            }

            @Override
            public void onLoggingImpression(Ad ad) {
                // Ad impression logged callback
            }
        });

        btn1 = findViewById(R.id.btn1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                interstitialAd.loadAd();
                Intent intent = new Intent(HomeActivity.this,MainActivity.class);
                startActivity(intent);
                final Animation myAnim = AnimationUtils.loadAnimation(HomeActivity.this, R.anim.button);
                btn1.startAnimation(myAnim);

            }
        });




    }



    @SuppressLint("InflateParams")
    public void confirmSignout() {
        LayoutInflater inflater = LayoutInflater.from(HomeActivity.this);
        View view = inflater.inflate(R.layout.dialog_info, null);

        TextView messageTv = view.findViewById(R.id.tv_message);

        messageTv.setText(HomeActivity.this
                .getString(R.string.text_confirm_signout));

        AlertDialog.Builder builder = new AlertDialog.Builder(HomeActivity.this);

        builder.setView(view)
                .setNegativeButton(getString(R.string.text_no), new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                })
                .setPositiveButton(getString(R.string.text_yes),
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog,
                                                int which) {
                                moveTaskToBack(true);
                                finish();
                                System.exit(1);

                            }
                        });

        builder.create().show();
    }

    public void onBackPressed() {
        if(exit== true){
            confirmSignout();
        }else{
            moveTaskToBack(true);
            finish();
            System.exit(1);
        }
    }

    public void onResume(){
        super.onResume();

    }

}

