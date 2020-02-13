ThisBuild / scalaVersion := "2.13.1"
ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / organization := "com.github.tanacasino.example"
ThisBuild / organizationName := "tanacasino.example"
ThisBuild / scalacOptions ++= Seq(
  "-deprecation",
  "-unchecked",
  "-language:existentials",
  "-language:higherKinds",
  "-language:implicitConversions",
  "-Xlint",
  "-Xlint:deprecation",
  "-Xfatal-warnings"
)

lazy val libDependencies = Seq(
  Dependencies.ScalaTest % Test
)

ThisBuild / githubOwner := "tanacasino"
ThisBuild / githubRepository := "sbt-github-packages-example"
ThisBuild / githubActor := sys.env.getOrElse("GITHUB_ACTOR", "tanacasino")
ThisBuild / githubTokenSource := TokenSource.Environment("GITHUB_API_TOKEN")


lazy val root = (project in file("."))
  .settings(
    name := "scala-github-packages-example",
    libraryDependencies ++= libDependencies
  )
