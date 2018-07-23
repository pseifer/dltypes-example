import de.uni_koblenz.dltypes.runtime.Sparql._
import de.uni_koblenz.dltypes.runtime._

object EmploymentTools {
  def showEmployers(e: `:Employee`): Unit = println(e.`:worksFor`)
}
