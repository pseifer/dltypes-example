# ScaSpa Example
This is a minimal example project for the [dltypes](https://github.com/pseifer/dltypes) Scala compiler plugin.

# Setup (Example)
1. Build [dltypes-lib](https://github.com/pseifer/dltypes-lib)
2. Build [dltypes](https://github.com/pseifer/dltypes)
3. Copy the assembled plugin into the ```lib/``` folder of this project
4. Build the example with ```sbt compile```
5. (Optional) To execute the example program, setup the triple store [1]

[1] ScaSpa currently only supports the [Stardog](https://www.stardog.com/) triple store.
Information on how to get a licence, install and setup Stardog can be found
in the [documentation](https://www.stardog.com/docs/) on the Stardog website.

The example uses the [LUBM](http://swat.cse.lehigh.edu/projects/lubm/) ontology.
