package Factory;

public class GetPlanFactory {
  public Plan getPlanType(String planType){
      if(planType == null){
          return null;
      } else if (planType.equalsIgnoreCase("Domestic")) {
          return new Domestic();
      }
      else if (planType.equalsIgnoreCase("Commercial")) {
          return new Commercial();
      }
      else if (planType.equalsIgnoreCase("Institutional")) {
          return new Institutional();
      }
      return null;
  }

}
