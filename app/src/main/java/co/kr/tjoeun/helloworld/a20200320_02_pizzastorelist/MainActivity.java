package co.kr.tjoeun.helloworld.a20200320_02_pizzastorelist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import co.kr.tjoeun.helloworld.a20200320_02_pizzastorelist.adapter.PizzaStoreAdapter;
import co.kr.tjoeun.helloworld.a20200320_02_pizzastorelist.databinding.ActivityMainBinding;
import co.kr.tjoeun.helloworld.a20200320_02_pizzastorelist.datas.PizzaStore;

public class MainActivity extends BaseActivity {

    List<PizzaStore> pizzaStores = new ArrayList<>();
    PizzaStoreAdapter psa = null;

    ActivityMainBinding binding = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        setupEvents();
        setValues();
    }

    @Override
    public void setupEvents() {

    }

    @Override
    public void setValues() {

        psa = new PizzaStoreAdapter(mContext, R.layout.pizza_store_list_item, pizzaStores);
        binding.pizzaListView.setAdapter(psa);

    }
}
