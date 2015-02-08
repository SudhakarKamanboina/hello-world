package main.scala

import org.springframework.context.annotation.Configuration
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.context.annotation.ComponentScan
import java.util.concurrent.atomic.AtomicLong
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController


/**
 * Created by sudh on 2/7/2015.
 */

@Configuration
@EnableAutoConfiguration
@ComponentScan
@RestController
class HelloConfig {

  @RequestMapping(value=Array("/hello"))
  def controller() :String = {
    return "Hello World"
  }
}
