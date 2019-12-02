package de.srtobi.won.model.api

trait BuildingType {
  def name: String

  def costs: Map[Item, Int]

  def productions: Seq[Production]
}
