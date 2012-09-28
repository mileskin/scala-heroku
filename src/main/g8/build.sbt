import com.typesafe.startscript.StartScriptPlugin

organization := "spike"

name := "My Scala Web on Heroku"

version := "0.0.1-SNAPSHOT"

scalaVersion := "2.9.2"

seq(webSettings :_*)

seq(StartScriptPlugin.startScriptForClassesSettings: _*)

port in container.Configuration := 8650

scalacOptions ++= Seq("-unchecked", "-deprecation")

libraryDependencies ++= Seq(
  "org.eclipse.jetty" % "jetty-webapp" % "7.4.5.v20110725" % "container",
  "org.eclipse.jetty" % "jetty-webapp" % "7.4.5.v20110725",
  "javax.servlet" % "servlet-api" % "2.5" % "provided",
  "org.scalatra" % "scalatra_2.9.1" % "2.0.4",
  "org.scalatra" % "scalatra-scalate_2.9.1" % "2.0.4",
  "net.liftweb" %% "lift-json" % "2.5-M1",
  "net.liftweb" %% "lift-json-ext" % "2.5-M1",
  "org.slf4j" % "slf4j-simple" % "1.6.1",
  "org.scala-tools.testing" % "specs_2.9.1" % "1.6.9" % "test"
)

