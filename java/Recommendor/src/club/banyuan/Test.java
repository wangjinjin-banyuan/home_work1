package club.banyuan;

public class Test {

  public static void main(String[] args) {

    PersonalRecommendor recommendor = new PersonalRecommendor();
    recommendor.addLikes("张三", "复仇者联盟");
    recommendor.addLikes("李四", "钢铁侠");
    recommendor.addLikes("王五", "语文");
    recommendor.addLikes("张三", "数学");
    recommendor.addLikes("李四", "英语");
    recommendor.addLikes("李四", "英语");
    recommendor.addLikes("王五", "数学");
    recommendor.addLikes("王五", "泰坦尼克号");

    try {
      System.out.println(recommendor.likesBoth("张三", "复仇者联盟", "数学"));
      System.out.println(recommendor.likesBoth("张三", "复仇者联盟", "语文"));
      System.out.println(recommendor.likesBoth("赵六", "复仇者联盟", "语文"));
      System.out.println(recommendor.recommendByPerson("张三"));
      //System.out.println(recommendor.recommendByPerson("赵六"));
      System.out.println(recommendor.recommendByProject("数学"));
      System.out.println(recommendor.recommendByProject("123"));

    } catch (UnknownPersonException e) {
      System.out.println(e.getMessage());
    }
  }
}
