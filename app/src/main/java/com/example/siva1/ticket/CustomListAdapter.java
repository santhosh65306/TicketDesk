package com.example.siva1.ticket;

import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by siva1 on 20/09/2017.
 * List adapter for customer list view
 */

public class CustomListAdapter extends ArrayAdapter<Transaction>{
    Context context;
    int layoutId;
    ArrayList<Transaction>tickets;
    TextView name,hall,date,count;
    Typeface face_reg;


    public CustomListAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull List<Transaction> objects) {
        super(context,resource,objects);

        this.context=context;
        this.layoutId=resource;
        this.tickets= (ArrayList<Transaction>) objects;



    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View row=convertView;
        String portfolios[]=new String[10];
        portfolios[0]="Tractor Loans";
        portfolios[1]="Utility Vehicle Loans";
        portfolios[2]="Car Loans";
        portfolios[3]="3 Wheeler Loans";
        portfolios[4]="Commercial Vehicle Loans";
        portfolios[5]="Two Wheeler Loans";
        portfolios[6]="Used Vehicle Loans";
        portfolios[7]="Home Loans";
        portfolios[8]="Personal Loans";
        portfolios[9]="SME Loans";
        String stages[]=new String[7];
        stages[0]="0-30";
        stages[1]="30-60";
        stages[2]="60-90";
        stages[3]="90-120";
        stages[4]="120-150";
        stages[5]="150-180";
        stages[6]="180+";



        LayoutInflater inflater = ((Activity) context).getLayoutInflater();
        row=inflater.inflate(layoutId,parent,false);
        name= (TextView) row.findViewById(R.id.tv_list_name);
        hall= (TextView) row.findViewById(R.id.tv_list_hall);
        date= (TextView) row.findViewById(R.id.tv_list_date);
        count= (TextView) row.findViewById(R.id.rect_out);

        name.setTypeface(face_reg);

        Transaction current=tickets.get(position);
        name.setText(current.getMoviename());
        hall.setText(current.getHallname());
        date.setText(current.getDate());
        count.setText(current.getCount());
        return row;
    }
    static class Leadholder{
        String name;
        String product;
        String leadscore;
    }
}

