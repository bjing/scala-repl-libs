scalaVersion := "2.11.7"

lazy val versions = new {
  val finagle = "6.29.0"
  val finatra = "2.1.0"
  val slick = "3.1.0"
  val postgresql = "9.4-1205-jdbc42"
  val jtds = "1.3.1"
}

libraryDependencies ++= Seq(
  "com.twitter.finatra" %% "finatra-http" % versions.finatra,
  "com.twitter.finatra" %% "finatra-slf4j" % versions.finatra,
  "com.twitter.finatra" %% "finatra-httpclient" % versions.finatra,
  "com.typesafe.slick" %% "slick" % versions.slick,
  "com.typesafe.slick" %% "slick-extensions" % versions.slick,
  "com.typesafe.slick" %% "slick-hikaricp" % versions.slick,
  "org.postgresql" % "postgresql" % versions.postgresql,
  "net.sourceforge.jtds" % "jtds" % versions.jtds
)
 
 
//initialCommands in console := "import slick.driver.PostgresDriver.api._"
