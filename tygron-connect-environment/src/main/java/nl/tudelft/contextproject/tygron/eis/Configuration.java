package nl.tudelft.contextproject.tygron.eis;

public class Configuration {
  private int stakeholders;
  private String map;
  private int slot;

  public Configuration() {
    slot = -1;
    stakeholders = -1;
  }

  public void setStakeholder(int stakeholderParametersList) {
    stakeholders = stakeholderParametersList;
  }

  public int getStakeholder() {
    return stakeholders;
  }

  public void setMap(String map) {
    this.map = map;
  }

  public String getMap() {
    return map;
  }
  
  public void setSlot(int slot) {
    this.slot = slot;
  }

  public int getSlot() {
    return slot;
  }

}