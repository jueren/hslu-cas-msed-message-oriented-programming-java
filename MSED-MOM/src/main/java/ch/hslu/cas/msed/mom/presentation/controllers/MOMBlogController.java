package ch.hslu.cas.msed.mom.presentation.controllers;

import ch.hslu.cas.msed.mom.application.services.MOMBlogApplicationService;
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
@RequestMapping(value =  "MOM/Blogs")
public class MOMBlogController
{
    private static final Logger logger = LoggerFactory.getLogger(MOMBlogController.class);
    private MOMBlogApplicationService blogService;

    @Autowired
    public MOMBlogController(MOMBlogApplicationService blogService)
    {
        this.blogService = blogService;
    }

    private static int quickAndDirtyUserId = 1;

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