package dev.luan.demo.utils;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class AppUtils {

    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

}
