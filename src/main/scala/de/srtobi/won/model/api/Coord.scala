package de.srtobi.won.model.api

case class Coord(x: Int, y: Int) {
  def +(lhs: Coord): Coord = Coord(x + lhs.x, y + lhs.y)
  def -(lhs: Coord): Coord = Coord(x - lhs.x, y - lhs.y)
}
