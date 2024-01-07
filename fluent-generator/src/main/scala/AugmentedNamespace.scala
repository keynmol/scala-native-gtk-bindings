import com.indoorvivants.gnome.gir_schema.*
import java.nio.file.Paths
import scala.xml.XML
import scalaxb.fromXML
import java.nio.file.Path
import java.nio.file.Files
import scala.jdk.CollectionConverters.*
import scala.reflect.ClassTag
import scalaxb.DataRecord

case class AugmentedNamespace(n: Namespace):
  export n.*

  def collect[T: scala.reflect.ClassTag] =
    val ct = summon[ClassTag[T]]
    n.namespaceoption.collect:
      case d if ct.unapply(d.value).isDefined => d.as[T]

  lazy val interfaces: Seq[AugmentedInterface] =
    collect[Interface].map(AugmentedInterface(_))

  lazy val classes: Seq[AugmentedClass] =
    collect[Class].map(AugmentedClass(_))
end AugmentedNamespace

trait ClassLike:
  protected def options: Seq[DataRecord[Any]]
  def collect[T: scala.reflect.ClassTag] =
    val ct = summon[ClassTag[T]]
    options.collect:
      case d if ct.unapply(d.value).isDefined => d.as[T]

  lazy val implements: Seq[Implements] =
    collect[Implements]

  lazy val methods: Seq[Method] =
    collect[Method]

  lazy val constructors: Seq[Constructor] =
    collect[Constructor]
end ClassLike

case class AugmentedInterface(n: Interface) extends ClassLike:
  export n.*

  override protected def options: Seq[DataRecord[Any]] = n.interfaceoption
case class AugmentedClass(n: Class) extends ClassLike:
  export n.*
  override protected def options: Seq[DataRecord[Any]] = n.classoption

end AugmentedClass

extension (c: Constructor)
  def parameters = c.constructoroption.collect:
    case d if d.value.isInstanceOf[Parameter] => d.as[Parameter]
