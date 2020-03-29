package com.exam.service;
import com.exam.model.Chapter;
import java.util.List;

public interface ChapterService {
      //查询
      List<Chapter> getChapterList();
      //添加
      int addCharpterMsg(Chapter chapter);
      //更新
      int updateChapter(Chapter chapter);
      //删除
      String deleteChapter(String chapterCode);
}
