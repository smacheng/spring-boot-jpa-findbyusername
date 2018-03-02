package com.yk.findbyusername.reposiroty;

import com.yk.findbyusername.domain.Userinfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserinfoRepository extends JpaRepository<Userinfo,Long> {
    public Userinfo findByUsername(String username);
    public Userinfo findByUsernameAndPassword(String username,String password);
}
