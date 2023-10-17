package ru.shesterov.MySecondTestAppSpringBoot.service;

import ru.shesterov.MySecondTestAppSpringBoot.model.Request;
import ru.shesterov.MySecondTestAppSpringBoot.exception.UnsupportedCodeException;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class RequestUnsupportedCodeMatchExceptionService implements UnsupportedCodeMatchExceptionService{
    @Override
    public void isUidMatch(Request request) throws UnsupportedCodeException {
        if (Objects.equals(request.getUid(), "123")) {
            throw new UnsupportedCodeException();
        }
    }
}
