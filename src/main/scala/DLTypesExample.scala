import de.uni_koblenz.dltypes.runtime.Sparql._
import de.uni_koblenz.dltypes.runtime._


object DLTypesExample extends App {
  Sparql.connect("http://localhost:5820", "lubm")

  val x: List[`:FullProfessor`] = sparql"SELECT ?x WHERE { ?x a :FullProfessor } LIMIT 10"
  EmploymentTools.showEmployers(x.head)

  Sparql.disconnect()
}
