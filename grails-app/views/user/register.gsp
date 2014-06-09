<html>
	<head>
		<meta name ="layout" content = "main"/>
		<title>Register</title>
	</head>
	<body>	
		<g:form>
			User name: <g:textField name="username"/><br>
			First Name: <g:textField name="firstName"/><br>
			Last Name: <g:textField name="lastName"/><br>
			Password: <g:passwordField name = "password"/>
			<g:actionSubmit value="Register" action = "create"/>
		</g:form>
	</body>
</html>