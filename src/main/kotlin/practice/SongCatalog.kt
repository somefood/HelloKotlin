package practice

class SongCatalog(
    val title: String,
    val artist: String,
    val year: Int,
    val playCount: Int
) {

    val isPopular: Boolean
        get() = playCount >= 1000

    override fun toString(): String {
        return "[$title], performed by [${artist}], was released in [${year}]"
    }
}

fun main() {
    val songCatalog = SongCatalog(title = "heap", artist = "seokju", year = 1990, playCount = 50)
    println(songCatalog)
}