package com.hlc.sell.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.List;

@Controller
public class FileUploadController {

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
            return "false";
        }
        String fileName = file.getOriginalFilename();
        int size = (int)file.getSize();
        System.out.println(fileName+"-->"+size);

        String path = "D:/sellImages";
        File dest = new File(path +"/"+ fileName);
        if(!dest.getParentFile().exists()){
            //判断文件父目录是否存在
            dest.getParentFile().mkdir();
        }
        try{
            file.transferTo(dest);//保存文件
            return "true";
        }catch(IllegalStateException e){
            e.printStackTrace();
            return "false";
        }catch (Exception e){
            e.printStackTrace();
            return "false";
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
            return "false";
        }

        String path = "D:/sellImages";
        for(MultipartFile file :files){
            String fileName = file.getOriginalFilename();
            int size = (int) file.getSize();
            System.out.println(fileName +"-->"+ size);

            if(file.isEmpty()){
                return "false";
            }else{
                File dest = new File(path+"/"+ fileName);
                if(!dest.getParentFile().exists()){
                    dest.getParentFile().mkdir();
                }

                try{
                    file.transferTo(dest);
                }catch(Exception e){
                    e.printStackTrace();
                    return "false";
                }
            }
        }
       return  "true";
    }

}
