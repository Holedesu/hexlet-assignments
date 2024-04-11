@import exercise.dto.users.UsersPage
@param UsersPage page

@template.layout.page(
content = @`
    <form action="/users" method="get">
        <input type="search" name="term">
        <input type="submit" value="Искать">
    </form>
    <h1>Пользователи</h1>
    <table class="table table-striped">
        @for(var user : page.getUsers())
            <tr>
                <td>
                    ${user.getFirstName()} ${user.getLastName()}
                </td>

            </tr>
        @endfor
    </table>
`
)