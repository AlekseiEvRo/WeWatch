package com.example.wewatch.main

import com.example.wewatch.Model.Movie

class MainContract {
    interface PresenterInterface {
        fun getMyMoviesList()
        fun stop()
        fun onDeleteTapped(selectedMovies: HashSet<*>)
    }
    interface ViewInterface {
        fun displayMovies (movieList: List <Movie>)
        fun displayNoMovies ()
        fun displayMessage (message: String )
        fun displayError (message: String )
    }
}