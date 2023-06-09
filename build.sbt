ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.10"

lazy val root = (project in file("."))
  .settings(
    name := "linked-list-assignment"
  )

libraryDependencies += "org.scalatest" %% "scalatest-flatspec" % "3.2.15" % "test"
