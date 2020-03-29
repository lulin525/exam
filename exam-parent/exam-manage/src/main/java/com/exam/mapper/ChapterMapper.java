package com.exam.mapper;
import com.exam.model.Chapter;
import java.util.List;

public interface ChapterMapper {
    List<Chapter> getChapterList();

    int addCharpterMsg(Chapter chapter);

    int updateChapter(Chapter chapter);
    //删除
    String deleteChapter(String chapterCode);
}
