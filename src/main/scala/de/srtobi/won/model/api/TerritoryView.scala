package de.srtobi.won.model.api

trait TerritoryView {
  def owner: Player
  def regions: Iterator[RegionView]
  def items: Iterator[Item]
  def item(ty: Item): Item

  final lazy val units: Int = regions.map(_.units).sum
}
