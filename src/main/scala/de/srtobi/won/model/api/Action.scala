package de.srtobi.won.model.api

sealed abstract class Action {
  def actor: Player
  def actionType: ActionType
}

object Action {
  case class MoveUnits(actor: Player, from: Coord, to: Coord, amount: Int) extends Action {
    override def actionType: ActionType.MoveUnits.type = ActionType.MoveUnits
  }

  case class RecruitUnits(actor: Player, target: Coord, amount: Int) extends Action {
    override def actionType: ActionType.RecruitUnits.type = ActionType.RecruitUnits
  }

  case class BuildBuilding(actor: Player, target: Coord, building: BuildingType) extends Action {
    override def actionType: ActionType.BuildBuilding.type = ActionType.BuildBuilding
  }
}
