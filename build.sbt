name := "serializationBasics"

version := "1.0"

scalaVersion := "2.11.2"

libraryDependencies ++= Seq(
  "com.typesafe.akka" % "akka-actor_2.11" % "2.3.4",
  "com.typesafe.akka" % "akka-persistence-experimental_2.11" % "2.3.4",
  "joda-time" % "joda-time" % "2.4",
  "org.joda" % "joda-convert" % "1.6",
  "de.javakaffee" % "kryo-serializers" % "0.27",
  "com.github.romix.akka" % "akka-kryo-serialization_2.11" % "0.3.2b"
)