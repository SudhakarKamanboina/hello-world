package main.scala

import org.springframework.boot.SpringApplication
/**
 * Created by sudh on 2/7/2015.
 */
object HelloWebApplication {
  def main(args: Array[String]) {
    SpringApplication.run(classOf[HelloConfig]);
  }
}
