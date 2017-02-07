//import interplay.ScalaVersions
//scalaVersion := ScalaVersions.scala212

lazy val docs = project
  .in(file("."))
  .enablePlugins(PlayDocsPlugin)
  .settings(
    //PlayDocsKeys.docsVersion := "2.6.0-SNAPSHOT",
    scalaVersion := "2.12.1",
    libraryDependencies += "com.typesafe.play" %% "play-json" % "2.6.0-SNAPSHOT"
  )
  //.dependsOn(`play-json`)

// playBuildRepoName in ThisBuild := "play-json"
