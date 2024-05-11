package org.back.security.entities;

import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class UserService {

//    private UserRepository userRepository;

//    public UserService(){}
//    @Autowired
//    public UserService(UserRepository userRepository) {
//        this.userRepository = userRepository;
//    }

    public User validateUser(String username, String password, UserRepository userRepository)
    {
        System.out.println(username);
        System.out.println(password);
//        System.out.println(userRepository.count());
        User user=userRepository.findByUtilizator(username);
        System.out.println(user);
        if (user!=null)
        {
            if (Objects.equals(user.getParola(), password)) return user;
            else return null;
        }
        else return null;
    }

    public static String hashPassword(String password)
    {
        final long base=29;
        final long mod=385934743;
        long pow=1;
        long hash=0;

        for (int i=0;i<password.length();i++)
        {
            hash=(hash*base+password.charAt(i))%mod;
            pow=(pow*base)%mod;
        }
        return String.valueOf(hash);
    }
}