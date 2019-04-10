package com.yaa.controller.admin;

import com.yaa.controller.base.BaseController;
import com.yaa.model.Total;
import com.yaa.service.AttachService;
import com.yaa.service.CommentService;
import com.yaa.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller("adminIndexController")
@RequestMapping(value = "/admin")
public class IndexController extends BaseController {

    @Autowired
    private AttachService attachService;

    @Autowired
    private CommentService commentService;

    @Autowired
    private ContentService contentService;


    /**
     * 登录页
     * @return
     */
    @GetMapping(value = "/login")
    public String login() {
        return "admin/login";
    }

    /**
     * 首页
     * @return
     */
    @GetMapping(value = "/index")
    public String adminHome(HttpServletRequest request) {
        Total total = new Total();
        //附件数量
        int attachNum = attachService.selectNum();
        //System.err.println(attachNum);
        total.setAttachNum(attachNum);

        //评论数量
        int commentsNum = commentService.selectNum();
        //System.err.println(commentsNum);
        total.setCommentsNum(commentsNum);

        //文章数量
        int contentsNum = contentService.selectNum();
        total.setContentsNum(contentsNum);

        //点击量
        int hitsNum = contentService.selectHitsNum();
        total.setHitsNum(hitsNum);
        request.setAttribute("total", total);
        request.setAttribute("active","index");
        return "admin/index";
    }

}
