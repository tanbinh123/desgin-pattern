package com.harry.design.pattern.creational.abstractfactory.practice;

import com.harry.design.pattern.creational.factorymethod.practice.GIFReaderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

/**
 * create by： harry
 * date:  2019/7/28 0028
 **/
public class XmlUtil {

    public static Object getBean(){
        try {
            // 1.创建 DOM 文档对象
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder =   documentBuilderFactory.newDocumentBuilder();
            Document document = documentBuilder.parse(new File("src/main/resources/pattern/creational/abstractfactory-config.xml"));

            // 2.获取包含类名的文本节点
            NodeList classNameList = document.getElementsByTagName("className");
            Node firstChild = classNameList.item(0).getFirstChild();
            String className = firstChild.getNodeValue();

            // 3.通过类目生成实例对象并返回
            Class<?> clazz = Class.forName(className);
            Object object = clazz.newInstance();
            return  object;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
