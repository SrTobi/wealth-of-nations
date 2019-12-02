package de.srtobi.won.model.api

sealed abstract class ActionType(val priority: Int)


object ActionType {
  sanityCheck()

  object MoveUnits extends ActionType(100)
  object BuildBuilding extends ActionType(5)
  object RecruitUnits extends ActionType(10)

  val all: Seq[ActionType] = Seq(
    MoveUnits,
    BuildBuilding,
    RecruitUnits
  )

  private[this] def sanityCheck(): Unit = {
    assert(all.distinct == all)
    assert(all.sortBy(_.priority).sliding(2).forall { case Seq(a, b) => a.priority < b.priority })
  }
}