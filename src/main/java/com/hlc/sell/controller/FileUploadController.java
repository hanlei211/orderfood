package com.hlc.sell.controller;

import com.hlc.sell.utils.FileUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.List;

@Controller
public class FileUploadController {

    private static final Logger logger = LoggerFactory.getLogger(FileUploadController.class);

    @Value("${web.upload-path}")
    private String  path;
    /**
     * 获取file.html页面
     * @return
     */
    @RequestMapping("file")
    public  String file(){
        return "/file";
    }

    @RequestMapping("fileUpload")
    @ResponseBody
    public String fileUpload(@RequestParam("fileName")MultipartFile file){
        if(file.isEmpty()){
            return "文件为空";
        }
        String fileName = file.getOriginalFilename();
        logger.info("上传的文件名"+fileName);

        String suffixName = fileName.substring(fileName.lastIndexOf("."));
        logger.info("上传的文件名后缀名"+suffixName);

        int size = (int)file.getSize();
        System.out.println(fileName+"-->"+size);

        File dest = new File(path + fileName);
        if(!dest.getParentFile().exists()){
            //判断文件父目录是否存在
            dest.getParentFile().mkdir();
        }
        try{
            file.transferTo(dest);//保存文件
            return "文件上传成功";
        }catch(IllegalStateException e){
            e.printStackTrace();
            return "文件上传失败";
        }catch (Exception e){
            e.printStackTrace();
            return "文件上传失败";
        }
    }

    /**
     * 获取mutifile.html 页面
     */
    @RequestMapping("multifile")
    public String multifile(){
        return "/mutifile";
    }

    /**
     * 多文件上传
     * @param request
     * @return
     */
    @ResponseBody
    @RequestMapping(value="multifileUpload",method=RequestMethod.POST)
    public  String multifileUpload(HttpServletRequest request){

        List<MultipartFile> files = ((MultipartHttpServletRequest)request).getFiles("fileName");
        if(files.isEmpty()){
            return "文件为空";
        }

        for(MultipartFile file :files){
            String fileName = file.getOriginalFilename();
            int size = (int) file.getSize();
            System.out.println(fileName +"-->"+ size);

            if(file.isEmpty()){
                return "文件为空";
            }else{
                File dest = new File(path+"/"+ fileName);
                if(!dest.getParentFile().exists()){
                    dest.getParentFile().mkdir();
                }

                try{
                    file.transferTo(dest);
                }catch(Exception e){
                    e.printStackTrace();
                    return "文件上传失败";
                }
            }
        }
       return  "文件上传成功";
    }


    @RequestMapping(value = "/download", method = RequestMethod.GET)
    public String Download() {
        return "/filedownload";
    }

    @RequestMapping(value = "/downfile",method = RequestMethod.GET)
    public  String  downloadFile(HttpServletResponse response){
        String fileName = path + "3.txt";
        logger.info("下载的文件名"+fileName);

        String suffixName = fileName.substring(fileName.lastIndexOf("."));
        logger.info("下载的文件名后缀名"+suffixName);
        File file=new File(fileName);
        if(!file.exists()){
            return "下载的文件不存在！";
        }
        String result = FileUtil.downloadFile(response,fileName);
        System.out.println(result);
        return  result;
    }

}
