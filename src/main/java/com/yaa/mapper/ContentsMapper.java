package com.yaa.mapper;

import com.yaa.model.Contents;
import com.yaa.model.bo.ArchiveBo;
import com.yaa.model.vo.ContentsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ContentsMapper {
    int countByExample(ContentsExample example);

    int deleteByExample(ContentsExample example);

    int deleteByPrimaryKey(Integer cid);

    int insert(Contents record);

    int insertSelective(Contents record);

    List<Contents> selectByExampleWithBLOBs(ContentsExample example);

    List<Contents> selectByExample(ContentsExample example);

    Contents selectByPrimaryKey(Integer cid);

    int updateByExampleSelective(@Param("record") Contents record, @Param("example") ContentsExample example);

    int updateByExampleWithBLOBs(@Param("record") Contents record, @Param("example") ContentsExample example);

    int updateByExample(@Param("record") Contents record, @Param("example") ContentsExample example);

    int updateByPrimaryKeySelective(Contents record);

    int updateByPrimaryKeyWithBLOBs(Contents record);

    int updateByPrimaryKey(Contents record);

    List<ArchiveBo> findReturnArchiveBo();

    /**
     * 更新点击
     * @param cid
     */
    void updateHits(Integer cid);

    /**
     * 根据文章id和评论数量更新文章评论
     * @param cid
     * @param num
     */
    void updateNumOfComment(Integer cid, int num);

    /**
     * 文章数量
     * @return
     */
    int selectNum();

    /**
     * 点击数量
     * @return
     */
    int selectHitsNum();
}