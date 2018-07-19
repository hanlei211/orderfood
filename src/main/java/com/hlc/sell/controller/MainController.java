package com.hlc.sell.controller;

import com.hlc.sell.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

/**
 * @Author rjyx
 * @Description springboot 发送邮箱
 * @Date create in 2018/7/19
 * @Modify by
 */
@RestController
public class MainController {

    @Autowired
    JavaMailSender javaMailSender;

    @Autowired
    private EmailService emailService;

    @Autowired
    private TemplateEngine templateEngine;

    @GetMapping("/send")
    public String send() {
        //建立邮件信息
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();

        //发送者
        simpleMailMessage.setFrom("463779213@qq.com");
        simpleMailMessage.setTo("463779213@qq.com");
        //发送的标题
        simpleMailMessage.setSubject("内存使用情况");
        //发送的内容
        simpleMailMessage.setText("hello world");
        javaMailSender.send(simpleMailMessage);
        return "1";

    }

    @GetMapping("/sendSimpleEmail")
    public String sendSimpleEmail() {
        emailService.sendSimpleEmail("463779213@qq.com","还有谁","你的东西！");
        return "1";
    }

    @GetMapping("/sendHtmlEmail")
    public void sendHtmlMail() throws Exception {
        String content="<html>\n" +
                "<body>\n" +
                "    <h3>hello world ! 这是一封Html邮件!</h3>\n" +
                "</body>\n" +
                "</html>";
        emailService.snedHtmlEmail("463779213@qq.com","this is html mail",content);
    }

    @GetMapping("/sendFileEmail")
    public void sendFileEmail() throws Exception {
        String filePath="d:\\hh.jpg";
        emailService.sendFileEmail("2452559349@qq.com", "主题：带附件的邮件", "这是代码给你发的邮件，收到附件，请查收！", filePath);

    }

    @GetMapping("/sendInMail")
    public void sendInlineResourceMail() throws Exception {
        String rscId = "001";
        String content="<html><body>这是有图片的邮件：<img src=\'cid:" + rscId + "\' ></body></html>";
        String imgPath = "d:\\hh.jpg";

        emailService.sendInlineResourceEmail("463779213@qq.com", "主题：这是有图片的邮件", content, imgPath, rscId);
    }

    @GetMapping("/sendTemplateMail")
    public void sendTemplateMail() throws Exception {
       Context context= new Context();
       context.setVariable("username","hanlei");
        String emailContent = templateEngine.process("email", context);

        System.out.println(emailContent);
        emailService.snedHtmlEmail("463779213@qq.com","主题：这是模板邮件",emailContent);
    }
}
