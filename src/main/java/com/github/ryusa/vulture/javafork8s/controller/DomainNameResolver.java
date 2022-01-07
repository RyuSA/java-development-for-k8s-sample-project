package com.github.ryusa.vulture.javafork8s.controller;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DomainNameResolver {

  private static final List<String> EMPTY_HOSTS = List.of();
  
  /**
   * 指定されたドメイン名の名前解決を行います
   * @param host ドメイン名
   * @return IPアドレス一覧(v4/v6)
   */
  @GetMapping("/dig")
  public List<String> dig(@RequestParam("query") String host) {
    try {
      InetAddress[] addresses = InetAddress.getAllByName(host);
      Stream<InetAddress> stream = Stream.of(addresses);
      return stream.map(InetAddress::getHostAddress).collect(Collectors.toList());
    } catch (UnknownHostException e) {
      return EMPTY_HOSTS;
    }
  }
}
