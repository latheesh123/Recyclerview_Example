package com.example.latheeshvirupakshi.contextmenu;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.textservice.TextInfo;
import android.widget.TextView;

import java.util.List;

/**
 * Created by latheeshvirupakshi on 3/15/17.
 */

public class MoviesAdapter extends RecyclerView.Adapter<MoviesAdapter.MyViewHolder> {



    private List<Movie> moviesList;


    public MoviesAdapter(List<Movie> moviesList)
    {


        this.moviesList=moviesList;



    }

    @Override
    public MoviesAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {


        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.movie_list_row,parent,false);

        return new MyViewHolder(view);







    }

    @Override
    public void onBindViewHolder(MoviesAdapter.MyViewHolder holder, int position) {


        Movie movie=moviesList.get(position);
        holder.title.setText(movie.getTitle());
        holder.genre.setText(movie.getGenre());
        holder.year.setText(movie.getYear());



    }

    @Override
    public int getItemCount() {

        return moviesList.size();

    }




    public class MyViewHolder extends RecyclerView.ViewHolder{


        public TextView title,year,genre;

        public MyViewHolder(View itemView) {
            super(itemView);


            title=(TextView) itemView.findViewById(R.id.title);
            genre=(TextView)itemView.findViewById(R.id.genre);
            year=(TextView)itemView.findViewById(R.id.year);







        }
    }
}
