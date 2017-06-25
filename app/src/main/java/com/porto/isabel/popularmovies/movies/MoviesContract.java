package com.porto.isabel.popularmovies.movies;

import android.os.Bundle;

import com.porto.isabel.popularmovies.model.moviedb.Movie;
import com.porto.isabel.popularmovies.movies.domain.SortBy;

import java.util.List;

import rx.Observable;

/**
 * Created by belporto on 11/06/2017.
 */

public interface MoviesContract {

    interface PresenterContract {

        void onCreate(Bundle savedInstanceState);

        void onDestroy();

        void onSortByClicked();

        void onSortOptionClicked(SortBy sortBy);

        void onSaveInstanceState(Bundle outState);

        void onMovieClicked(Movie movie);

        void onRefresh();
    }

    interface ViewContract {

        void showMovies(List<Movie> movies);

        void showProgress();

        void showError();

        void showSortByOptions(SortBy sortBy);
    }

    interface InteractorContract {
        Observable<List<Movie>> getMovies();

        void setSortBy(SortBy sortBy);

        SortBy getSortBy();
    }

    interface RouterContract {
        void showDetails(Movie movie);
    }
}
