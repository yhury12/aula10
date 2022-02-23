package controller

import model.Music
import model.MusicGender

class Music {
    fun musicfactory(
        title: String,
        duration: Short,
        musicGender: MusicGender.MusicGender,
        yearOfRealease: Short,
        album: String,
        composer: String,
        record: String,
    ): Music = model.Music(

     title = title,
    yearOfRealease = yearOfRealease,
    duration = duration,
    musicGender = musicGender,
    album = album,
    composer = composer,
    record = record,
    )

}