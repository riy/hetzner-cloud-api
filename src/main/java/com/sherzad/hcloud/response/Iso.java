package com.sherzad.hcloud.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Iso {

    private Long id;
    private String name;
    private String description;
    private String type;

}
