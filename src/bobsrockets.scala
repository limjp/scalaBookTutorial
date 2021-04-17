package bobsrockets {
  package navigation {

    import bobsrockets.navigation.launch.Booster1
    package launch {
      class Booster1
    }
    class MissionControl {
      val booster1  = new Booster1
      val booster2 = new bobsrockets.launch.Booster2
      val booster3 = new _root_.launch.Booster3
    }
  }
  package launch {
    class Booster2
  }
}