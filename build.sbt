val scala3Version = "3.2.2"
val scala2Version = "2.12.15"

lazy val root = project
  .in(file("."))
  .settings(
    name := "effekt-playground",
    version := "0.1.0-SNAPSHOT",

    scalaVersion := scala2Version,

    resolvers += Opts.resolver.sonatypeSnapshots,

    libraryDependencies ++= Seq(
      "de.b-studios" %% "effekt" % "0.4-SNAPSHOT",
      "org.scalameta" %% "munit" % "0.7.29" % Test
    )
  )
