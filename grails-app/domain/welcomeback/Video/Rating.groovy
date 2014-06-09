package welcomeback.Video

class Rating {
	String name
	int minAge
	static hasMany = [videos:Video]
    static constraints = {
    }
}

