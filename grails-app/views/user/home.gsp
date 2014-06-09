<html>
	<head>
		<meta name = "layout" content = "main"/>
		<title>Grails Home</title>
	</head>
	<body>
	<div class = "video-management">
			<g:link controller = "video" action = "index">Rent Video</g:link>
		</div>
		<p>Hello ${user.firstName} welcome to Grails Video Rental.</p>
		<div class = "video-table">
			<table>
				<tr>
					<th>Name</th>
					<th>Expiration Date </th>
					<th>Return</th>
				</tr>
				<g:each in="${videos}" var="video">
				<tr>
					<td>${video.name} </td>
					<td>${video.expirationDate } </td>
					<td><g:link controller = "video" action = "returnVideo" params = "[id:'${video.id}'] ">Return</g:link></td>
				</tr>
				</g:each>
			</tabble>
		</div>
		
	</body>
</html>