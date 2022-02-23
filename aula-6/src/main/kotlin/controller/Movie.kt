package controller

import model.MovieClassfication
import model.MovieGender

class Movie {
    fun movieFactory(
        title: String,
        gender: MovieGender,
        classfication: MovieClassfication,
        yearOfRealease: Short,
        director: String,
        duration: Short,
        screenWriter: String
    ) = model.Movie(
        title = title,
        gender = gender,
        classfication = classfication,
        yearOfRealease = yearOfRealease,
        director = director,
        duration = duration,
        screenWriter = screenWriter
        )
}