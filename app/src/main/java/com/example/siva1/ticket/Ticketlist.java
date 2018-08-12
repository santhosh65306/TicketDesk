package com.example.siva1.ticket;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class Ticketlist extends Fragment {
    ListView tickets;


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ArrayList<Transaction> transactionArrayList=new ArrayList<>();
        transactionArrayList.add(new Transaction(1,1,"Honey","Central",2,"14/2/2018-4:00pm",2));
        transactionArrayList.add(new Transaction(2,1,"Honey","Central",2,"14/2/2018-4:00pm",2));
        transactionArrayList.add(new Transaction(3,2,"Honey","Central",2,"14/2/2018-4:00pm",2));
        transactionArrayList.add(new Transaction(4,3,"Honey","Central",2,"14/2/2018-4:00pm",2));
        final CustomListAdapter customListAdapter=new CustomListAdapter(getContext(),R.layout.leadlistitem,transactionArrayList);
        tickets= (ListView) view.findViewById(R.id.ll_translist);
        tickets.setAdapter(customListAdapter);

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_sellerlist,container,false);
    }
}
