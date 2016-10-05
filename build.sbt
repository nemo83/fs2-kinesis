organization := "com.gilt"
name := """fs2-kinesis"""

scalaVersion := "2.11.8"

lazy val root = (project in file("."))
  .settings(libraryDependencies ++= Seq(
    "co.fs2" %% "fs2-core" % "0.9.1",
    "com.amazonaws" % "aws-java-sdk" % "1.10.20",
    "com.amazonaws" % "amazon-kinesis-client" % "1.6.1"
  ))

