name := """scala-semantic-logging"""

version := "1.0"

scalaVersion := "2.11.7"


resolvers += "Splunk Releases" at "http://splunk.artifactoryonline.com/splunk/ext-releases-local"

libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.4" % "test"
libraryDependencies += "com.splunk.logging" % "splunk-library-javalogging" % "1.5.0"

libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.1.7"
libraryDependencies += "com.typesafe.scala-logging" %% "scala-logging" % "3.5.0"
