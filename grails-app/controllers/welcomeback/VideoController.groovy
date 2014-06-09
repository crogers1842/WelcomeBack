package welcomeback

import java.text.SimpleDateFormat
import java.util.logging.Logger;

import welcomeback.User.UserVideo
import welcomeback.Video.Video
import welcomeback.Video.Genre

class VideoController {

    def index() {
		def videos =[]
		Video.findAll {}.each{
			video->
			def newVideo = [:]
			StringBuffer buffy = new StringBuffer();
			video.videoGenres.each{
				videoGenres->
				buffy.append(videoGenres.genre.name+"\n")
			}
			
			SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy")
			newVideo["genres"] = buffy.toString()
			newVideo["name"] = "${video.name}(${video.releaseYear})"
			newVideo["length"] = video.length
			newVideo["releaseDate"] = format.format(video.releaseDate)
			newVideo["ratingName"] = video.rating.name
			newVideo["ratingId"] = video.rating.id
			newVideo["id"] = video.id
			videos.add(newVideo)
		}
		render(view:"index.gsp", model : [videos:videos])
	}
	def create()
	{
		
	}
	
	def returnVideo()
	{
		UserVideo video = UserVideo.get(params["id"])
		video.delete()
		redirect(controller: "user", action: "home")
		
	}
}
