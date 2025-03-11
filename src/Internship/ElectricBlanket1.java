package Internship;

import Assignment.Question1.Blanket;

public class ElectricBlanket1 extends Blanket1 {
  protected int heatSetting;
  protected boolean auto;

  //Default constructor
  public ElectricBlanket1() {
    super();
    heatSetting = 1;
    auto = false;
  }

  //Setter methods
  public void setHeatSetting(int h) {
    //Heat setting
    if (h < 1 || h > 5) {
      heatSetting = 1;
    } else {
      heatSetting = h;
    }
  }

  //Setter methods
  public void setAuto(boolean a) {
    auto = a;
  }

  //Getter methods
  public int getHeatSetting() {
    return heatSetting;
  }

  public boolean getAuto() {
    return auto;
  }

  //toString method
  public String toString() {
    String option = (auto ? "Automatic" : "Manual");
                                  //Yes : No

    return super.toString() +
            "\nNumber of heat settings: " + heatSetting +
            "\nShutoff features: " + option;
  }
}
