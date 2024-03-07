@import exercise.dto.users.UsersPage
@import exercise.model.User
<%--@import exercise.dto.users.UsersPage--%>
@import exercise.dto.users.UserPage
@param UserPage user

<html lang="en">
<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <title>List of Users</title>
</head>
<body>
<div class="mx-auto p-4 py-md-5">
    <main>
        <p>${user.getUser().getFirstName()}</p>
        <p>${user.getUser().getLastName()}</p>
        <p>${user.getUser().getEmail()}</p>
    </main>
</div>
</body>
</html>
