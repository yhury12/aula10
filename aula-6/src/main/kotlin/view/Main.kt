package view

import model.MovieClassfication
import model.MovieGender
import model.MusicGender

fun main() {
    val musicController = controller.Music()
    val sweetChildOMine = musicController.musicfactory(
        title = "sweet Child O Mine",
        composer = "Guns n' Roses",
        album = "Appetite for Destruction",
        yearOfRealease = 1988,
        record = "Geffen Records",
        musicGender = MusicGender.MusicGender.ROCK,
        duration = 354

    )

    println(sweetChildOMine)

    val movieController = controller.Movie()
    val up = movieController.movieFactory(
        title = "up",
        gender = MovieGender.AVENTURA,
        classfication = MovieClassfication.LIVRE,
        yearOfRealease = 2012,
        director = "yhury",
        duration = 9030,
        screenWriter = "jeve"
    )
    println(up)


}
