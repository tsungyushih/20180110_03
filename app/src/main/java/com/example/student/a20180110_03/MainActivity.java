package com.example.student.a20180110_03;

import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    Handler handler=new Handler(){
        public void handleMessage(Message msg){
            super.handleMessage(msg);
            Log.d("MSG","取得Message");
            Bundle b2=msg.getData();
            String str = b2.getString("data");
            Log.d("MSG","data:"+str);
        }
    };
    public void click1(View v)
    {
        Message msg = new Message();
        //handler.sendMessage(msg);
        Bundle b1=new Bundle();
        b1.putString("data","mydata" );
        msg.setData(b1);
        handler.sendMessageDelayed(msg,3000);
    }

}
