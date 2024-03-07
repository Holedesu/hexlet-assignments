package exercise.dto.users;

import exercise.model.User;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

// BEGIN
@Data
@AllArgsConstructor
@Getter
public class UserPage {
    private User user;
}
// END
