lazy val commonSettings = Seq(
  version := "0.0.1",
  resolvers ++= Seq(
      Resolver.mavenLocal
    , Resolver.sonatypeRepo("releases")
    , Resolver.sonatypeRepo("snapshots")
    , "Bintray " at "https://dl.bintray.com/projectseptemberinc/maven"
  ),
  scalaVersion := "2.13.7",
  licenses += ("Apache-2.0", url("http://www.apache.org/licenses/LICENSE-2.0")),
  addCompilerPlugin("org.typelevel" % "kind-projector" % "0.13.2" cross CrossVersion.full),
  libraryDependencies ++= Seq(
      "io.spray"                     %% "spray-json"                    % "1.3.6",
      "com.typesafe.akka"            %% "akka-actor"                    % "2.6.17",
      "com.typesafe.akka"            %% "akka-persistence"              % "2.6.17",
      "com.typesafe.akka"            %% "akka-stream"                   % "2.6.17",
      "com.typesafe.scala-logging"   %% "scala-logging"           % "3.9.4",
      "com.typesafe.slick"           %% "slick"                         % "3.3.3",
      "com.h2database"                % "h2"                            % "1.4.187",
      "com.zaxxer"                    % "HikariCP-java6"                % "2.3.13",
      "ch.qos.logback"                % "logback-classic"               % "1.2.6",
      "org.scalacheck"               %% "scalacheck"                    % "1.14.1"       % "test",
      "org.typelevel" %% "cats-core" % "2.3.0",
      "org.typelevel" %% "cats-free" % "2.3.0"
    )
)

lazy val root = (project in file(".")).
  settings(commonSettings: _*).
  settings(
    name := "frdomain",
    scalacOptions ++= Seq(
      "-feature",
      "-unchecked",
      "-language:higherKinds",
      "-language:postfixOps",
      "-deprecation"
    )
  )

