package main.scala

import org.springframework.context.annotation.Configuration
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.context.annotation.ComponentScan
import java.util.concurrent.atomic.AtomicLong
import org.springframework.web.bind.annotation.{RequestMapping, RequestMethod}
import org.springframework.web.bind.annotation.RequestParam
/*import org.springframework.web.bind.annotation.RestController*/
import org.springframework.stereotype.Controller


/**
 * Created by sudh on 2/7/2015.
 */

@Configuration
@EnableAutoConfiguration
@ComponentScan
@Controller
class HelloConfig {

  @RequestMapping(value=Array("/"), method=Array(RequestMethod.GET))
  def controller() :String = {
    return "Hello World"
  }
}
