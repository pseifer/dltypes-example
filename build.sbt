name := "dltypes-example"
version := "0.0.1-SNAPSHOT"
organization := "de.uni_koblenz"
scalaVersion := "2.12.4"

libraryDependencies += "de.uni_koblenz" %% "dltypes-lib" % "0.0.1-SNAPSHOT"
libraryDependencies += "com.complexible.stardog" % "client-http" % "5.2.1"

// Scalac Options
scalacOptions += "-Xplugin:lib/dltypes.jar"
scalacOptions += "-P:dltypes:ontology:http://swat.cse.lehigh.edu/onto/univ-bench.owl"
