package com.poo.truyencuoi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class TittleActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_chude);
        initView();

    }

    private void initView() {
        findViewById(R.id.iv_back_actionbar_chude).setOnClickListener(this);
        findViewById(R.id.ln_tittle).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.iv_back_actionbar_chude){
            startActivity(new Intent(this,StoryActivity.class));
        }else if(v.getId()==R.id.ln_tittle){
            startActivity(new Intent(this,ContentActivity.class));
        }
    }
}
