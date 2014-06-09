package welcomeback



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional
import welcomeback.User.User
import welcomeback.User.UserRole
import org.springframework.security.access.annotation.Secured
import welcomeback.User.Role

@Transactional(readOnly = false)
class UserController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]
	def index()
	{
		
	}
	
	def home()
	{
		User user = session.currentUser
		def videos = user.userVideos.collect{
			[expirationDate : it.expirationDate,
			name : it.video.name]
		}
		
		render(view:"home.gsp", model : [user:user,videos:videos])
	}
	
	def login()
	{
	}
	
	def loginAttempt()
	{
		User user = User.findByUsernameAndPassword(params["username"],params["password"])
		if(user !=null)
		{
			session.currentUser = user
			home()
		}
		else
			render(view:"login.gsp")
	}
	
	def register()
	{
		
	}
	
	@Secured("permitAll")
	def create()
	{
		def user = new User(username: params["username"], firstName: params["firstName"], lastName: params["lastName"], password :params["password"], userRoles : null)	
		if(user.save(flush:true))
		{
			def userRole = new UserRole(user: user, role: Role.findByAuthority("ROLE_USER"))
			userRole.save(flush:true)
			render(view:"home.gsp", model :[user:user])
		}
		else
			render(view:"register.gsp")
	}
	
	def logout()
	{
		session.currentUser = null
		redirect(uri: "")
	}
}
