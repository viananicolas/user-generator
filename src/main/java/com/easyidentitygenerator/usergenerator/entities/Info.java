package com.easyidentitygenerator.usergenerator.entities;

import lombok.Data;

@Data
public class Info {
    private String seed;
    private long results;
    private long page;
    private String version;
}
