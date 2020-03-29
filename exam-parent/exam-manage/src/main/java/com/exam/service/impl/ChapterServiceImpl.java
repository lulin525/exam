package com.exam.service.impl;
import com.exam.mapper.ChapterMapper;
import com.exam.model.Chapter;
import com.exam.service.ChapterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * 章节实现类
 */
@Service
public class ChapterServiceImpl implements ChapterService {
    @Autowired
    private ChapterMapper chapterMapper;
    //查询章节列表
    @Override
    public List<Chapter> getChapterList() {
        List<Chapter> chapterList=chapterMapper.getChapterList();
        return chapterList;
    }
    //添加章节
    @Override
    public int addCharpterMsg(Chapter chapter) {
        return chapterMapper.addCharpterMsg(chapter);
    }
    //更新
    @Override
    public int updateChapter(Chapter chapter) {
        if (chapter.getChapterName()==null)
            throw new IllegalArgumentException("更新的对象不能为空");
        return chapterMapper.updateChapter(chapter);
    }
    //删除
    @Override
    public String deleteChapter(String chapterCode) {
        return chapterMapper.deleteChapter(chapterCode);
    }
}
