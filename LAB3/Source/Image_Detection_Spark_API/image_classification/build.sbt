name := "Image_Classification"

version := "1.0"

scalaVersion := "2.11.8"

scalacOptions ++= Seq(
  "-optimize",
  "-unchecked",
  "-deprecation"
)

classpathTypes += "maven-plugin"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % "2.0.1" % "provided",
  "org.apache.spark" %% "spark-streaming" % "2.0.1",
  "org.apache.spark" %% "spark-mllib" % "2.0.1",
  "org.apache.spark" % "spark-sql_2.11" % "2.0.0",
  "org.scalatest" %% "scalatest" % "2.2.1" % "test",
  "org.bytedeco" % "javacpp" % "0.11",
  "org.bytedeco"% "javacv" % "0.11",
  "ch.megard" %% "akka-http-cors" % "0.2.2",
//  "com.typesafe.akka" %% "akka-http-spray-json" % "10.0.11",
  "com.levigo.jbig2" % "levigo-jbig2-imageio" % "1.6.5",
  "org.bytedeco.javacpp-presets" % "opencv" % "2.4.11-0.11",
  "org.bytedeco.javacpp-presets" % "opencv" % "2.4.11-0.11" classifier "linux-x86",
  "org.bytedeco.javacpp-presets" % "opencv" % "2.4.11-0.11" classifier "linux-x86_64",
  "org.bytedeco.javacpp-presets" % "opencv" % "2.4.11-0.11" classifier "macosx-x86_64",
  "org.bytedeco.javacpp-presets" % "opencv" % "2.4.11-0.11" classifier "windows-x86",
  "org.bytedeco.javacpp-presets" % "opencv" % "2.4.11-0.11" classifier "windows-x86_64"
)


resolvers ++= Seq(
  "Akka Repository" at "http://repo.akka.io/releases/",
  "scala-tools" at "https://oss.sonatype.org/content/groups/scala-tools",
  "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/",
  "Second Typesafe repo" at "http://repo.typesafe.com/typesafe/maven-releases/",
  "JavaCV maven repo" at "http://maven2.javacv.googlecode.com/git/",
  "JavaCPP maven repo" at "http://maven2.javacpp.googlecode.com/git/",
  "ImageIO" at "https://mvnrepository.com/artifact/com.levigo.jbig2/levigo-jbig2-imageio",
  Resolver.sonatypeRepo("public")
)
