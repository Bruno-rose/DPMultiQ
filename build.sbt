ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.12.10"

lazy val root = (project in file("."))
  .settings(
    name := "DPMultiQ"
  )

organization := "org.apache"
libraryDependencies += "org.apache.commons" % "commons-csv" % "1.10.0"
