package com.dtje.dtjenew;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class BeverageFragment extends Fragment {


    public BeverageFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_beverage, container, false);
        ListView listView=(ListView)rootView.findViewById(R.id.listView_beverage);
        createList();
        listView.setAdapter(new OrderListAdapter(rootView.getContext(),menuItems));
        return rootView;
    }

    private List<MenuItem> menuItems=new ArrayList<MenuItem>();
    private void createList(){
        MenuItem m1=new MenuItem();
        m1.setName("Teriyaki Chicken Bento");
        m1.setPrice("RM 15.90");
        m1.setPicture(R.drawable.fastfood);

        menuItems.add(m1);
    }
}
