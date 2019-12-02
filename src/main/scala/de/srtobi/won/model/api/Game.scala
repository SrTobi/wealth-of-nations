package de.srtobi.won
package model
package api

trait Game {
  def players: Set[Player]
  def itemTypes: Set[Item]
  def buildingTypes: Set[BuildingType]

  def startTime: Time
  def currentTime: Time

  def view(time: Time, player: Set[Player]): GameView

  def evolved(actions: Seq[Action]): Game
}
