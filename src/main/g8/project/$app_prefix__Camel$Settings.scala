import sbt._
import Keys._
import sbt.Def.SettingList

object $app_prefix;format="Camel"$Settings {
  lazy val commons = new SettingList(Seq(
    // https://mvnrepository.com/artifact/org.scala-lang/scala-library
    scalaVersion := "2.12.6",
    scalacOptions ++= Seq(
      "-deprecation",
      "-feature",
      "-unchecked",
      "-Xfuture",
    ),
    libraryDependencies ++= Seq(
      // https://mvnrepository.com/artifact/org.scalatestplus.play/scalatestplus-play
      "org.scalatest" %% "scalatest" % "3.1.2" % Test,
    ),
  ))
}
