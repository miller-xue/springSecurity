package com.miller.security;

import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * Created by miller on 2018/7/17
 */
public class MyPasswordEncoder implements PasswordEncoder {

    @Override
    public String encode(CharSequence charSequence) {

        return charSequence.toString();
    }

    @Override
    public boolean matches(CharSequence charSequence, String s) {
        return charSequence.toString().equals(s);
    }
}
