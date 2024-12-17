package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.example.demo.pojo.User;

// import jakarta.servlet.http.HttpServletRequest;

@RestController
public class RequestController {

    /*
     * 简单参数处理方式
     * 
     * 需求2：定义simpleParam方法，使用SpringBoot完成简单参数接收
     * 1：参数名与形参变量名相同，定义形参即可接受参数
     * 2：类型可以自动类型转换，基本类型需要使用包装类类型接受
     * 3：如果方法形参名称与请求参数名称不匹配，可以使用@RequestParam 完成映射
     */
    @RequestMapping("/simpleParam")
    public String simpleParam(@RequestParam("username") String name, Integer age) {
        System.out.println(name + "--" + age);
        return "ok";
    }

    /*
     * 简单实体对象案例
     * 
     * 注意：简单实体对象：前端传入参数名与POJO属性名相同，定义POJO接收即可
     * 需求3：定义User类，User类中包含name和age属性
     * 定义simplePojo方法，使用简单实体对象接受前端数据
     */
    @RequestMapping("/simplePojo")
    public String simplePojo(User user) {
        System.out.println(user);
        return "ok";
    }

    /*
     * 复杂实体对象案例
     * 
     * 注意：复杂实体对象：请求参数名与形参对象属性名相同，按照对象层级结构关系即可接收嵌套POJO属性参数
     * 需求4：定义User类和Address类，User类中包含name和age，address属性，Address类包含province和city属性
     * 定义complexPojo方法，使用复杂实体对象接收前端参数数据
     */

    @RequestMapping("/complexPojo")
    public String complexPojo(User user) {
        System.out.println(user);
        return "ok";
    }

    /*
     * 数组参数：请求参数为多个且参数的键是相同的，定义数组类型形参即可接收参数
     * 
     * 需求5： 定义arrayParam方法，使用数组接受前端参数数据
     */

    @RequestMapping("/arrayParam")
    public String arrayParam(String[] hobby) {
        System.out.println(Arrays.toString(hobby));
        return "ok";
    }

    /*
     * 集合参数：请求参数为多个且参数的键是相同的，使用集合参数接受并使用@RequestParam 绑定参数关系
     * 
     * 需求6：定义ListParam方法，使用参数接受前端参数数据
     */

    @RequestMapping("/listParam")
    public String arrayParam(@RequestParam List<String> hobby) {
        System.out.println(hobby);
        return "ok";
    }

    /*
     * JSON参数： 请求参数是JSON数据，使用POJO类型接收参数，需使用@RequestBody标识
     * 
     * 需求8：定义jsonParam方法，使用实体类对象接受前端参数数据
     */

    @RequestMapping("/jsonParam")
    public String jsonParam(@RequestBody User user){
        System.out.println(user);
        return "ok";
    }

    /*
     * 路径参数：通过请求URL直接传递参数，使用{...}来标识该路径参数，需要使用@PathVariable获取路径参数
     * 
     * 需求9：定义PathParam方法，使用{...}来接收传递过来的参数
     */
    
     @RequestMapping("/PathParam/{id}/{id2}/{name}")
     public String pathParam(@PathVariable Integer id, @PathVariable Integer id2, @PathVariable String name){
        System.out.println(id);
        System.out.println(id2);
        System.out.println(name);
        return "ok";
     }



}
