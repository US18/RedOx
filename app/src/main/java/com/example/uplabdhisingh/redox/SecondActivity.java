package com.example.uplabdhisingh.redox;

import android.content.Intent;
import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import net.glxn.qrgen.android.QRCode;

public class SecondActivity extends AppCompatActivity
{

   /* TextView displayTextView;*/
    public String stringEncoded = FirstActivity.firstEncodedString;
    ImageView qrCodeImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        qrCodeImageView = (ImageView) findViewById(R.id.iv_qr_code);

       /* displayTextView=(TextView) findViewById(R.id.tv_display_string);*/

        Intent intentToReceive = getIntent();
        Bitmap lBitmap = QRCode.from(stringEncoded).bitmap();
        qrCodeImageView.setImageBitmap(lBitmap);

       /* displayTextView.setText(stringEncoded);*/
    }

    @Override
    public void onBackPressed()
    {
        super.onBackPressed();
        System.gc();
        Intent intentToFirst = new Intent(SecondActivity.this,FirstActivity.class);
        intentToFirst.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intentToFirst);
        finish();
    }
}
