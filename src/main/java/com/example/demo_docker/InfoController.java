package com.example.demo_docker;

import org.apache.commons.lang3.SystemUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class InfoController {

    @GetMapping("/info")
    public Map<String, String> getInfo() {
        String os = String.join(", ", SystemUtils.OS_NAME, SystemUtils.OS_VERSION);
        Map<String, String> environments = new HashMap<>(System.getenv());
        environments.put("OS_NAME", os);
        return environments;
    }

}
