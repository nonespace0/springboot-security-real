package com.common;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PassEn {
    public static void main(String[] args) {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();

        System.out.println(bCryptPasswordEncoder.encode("ram"));
        System.out.println(bCryptPasswordEncoder.encode("aravinth"));
        System.out.println(bCryptPasswordEncoder.encode("shiva"));
    }

}
