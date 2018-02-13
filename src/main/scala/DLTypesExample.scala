import de.uni_koblenz.dltypes.runtime.Sparql._
import de.uni_koblenz.dltypes.runtime._


object DLTypesExample extends App {
  val x: List[`:Person`] = sparql"SELECT DISTINCT ?x WHERE { ?x a :Person }"

  def departmentHeads1(p: `:Person`): Boolean = p match {
    case _: `∃:headOf.⊤ ⊓ :Professor` => true
    case _ => false
  }

  def departmentHeads2(p: `:Person`): Boolean =
    p.isInstanceOf[`∃:headOf.⊤ ⊓ :Professor`]

  x.filter(departmentHeads2).foreach(println)
}
