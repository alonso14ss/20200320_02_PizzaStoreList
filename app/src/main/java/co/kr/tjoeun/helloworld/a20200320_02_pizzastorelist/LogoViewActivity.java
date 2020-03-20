package co.kr.tjoeun.helloworld.a20200320_02_pizzastorelist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.bumptech.glide.Glide;

import co.kr.tjoeun.helloworld.a20200320_02_pizzastorelist.databinding.ActivityLogoViewBinding;

public class LogoViewActivity extends BaseActivity {

    String url = null;
    ActivityLogoViewBinding binding = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_logo_view);
        setupEvents();
        setValues();
    }

    @Override
    public void setupEvents() {

    }

    @Override
    public void setValues() {

        url = getIntent().getStringExtra("logoUrl");
        Glide.with(mContext).load(url).into(binding.bigLogoImg);

    }
}
