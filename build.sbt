ThisBuild / scalaVersion := "2.13.1"
ThisBuild / version := "0.1.0"
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

githubOwner := "tanacasino"
githubRepository := "scala-github-packages-example"
githubActor := sys.env.getOrElse("GITHUB_ACTOR", "tanacasino")
githubTokenSource := TokenSource.Environment("GITHUB_API_TOKEN")

lazy val root = (project in file("."))
  .settings(
    name := "scala-github-packages-example",
    libraryDependencies ++= libDependencies
  )
