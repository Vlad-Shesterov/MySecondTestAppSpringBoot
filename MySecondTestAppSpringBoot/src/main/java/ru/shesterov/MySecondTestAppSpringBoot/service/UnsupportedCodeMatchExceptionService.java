package ru.shesterov.MySecondTestAppSpringBoot.service;

import ru.shesterov.MySecondTestAppSpringBoot.exception.UnsupportedCodeException;
import ru.shesterov.MySecondTestAppSpringBoot.model.Request;
import org.springframework.stereotype.Service;

@Service
public interface UnsupportedCodeMatchExceptionService {
    void isUidMatch(Request request) throws UnsupportedCodeException;
}
