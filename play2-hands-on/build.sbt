name := "play2-hands-on"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  // jdbcからspec2〜まで消してください

  // jdbc,
  // cache,
  // ws,
  // specs2 % Test
  "com.h2database" % "h2" % "1.4.177",          // <- この行を追加してください
  "com.typesafe.play" %% "play-slick" % "1.0.0" // <- この行を追加してください
)

resolvers += "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases"

// Play provides two styles of routers, one expects its actions to be injected, the
// other, legacy style, accesses its actions statically.
routesGenerator := InjectedRoutesGenerator