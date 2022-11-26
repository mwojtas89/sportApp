package com.akvelon.sport.service;

import com.akvelon.sport.domain.dto.UserDto;
import com.akvelon.sport.domain.models.User;
import com.akvelon.sport.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public User addUser (UserDto userDto) {
        return userRepository.save(new User(userDto.getId(), userDto.getName(), userDto.getLastName(), userDto.getPassword(),
                userDto.getEmail(), userDto.getLocation(), userDto.getImage()));
    }

    public User getUserById (Long id) {
        return new User(2L, "Mateusz", "Wojtas", "123454", "sdasd@asdas.com",
                "krakow", "https://upcdn.io/12a1xsp/raw/uploads/2022/11/25/Vladysalv%20Bieliaiev-4nbm.png");
    }
}
