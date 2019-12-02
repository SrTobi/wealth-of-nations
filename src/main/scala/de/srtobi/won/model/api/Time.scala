package de.srtobi.won.model.api

trait Time {
  def next: Time
  def prev: Time

  def +(left: Time): Time
  def -(right: Time): Time
}
