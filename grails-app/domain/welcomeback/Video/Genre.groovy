package welcomeback.Video

class Genre {
	String name
	String description
	static hasMany = [videoGenres:VideoGenre]
    static constraints = {
		description nullable :true
    }
}
