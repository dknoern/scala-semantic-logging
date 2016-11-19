package com.example

import com.splunk.logging.SplunkCimLogEvent
import com.typesafe.scalalogging.Logger

object Hello {
  def main(args: Array[String]): Unit = {

    val logger = Logger("name")

    // create SplunkCimLogEvent and populate some fields!

    var event = new SplunkCimLogEvent("name", "event-id")
		event.setAuthAction("allow")
		event.setFileModifyTime(System.currentTimeMillis())

    // log it

   logger.debug(event.toString())
  }
}
