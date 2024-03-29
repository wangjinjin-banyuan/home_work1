package club.banyuan;

import java.util.List;

public interface Recommender {

  void addLikes(String name, String project);

  boolean likesBoth(String name, String project1, String project2);

  List<String> recommendByPerson(String name);

  List<String> recommendByProject(String project);
}
