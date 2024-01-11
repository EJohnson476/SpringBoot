package org.launchcode.SkillsTracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SkillsController {

    @GetMapping
    @ResponseBody
    public String header()
    {
        return "<h1>Skills Tracker</h1>" +
                "<h2>Languages</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>C++</li>" +
                "<li>Python</li>";
    }

        @PostMapping("form")
        @ResponseBody
        public String list(@RequestParam String name, @RequestParam String first, @RequestParam String second, @RequestParam String third)
        {
            return "<h1>" + name + "</h1>" +
                    "<h2>We have a few skills we'd like to learn. Here is the list.</h2>" +
                    "<ol>" +
                    "<li>" + first + "</li>" +
                    "<li>" + second + "</li>" +
                    "<li>" + third + "</li>";
        }

        @GetMapping("form")
        @ResponseBody
        public String favorite()
        {
            return "<html>" +
                    "<body>" +
                    "<form action='form' method='post'>" +
                    "<h2>Name: <h2>" +
                    "<input type='text' name='name'>" +
                    "<h2>Select your favorite language</h2>" +
                    "<select name='first'>" +
                    "<option value='java'>Java</option>" +
                    "<option value='c++'>C++</option>" +
                    "<option value='python'>Python</option>" +
                    "</select>" +
                    "<h2>Select your second favorite language</h2>" +
                    "<select name='second'>" +
                    "<option value='java'>Java</option>" +
                    "<option value='c++'>C++</option>" +
                    "<option value='python'>Python</option>" +
                    "</select>" +
                    "<h2>Select your third favorite language</h2>" +
                    "<select name='third'>" +
                    "<option value='java'>Java</option>" +
                    "<option value='c++'>C++</option>" +
                    "<option value='python'>Python</option>" +
                    "</select>" +
                    "</br>" +
                    "</br>" +
                    "<input type='submit' value='Submit'>" +
                    "</form>" +
                    "</body>" +
                    "</html>";

        }

    }

