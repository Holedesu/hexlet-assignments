@import exercise.dto.users.UsersPage
@import exercise.model.User
@param UsersPage users

<html lang="en">
<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <title>List of Users</title>
</head>
<body>
<div class="mx-auto p-4 py-md-5">
    <table>
        <tr>
    @for(User user : users.getUsers())
        <td> <a href="users/${user.getId()}">${user.getFirstName()} ${user.getLastName()} </a></td>

    @endfor
        </tr>
    </table>
</div>
</body>
</html>