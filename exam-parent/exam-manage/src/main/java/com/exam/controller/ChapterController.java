package com.exam.controller;
import com.exam.model.Chapter;
import com.exam.service.ChapterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;
/**
 * 章节模块
 */
@Controller
public class ChapterController {
    @Autowired
    private ChapterService chapterService;
    //查询章节列表
    @RequestMapping("/findChapterList")
    @ResponseBody
    public List<Chapter>  getChapterList(){
        List<Chapter> list=chapterService.getChapterList();
        System.out.println("chapterList:"+list);
        return list;
    }

    /**
     * 添加章节
     * @return
     */
    @RequestMapping("/addChapter")
    @ResponseBody
    public int addCharpterMsg(Chapter chapter){
        int row =chapterService.addCharpterMsg(chapter);
        System.out.println("addChapter:"+row);
        return row;
    }

    /**
     * 编辑更新章节
     */
    @RequestMapping("/updateChapter")
    @ResponseBody
    public int updateChapter(Chapter chapter){
        int row =chapterService.updateChapter(chapter);
        System.out.println("updateChapter:"+row);
        System.out.println("updateChapter---");
        return row;
    }

    /**
     * 删除章节
     */
    @RequestMapping("/deleteChapter")
    @ResponseBody
    public String deleteChapter(String chapterCode){
        System.out.println("deleteChapter----");
        return chapterService.deleteChapter(chapterCode);
    }


}
