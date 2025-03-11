package Assignment.Question1;

public class ElectricBlanket extends Blanket {
  private int heatSetting;
  private boolean auto;

  // Default constructor
  public ElectricBlanket() {
    super();
    heatSetting = 1;
    auto = false;
  }

  // Setter methods
  public void setHeatSetting(int h) {
    // Heat setting
    if (h < 1 || h > 5) {
      heatSetting = 1;
    } else {
      heatSetting = h;
    }
  }

  public void setAuto(boolean a) {
    auto = a;
  }

  // Getter methods
  public int getHeatSetting() {
    return heatSetting;
  }

  public boolean getAuto() {
    return auto;
  }

  // toString method
  public String toString() {
    String option = (auto ? "Automatic" : "Manual");
                                 // Yes : No

    return super.toString() +
            "\nNumber of heat settings: " + heatSetting +
            "\nShutoff feature: " + option;
  }
}