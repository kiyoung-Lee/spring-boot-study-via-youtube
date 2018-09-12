package com.example.demo.youtube.day04;

import org.springframework.stereotype.Service;

@Service
public class AdminService {

    // 생성자 1개만 있으면 생성자 Autowired 를 안붙여도 di 가 된다.
    // 생성자, 필드 주입 가능

    AdminRepository repository;

    public AdminService(AdminRepository repository) {
        this.repository = repository;
    }

    public AdminRepository getRepository() {
        return repository;
    }
}
