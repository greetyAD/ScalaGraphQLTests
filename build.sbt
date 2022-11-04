val scala3Version = "3.2.0"

lazy val root = project
  .in(file("."))
  .settings(
    name := "ScalaGraphQL",
    version := "0.1.0-SNAPSHOT",

    scalaVersion := scala3Version,

    libraryDependencies ++= Seq(
      "io.rest-assured" % "scala-support" % "5.2.0" % Test,
      "io.rest-assured" % "rest-assured" % "5.2.0",
      "junit" % "junit" % "4.13.2" % Test,
      "org.junit.jupiter" % "junit-jupiter-api" % "5.9.1" % Test,
      "com.fasterxml.jackson.core" % "jackson-databind" % "2.13.4.2",
      "org.hamcrest" % "hamcrest" % "2.2" % Test,
    )
  )
