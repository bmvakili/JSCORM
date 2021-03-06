package com.arcusys.learn.scorm.manifest.model

/** When to do randomization of child activities */
object RandomizationTimingType extends Enumeration {
  type RandomizationTimingType = Value
  /** Randomize never*/
  val Never = Value("never")
  /** Randomize once*/
  val Once = Value("once")
  /** Randomize on each new attempt */
  val OnEachNewAttempt = Value("onEachNewAttempt")
}