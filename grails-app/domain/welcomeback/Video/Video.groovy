package welcomeback.Video
import welcomeback.User.UserVideo

class Video {
	String name
	int length
	int releaseYear
	Rating rating
	Date releaseDate
	static hasMany = [videoGenres:VideoGenre, userVideos : UserVideo]
    static constraints = {
    }
}
