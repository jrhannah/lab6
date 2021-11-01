class Tree {
  private String treeName;
  private String treeType;
  private boolean leavesFall;
  private String leafColor;

  Tree() {
    treeName = "";
    treeType = "";
    leavesFall = false;
    leafColor = "";
  }

  Tree(String aTreeName, String aTreeType, boolean aLeavesFall, String aLeafColor) {
    treeName = aTreeName;
    treeType = aTreeType;
    leavesFall = aLeavesFall;
    leafColor = aLeafColor;
  }

  void setName(String theTreeName) {
    treeName = theTreeName;
  }

  void setType(String theTreeType) {
    treeType = theTreeType;
  }

  void setFall(boolean theFall) {
    leavesFall = theFall;
  }

  void setColor(String theLeafColor) {
    leafColor = theLeafColor;
  }

  String getName() {
    return treeName;
  }

  String getType() {
    return treeType;
  }

  boolean getFall() {
    return leavesFall;
  }

  String getColor() {
    return leafColor;
  }

  void print() {

    String leavesFall = "does not";
     if(getFall() == true) {
     leavesFall = "does";
     }

  System.out.println("This is a " + treeName + " tree. It is a " + treeType + " and its leaves are currently " + leafColor+ ". It " + leavesFall + " lose its leaves for the winter.");
}
}