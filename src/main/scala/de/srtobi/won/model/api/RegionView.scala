package de.srtobi.won.model.api

trait RegionView {
  def resourcesPerRound: Map[Item, Int]
  def buildings: Map[BuildingType, Int]
  def territory: Option[TerritoryView]
  def units: Int
}
