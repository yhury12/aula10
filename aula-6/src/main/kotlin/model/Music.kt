package model

data class Music(
    var title: String,
    var duration: Short,
    val musicGender: MusicGender.MusicGender,
    var yearOfRealease: Short,
    var composer: String,
    var record: String,
    val album: String,

    ){
    override fun toString(): String {
        return "A musica $title foi escrita por $composer no ano de $yearOfRealease e gravada pela gravadora $record"
    }
}
