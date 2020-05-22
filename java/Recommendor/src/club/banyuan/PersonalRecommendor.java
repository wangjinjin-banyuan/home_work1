package club.banyuan;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class PersonalRecommendor implements Recommender {

  private HashMap<String, List<String>> likes = new HashMap<>();

  @Override
  public void addLikes(String name, String project) {
    if (!likes.containsKey(name)) {
      List<String> projectList = new LinkedList<>();
      projectList.add(project);
      likes.put(name, projectList);
    } else {
      if (!likes.get(name).contains(project)) {
        likes.get(name).add(project);
      }
    }
  }

  @Override
  public boolean likesBoth(String name, String project1, String project2) {
    if (!likes.containsKey(name)) {
      throw new UnknownPersonException("未找到此人！");
    }
    return likes.get(name).contains(project1) && likes.get(name).contains(project2);
  }

  @Override
  public List<String> recommendByPerson(String name) {
    if (!likes.containsKey(name)) {
      throw new UnknownPersonException("未找到此人！");
    }
    likes.get(name);
    return likes.get(name);
  }

  @Override
  public List<String> recommendByProject(String project) {
    List<String> newList = new LinkedList<>();
    for (String key : likes.keySet()) {
      //System.out.println(key);
      for (String likeProject : likes.get(key)) {
        // System.out.println(likeProject);
        if (likeProject.equals(project)) {
          //  System.out.println("key=");
          //   System.out.println(key);
          newList.addAll(likes.get(key));
          newList.remove(project);
        }
//                else {
//                    throw new UnknownPersonException("无人喜欢此项目！");
//                }
      }
    }
    return newList;
//        List<String> recommendProject = new LinkedList<>();
//        for (List<String> value : likes.values()) {
//            if (value.contains(project)) {
//                recommendProject.addAll(value);
//                recommendProject.remove(project);
//            }
//        }
//        if(recommendProject.size() == 0){
//            throw new UnknownPersonException("库中无此项目");
//        }
//        return recommendProject;
  }
}
