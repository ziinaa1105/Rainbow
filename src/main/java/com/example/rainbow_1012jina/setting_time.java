package com.example.rainbow_1012jina;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

public class setting_time extends AppCompatActivity {

    public int hNumber;
    public int mNumber;

    public TextView hTextNumber;
    public TextView mTextNumber;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.setting_time_page);
        if(savedInstanceState!=null){
            hNumber = savedInstanceState.getInt("hour",0);
            mNumber = savedInstanceState.getInt("min",0);
        }
        hTextNumber = (TextView) findViewById(R.id.hourNumber);
        hTextNumber.setText(hNumber+"");

        mTextNumber = (TextView) findViewById(R.id.minNumber);
        mTextNumber.setText(mNumber+"");
    }

    public void mOnClick(View v){
        switch (v.getId()){
            case R.id.hourInc:
                hNumber++;
                break;
            case R.id.hourDec:
                hNumber--;
                break;
            case R.id.minInc:
                mNumber+=15;
                break;
            case R.id.minDec:
                mNumber-=15;
                break;
        }
    }
}
