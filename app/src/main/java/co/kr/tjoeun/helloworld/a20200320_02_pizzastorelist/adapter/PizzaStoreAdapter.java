package co.kr.tjoeun.helloworld.a20200320_02_pizzastorelist.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

import co.kr.tjoeun.helloworld.a20200320_02_pizzastorelist.R;
import co.kr.tjoeun.helloworld.a20200320_02_pizzastorelist.datas.PizzaStore;

public class PizzaStoreAdapter extends ArrayAdapter<PizzaStore> {

    Context mContext;
    List<PizzaStore> mList;
    LayoutInflater inf;


    public PizzaStoreAdapter(@NonNull Context context, int resource, @NonNull List<PizzaStore> objects) {
        super(context, resource, objects);

        mContext = context;
        mList = objects;
        inf =LayoutInflater.from(mContext)
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View row = convertView;

        if (row == null) {
            row==inf.inflate((R.layout.pizza_store_list_item, null));
        }
        return row;
    }
}
