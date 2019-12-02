package de.srtobi.won.model.api

import org.scalatest.{FunSuite, Matchers}

class CoordTest extends FunSuite with Matchers {

  test("+ and -") {
    Coord(1, 4) + Coord(7, 11) shouldBe Coord(8, 15)
    Coord(1, 4) - Coord(7, 11) shouldBe Coord(-6, -7)
  }
}
