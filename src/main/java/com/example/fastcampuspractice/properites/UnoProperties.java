package com.example.fastcampuspractice.properites;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter
@Setter
@ConfigurationProperties("uno")
public record UnoProperties(
        Korean korean,
        English english
) {
    public static record Korean(String hello) {

    }

    public static record English(String hello) {

    }
}
