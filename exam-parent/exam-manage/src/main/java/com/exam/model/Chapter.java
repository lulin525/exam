package com.exam.model;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;
import java.io.Serializable;
/**
 * 章节实体类
 */
@Data
@Accessors(chain = true)
@ToString
@TableName("tb_chapter")
public class Chapter implements Serializable {
    @TableId(type = IdType.AUTO)
    private Integer id;
    private String chapterCode;
    private String chapterName;
    private String subjectCode;

}
