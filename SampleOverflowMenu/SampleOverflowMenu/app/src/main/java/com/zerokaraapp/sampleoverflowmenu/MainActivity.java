package com.zerokaraapp.sampleoverflowmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //アプリバーにメニューを作成するメソッド
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //インフレーターを使ってメニューを表示させる
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.overflow_menu, menu);
        return true;
    }

    //メニューボタンを押したときの反応を定義するメソッド
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //テキストビューに文字を表示する様に定義
        //押されたボタンのIDで条件分岐を行う
        TextView textView = findViewById(R.id.text_view);
        switch(item.getItemId()) {
            case R.id.mercury:
                textView.setText(R.string.mercury);
                return true;
            case R.id.venus:
                textView.setText(R.string.venus);
                return true;
            case R.id.earth:
                textView.setText(R.string.earth);
                return true;
            case R.id.mars:
                textView.setText(R.string.mars);
                return true;
            case R.id.jupiter:
                textView.setText(R.string.jupiter);
                return true;
            case R.id.saturn:
                textView.setText(R.string.saturn);
                return true;
            case R.id.uranus:
                textView.setText(R.string.uranus);
                return true;
            case R.id.neptune:
                textView.setText(R.string.neptune);
                return true;
            default:
                //オーバーライド元の結果を返すように指示
                return super.onOptionsItemSelected(item);
        }

    }
}