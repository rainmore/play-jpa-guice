name := "play-jpa"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  jdbc,
  "com.google.inject" % "guice" % "4.0-beta" withSources(),
  "javax.inject" % "javax.inject" % "1" withSources(),
  "org.hibernate" % "hibernate-entitymanager" % "4.3.0.Beta5" withSources(),
  "org.mockito" % "mockito-core" % "1.9.5" % "test"
)     

play.Project.playScalaSettings
