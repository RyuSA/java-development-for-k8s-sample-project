package com.github.ryusa.vulture.javafork8s.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * ping-pong
 */
@RestController
public class Ping {

  /**
   * 指定した時間だけ待機するping-pong
   * @param sleep 待機時間(msec)
   * @return pong
   */
  @GetMapping(path = "/ping")
  public String ping(@RequestParam(defaultValue = "0") long sleep) {
    try {
      if(sleep > 0) {
        Thread.sleep(sleep);
      }
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    return "pong";
  }
}
