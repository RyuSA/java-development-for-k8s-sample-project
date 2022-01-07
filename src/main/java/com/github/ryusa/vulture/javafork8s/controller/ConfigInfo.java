package com.github.ryusa.vulture.javafork8s.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/config")
public class ConfigInfo {

  @Value("${comment}")
  private String comment;

  @GetMapping(path = "/version")
  public String version() {
    return "0.1";
  }

  @GetMapping(path = "/comment")
  public String comment() {
    return this.comment;
  }
}
