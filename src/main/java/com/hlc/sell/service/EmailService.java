package com.hlc.sell.service;

import java.io.File;

/**
 * @Author rjyx
 * @Description  发送邮件服务
 * @Date create in 2018/7/19
 * @Modify by
 */
public interface EmailService {

    /**
     * 发送简单的邮件
     * @param to
     * @param subject
     * @param content
     */
    public  void sendSimpleEmail(String to,String subject,String content);

    /**
     * 发送HTML格式的邮件
     * @param to
     * @param subject
     * @param content
     */
    public void snedHtmlEmail(String to,String subject,String content);


    /**
     * 发送带附件的邮件
     * @param io
     * @param subject
     * @param content
     * @param filePath
     */
    public void sendFileEmail(String io,String subject,String content,String filePath);

    /**
     * 发送带静态资源的邮件
     * @param to
     * @param subject
     * @param content
     * @param rscPath
     * @param rscId
     */
    public void sendInlineResourceEmail(String to, String subject, String content, String rscPath, String rscId);
}
