package com.mb.controller;

import static com.mb.constant.UrlMapping.BASE_URL;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(BASE_URL)
@CrossOrigin(origins = "*")
public class BaseController
{

}
