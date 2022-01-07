package com.github.ryusa.vulture.javafork8s.controller;

import org.springframework.boot.info.BuildProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersionInfo {

  public VersionInfo(BuildProperties buildProperties) {
    this.buildProperties = buildProperties;
  }

  private final BuildProperties buildProperties;

  @GetMapping(path = "/version")
  public String version() {
    return this.buildProperties.getVersion();
  }
}
