package model

data class Movie(
    var title: String,
    var gender: MovieGender,
    var classfication: MovieClassfication,
    var yearOfRealease: Short,
    var director: String,
    var duration: Short,
    var screenWriter: String,
)

