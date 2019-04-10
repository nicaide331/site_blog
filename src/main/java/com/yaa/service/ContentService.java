package com.yaa.service;

import com.github.pagehelper.PageInfo;
import com.yaa.model.Comments;
import com.yaa.model.Contents;
import com.yaa.model.bo.ArchiveBo;

import java.util.List;

public interface ContentService {

    PageInfo<Contents> getContents(Integer p,Integer limit);

    Contents getContents(Integer cid);

    Contents getContents(String slug);

    void updateContentByCid(Contents contents);

    List<Contents> getContentsByKeyword(String keyword);

    List<Contents> getContentsByTags(String tag);

    //文章归档
    List<ArchiveBo> getArchives();

    Contents getNhContent(String type, Integer created);

    List<Contents> getNewContents(Integer limit);

    List<Contents> getAllowFeedContents();

    List<Contents> getContentsByCategories(String keyword);

    void updateHits(Integer cid);

    /**
     * 根据id查询
     * @param cid
     * @return
     */
    Contents getComments(Integer cid);

    /**
     * 根据文章id和评论数量更新
     * @param cid 文章id
     * @param num 评论数量
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
