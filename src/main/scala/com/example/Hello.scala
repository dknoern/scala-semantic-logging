package com.example

import com.splunk.logging.SplunkCimLogEvent
import com.typesafe.scalalogging.Logger

object Hello {
  def main(args: Array[String]): Unit = {

    val logger = Logger("name")

    // create SplunkCimLogEvent, identify event type

    var event = new SplunkCimLogEvent("name", "beverage-purchase")

    // populate relevant standard splunk-specific fields

    event.setAuthAction("allow")
    event.setFileModifyTime(System.currentTimeMillis())

    // populate other semantic fields

    event.addField("beverage", "americano")
    event.addField("size", "tall")
    event.addField("room", "extra")

    // log it

   logger.debug(event.toString())
  }
}
