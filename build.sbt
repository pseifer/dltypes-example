name := "dltypes-example"
version := "0.0.1-SNAPSHOT"
organization := "de.uni_koblenz"
scalaVersion := "2.12.4"

// Scalac Options
scalacOptions += "-Xplugin:lib/dltypes.jar"
scalacOptions += "-Xprint:typer"
scalacOptions += "-P:dltypes:ontology:ontology.owl"
