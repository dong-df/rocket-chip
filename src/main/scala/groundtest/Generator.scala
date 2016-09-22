// See LICENSE for license details.

package groundtest

import Chisel._
import util.Generator

object GroundtestGenerator extends Generator
{
  val longName = names.topModuleProject + "." + names.configs
  generateFirrtl
  generateTestSuiteMakefrags // TODO: Needed only for legacy make targets
  generateParameterDump // TODO: Needed only for legacy make targets
}
