package com.revature.recipe.model;

public class Recipe {
  
  private String name;
  private String directions;
  private Integer serves;
  
  public Recipe() {
    super();
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDirections() {
    return directions;
  }

  public void setDirections(String directions) {
    this.directions = directions;
  }

  public Integer getServes() {
    return serves;
  }

  public void setServes(Integer serves) {
    this.serves = serves;
  }

  @Override
  public String toString() {
    return "Recipe [name=" + name + ", directions=" + directions + ", serves=" + serves + "]";
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((directions == null) ? 0 : directions.hashCode());
    result = prime * result + ((name == null) ? 0 : name.hashCode());
    result = prime * result + ((serves == null) ? 0 : serves.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Recipe other = (Recipe) obj;
    if (directions == null) {
      if (other.directions != null)
        return false;
    } else if (!directions.equals(other.directions))
      return false;
    if (name == null) {
      if (other.name != null)
        return false;
    } else if (!name.equals(other.name))
      return false;
    if (serves == null) {
      if (other.serves != null)
        return false;
    } else if (!serves.equals(other.serves))
      return false;
    return true;
  }
  
}
