package de.srtobi.won.model.api

trait GameView {
  def livingPlayers: Set[Player]
  def actions: Map[Player, Seq[Action]]

  def regions: Map[Coord, RegionView]
  def region(coord: Coord): RegionView
}
