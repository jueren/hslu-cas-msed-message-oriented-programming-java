package ch.hslu.cas.msed.mvc.controller;

import ch.hslu.cas.msed.mvc.service.MVCBlogService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Component
@Controller
@RequestMapping(value =  "MVC/Blogs")
public class MVCBlogController
{
    private static final Logger logger = LoggerFactory.getLogger(MVCBlogController.class);
    private MVCBlogService blogService = null;

    private static int quickAndDirtyUserId = 1;

    @Autowired
    public MVCBlogController(MVCBlogService blogService)
    {
        this.blogService = blogService;
    }

    @GetMapping(value = {"/", "", "List"})
    public ModelAndView List()
    {
        ModelAndView model = new ModelAndView("blog/list.html");
        model.addObject("items", this.blogService.getAll(this.quickAndDirtyUserId));
        return model;
    }

    @GetMapping(value = {"/Detail/{Id}"})
    public ModelAndView Detail(@PathVariable("Id") int Identifier)
    {
        ModelAndView model = new ModelAndView("blog/detail.html");
        model.addObject("item", this.blogService.getById(Identifier, this.quickAndDirtyUserId));
        return model;
    }
}