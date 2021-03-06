package com.yaa.service;

import com.github.pagehelper.PageInfo;
import com.yaa.model.Comments;
import com.yaa.model.Users;
import com.yaa.model.bo.CommentBo;
import com.yaa.model.bo.ResponseBo;

import java.util.List;

public interface CommentService {

    PageInfo<CommentBo> getComments(Integer cid, int page, int limit);

    Comments getComments(Integer coid);

    int insertComments(Comments comments);

    List<Comments> recentComments(Integer limit);

    //admin
    PageInfo<Comments> getCommentsWithPage(Users user, int page, int limit);

    ResponseBo deleteComments(Integer id);

    /**
     * 根据文章id查询评论条数
     * @param cid 文章id
     * @return 条数
     */
    int selectByCid(int cid);

    /**
     * 查询评论数量
     * @return
     */
    int selectNum();
}
