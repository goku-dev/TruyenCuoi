package com.poo.truyencuoi;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.io.InputStream;

public class StoryActivity extends AppCompatActivity implements View.OnClickListener {
    public static final String[] NAME_STORY_VN = new String[]{"Con gái", "Công sở",
            "Con nít", "Con trai", "Cực hài",
            "Cười 18", "Dân gian", "Gia đình", "Giao thông", "Học sinh", "Hội chợ cười",
            "Khoa học", "Nghề nghiệp", "Người lớn", "Nhà hàng", "Say xỉn", "Tam quốc", "Tây du kí chế"
            , "Thế giới", "Thơ ca cười", "Thơ vui", "Tiếu lâm", "Tình yêu", "Tôn giáo", "Trạng Quỳnh", "Truyện bựa",
            "Việt nam và thế giới", "Vova", "Y tế"};
    public static final String[] IMG_VN = new String[]{"congai", "congso", "connit", "contrai", "cuchai", "cuoi18", "dangian", "giadinh", "giaothong", "hocsinh", "hoichocuoi", "khoahoc", "nghenghiep", "nguoilon", "nhahang", "sayxin", "tamquoc", "taydukiche", "thegioi", "thocacuoi", "thovui", "tieulam", "tinhyeu", "tongiao", "trangquynh", "truyenbua", "vnvathegioi", "vova", "yte"};


    public static final String[] NAME_STORY_ENG = new String[]{"Animals", "Blone",
            "Dirty", "International", "Kids", "School", "Sport", "Workplace", "Yo mama"};
    public static final String[] IMG_EN = new String[]{"animals", "blone",
            "dirty", "international", "kids", "school", "sport", "workplace", "yo-mama"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_main_story);
        initView();
    }

    private void initView() {
        LinearLayout lnMainStory = findViewById(R.id.ln_main);
        lnMainStory.removeAllViews();

        for (int i = 0; i < IMG_VN.length; i++) {
            View itemView = LayoutInflater.from(this).inflate(R.layout.item_story, null);

            findData(itemView, i);
            lnMainStory.addView(itemView);
        }

    }

    private void findData(View itemView, int i) {
        ImageView ivImage = itemView.findViewById(R.id.iv_story);
        TextView textView = itemView.findViewById(R.id.tv_story);

        ivImage.setOnClickListener(this);
        textView.setOnClickListener(this);

        textView.setText(NAME_STORY_VN[i]);

        try {
            InputStream inputStream = getAssets().open("icon/vn/" + IMG_VN[i]+".png");
            Bitmap image = BitmapFactory.decodeStream(inputStream);
            ivImage.setImageBitmap(image);

        } catch (Exception e) {
            e.getStackTrace();
        }
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.iv_story || v.getId()==R.id.tv_story){
            startActivity(new Intent(this,TittleActivity.class));
        }
    }
}
